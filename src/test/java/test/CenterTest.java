package test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.soccerfield.dao.AreaMapper;
import com.soccerfield.dao.OrderlistMapper;
import com.soccerfield.dao.StadiumMapper;
import com.soccerfield.dao.UserMapper;
import com.soccerfield.entity.Area;
import com.soccerfield.entity.Orderlist;
import com.soccerfield.entity.Stadium;
import com.soccerfield.service.AreaService;
import com.soccerfield.service.OrderlistService;
import com.soccerfield.service.StadiumService;
import com.soccerfield.service.UserService;
import com.soccerfield.utils.Response;


@RunWith(SpringJUnit4ClassRunner.class)
//告诉junit spring配置文件
@ContextConfiguration("classpath:spring-mybatis.xml")   
public class CenterTest {

	@Resource
	private OrderlistMapper orderlistmapper;
	@Resource
	private AreaMapper areamapper;
	@Resource
	private StadiumMapper stadiummapper;
	@Resource
	private UserMapper usermapper;
	
	@Resource
	private AreaService areaservice;
	@Resource
	private OrderlistService orderlistservice;
	@Resource
	private StadiumService stadiumservice;
	@Resource
	private UserService userservice;
	
	
	@Test
	public void aaa() {
		Integer areaid = 1;
		String date = "20180315";
		List<Map<String, Object>> response = new ArrayList<Map<String,Object>>();
		
		//		int areaid = 4;					//区域ID
//		String date = "20180315";		//日期字符串--YYYYMMDD
		int staid = areamapper.selectByPrimaryKey(areaid).getStaid();
		Stadium stadium = stadiummapper.selectByPrimaryKey(staid);
		//传入参数设置：
		int staopentime = Integer.parseInt(stadium.getStaopentime().substring(0, 2));	//球场开门时间
		int staclosetime = Integer.parseInt(stadium.getStaclosetime().substring(0, 2));	//球场关门时间
		String staunittime = stadium.getStaunittime();									//球场每场球赛时间
		//将staunittime字符串做int转型处理
		int staunithour = Integer.parseInt(staunittime.substring(0, 1));
		int staunitmin = Integer.parseInt(staunittime.substring(2, 3));
		//获取到所有预订该区域的订单信息
		List<Orderlist> orders = orderlistmapper.selectByAreaidAndDate(areaid, date);
		List<String> orderedTimes = new ArrayList<String>();
		//向response里添加所有营业时间
		for (int i = staopentime;; i++) {
			if (i == staclosetime) {
				Map<String, Object> time = new HashMap<String, Object>();
				time.put("date", i+":00");
				time.put("status", true);
				response.add(time);
				break;
			}
			Map<String, Object> time1 = new HashMap<String, Object>();
			time1.put("date", i+":00");
			time1.put("status", true);
			response.add(time1);
			Map<String, Object> time2 = new HashMap<String, Object>();
			time2.put("date", i+":30");
			time2.put("status", true);
			response.add(time2);
		}
		//获取所有该区域被预定的起始时间
		for (int i = 0; i < orders.size(); i++) {
			Orderlist orderlist = orders.get(i);
			String orestarttime = orderlist.getOrestarttime();
			String orestarthour = orestarttime.substring(8,10);
			String orestartmin = orestarttime.substring(10,12);
			orderedTimes.add(orestarthour+":"+orestartmin);
		}
		//将response中所有不可选的时间对应的状态属性设置成false
		for (int i = 0; i < orderedTimes.size(); i++) {
			int orderedHour = Integer.parseInt(orderedTimes.get(i).substring(0, 2));
			int orderedMin = Integer.parseInt(orderedTimes.get(i).substring(3, 5));
			for (int j = orderedHour-staunithour; j<=orderedHour+staunithour && j>=orderedHour-staunithour; j++) {
				if (j==orderedHour-staunithour && orderedMin==0) {
					if (staunitmin==0) {
						for (int k = 0; k < response.size(); k++) {
							if (response.get(k).get("date").equals(j+":30")) {
								response.get(k).put("status", false);
							}
						}
						continue;
					} else {
						for (int k = 0; k < response.size(); k++) {
							if (response.get(k).get("date").equals(j+":00")) {
								response.get(k).put("status", false);
							}
							if (response.get(k).get("date").equals(j+":30")) {
								response.get(k).put("status", false);
							}
						}
						continue;
					}
				} else if (j==orderedHour-staunithour && orderedMin!=0) {
					if (staunitmin==0) {
						continue;
					} else {
						for (int k = 0; k < response.size(); k++) {
							if (response.get(k).get("date").equals(j+":30")) {
								response.get(k).put("status", false);
							}
						}
						continue;
					}
				}
				if (j==orderedHour+staunithour && orderedMin==0) {
					if (staunitmin==0) {
						break;
					} else {
						for (int k = 0; k < response.size(); k++) {
							if (response.get(k).get("date").equals(j+":00")) {
								response.get(k).put("status", false);
							}
						}
						break;
					}
				} else if (j==orderedHour+staunithour && orderedMin!=0) {
					if (staunitmin==0) {
						for (int k = 0; k < response.size(); k++) {
							if (response.get(k).get("date").equals(j+":00")) {
								response.get(k).put("status", false);
							}
						}
						break;
					} else {
						for (int k = 0; k < response.size(); k++) {
							if (response.get(k).get("date").equals(j+":00")) {
								response.get(k).put("status", false);
							}
							if (response.get(k).get("date").equals(j+":30")) {
								response.get(k).put("status", false);
							}
						}
						break;
					}
				}
				for (int k = 0; k < response.size(); k++) {
					if (response.get(k).get("date").equals(j+":00")) {
						response.get(k).put("status", false);
					}
					if (response.get(k).get("date").equals(j+":30")) {
						response.get(k).put("status", false);
					}
				}
			}
		}
		for (Map<String, Object> time : response) {
			System.out.println("date:"+time.get("date")+"---status:"+time.get("status"));
		}
	}
	
	@Test
	public void bbb() {
		int staid = areamapper.selectByPrimaryKey(4).getStaid();
		Stadium stadium = stadiummapper.selectByPrimaryKey(staid);
		int staopentime = Integer.parseInt(stadium.getStaopentime().substring(0, 2));
		String staunittime = stadium.getStaunittime();
		System.out.println(staopentime);
		System.out.println(staunittime);
	}
	
	
	@Test
	public void ccc() {
		
		Integer areaid = 1;
		String date = "20180315";
		int staid = areamapper.selectByPrimaryKey(areaid ).getStaid();
		Stadium stadium = stadiummapper.selectByPrimaryKey(staid);
		
		//传入参数设置：
		int staopentime = Integer.parseInt(stadium.getStaopentime().substring(0, 2));	//球场开门时间
		int staclosetime = Integer.parseInt(stadium.getStaclosetime().substring(0, 2));	//球场关门时间
		String staunittime = stadium.getStaunittime();									//球场每场球赛时间
//		int areaid = 4;					//区域ID
//		String date = "20180315";		//日期字符串--YYYYMMDD
		
		
		//将staunittime字符串做int转型处理
		int staunithour = Integer.parseInt(staunittime.substring(0, 1));
		int staunitmin = Integer.parseInt(staunittime.substring(2, 3));
		//获取到所有预订该区域的订单信息
		List<Orderlist> orders = orderlistmapper.selectByAreaidAndDate(areaid, date);
		List<String> choiceTimes = new ArrayList<String>();
		List<String> orderedTimes = new ArrayList<String>();
		//向choiceTimes里添加所有营业时间
		for (int i = staopentime;; i++) {
			if (i == staclosetime) {
				choiceTimes.add(i+":00");
				break;
			}
			choiceTimes.add(i+":00");
			choiceTimes.add(i+":30");
		}
		//获取所有该区域被预定的起始时间
		for (int i = 0; i < orders.size(); i++) {
			Orderlist orderlist = orders.get(i);
			String orestarttime = orderlist.getOrestarttime();
			String orestarthour = orestarttime.substring(8,10);
			String orestartmin = orestarttime.substring(10,12);
			orderedTimes.add(orestarthour+":"+orestartmin);
		}
		//移除choiceTimes中所有不可选的时间
		for (int i = 0; i < orderedTimes.size(); i++) {
			int orderedHour = Integer.parseInt(orderedTimes.get(i).substring(0, 2));
			int orderedMin = Integer.parseInt(orderedTimes.get(i).substring(3, 5));
			for (int j = orderedHour-staunithour; j<=orderedHour+staunithour && j>=orderedHour-staunithour; j++) {
				if (j==orderedHour-staunithour && orderedMin==0) {
					if (staunitmin==0) {
						choiceTimes.remove(j+":30");
						continue;
					} else {
						choiceTimes.remove(j+":00");
						choiceTimes.remove(j+":30");
						continue;
					}
				} else if (j==orderedHour-staunithour && orderedMin!=0) {
					if (staunitmin==0) {
						continue;
					} else {
						choiceTimes.remove(j+":30");
						continue;
					}
				}
				if (j==orderedHour+staunithour && orderedMin==0) {
					if (staunitmin==0) {
						break;
					} else {
						choiceTimes.remove(j+":00");
						break;
					}
				} else if (j==orderedHour+staunithour && orderedMin!=0) {
					if (staunitmin==0) {
						choiceTimes.remove(j+":00");
						break;
					} else {
						choiceTimes.remove(j+":00");
						choiceTimes.remove(j+":30");
						break;
					}
				}
				choiceTimes.remove(j+":00");
				choiceTimes.remove(j+":30");
			}
		}
		for (String string : choiceTimes) {
			System.out.println(string);
		}
	}
	
	@Test
	public void ddd() {
		File file = new File("");
		File refile = new File(Response.class.getClassLoader().getResource("").getPath()+file.getName());
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			fis = new FileInputStream(file);
			fos = new FileOutputStream(refile);
			long time1 = new Date().getTime();
			byte[] buf = new byte[1024];
			while(fis.read(buf) != -1) {
				fos.write(buf);
			}
			long time2 = new Date().getTime();
			System.out.println("------------------------------"+(time2-time1));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (fis != null) {
					fis.close();
				}
				if (fos != null) {
					fos.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	@Test
	public void eee(){
		
		Area area = areaservice.getInfoByAreaid(2);
		System.out.println(area);
		
	}
	
	
}
