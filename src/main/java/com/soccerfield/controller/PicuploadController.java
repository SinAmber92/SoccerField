package com.soccerfield.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.soccerfield.service.UserService;
import com.soccerfield.utils.Response;

/**
 * 
 * Title:PicuploadController
 * 
 * @author SinAmber Feng
 * @date 2018年4月3日上午11:03:04
 *
 */
@Controller
@RequestMapping("/pic")
public class PicuploadController {
	
	@Resource
	public UserService userService;
	
	
	//测试
	@RequestMapping("/test")
	public String test(){
		System.out.println("lalala");
		return "a";
		
	}
	
	
/*	//获取照片
	@RequestMapping("/uploadImg.html")
	@ResponseBody
	public String uploadImg(@RequestParam(value="file",required=false)MultipartFile file,
		    HttpServletRequest request){

		        File targetFile=null;
		        String msg="";//返回存储路径
		        int code=1;
		        String fileName=file.getOriginalFilename();//获取文件名加后缀
		        if(fileName!=null&&fileName!=""){   
		            String returnUrl = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + request.getContextPath() +"/upload/imgs/";//存储路径
		            String path = request.getSession().getServletContext().getRealPath("upload/imgs"); //文件存储位置
		            String fileF = fileName.substring(fileName.lastIndexOf("."), fileName.length());//文件后缀
		            fileName=new Date().getTime()+"_"+new Random().nextInt(1000)+fileF;//新的文件名

		            
		            //先判断文件是否存在
		            String fileAdd = DateUtil.format(new Date(),"yyyyMMdd");
		            File file1 =new File(path+"/"+fileAdd); 
		            //如果文件夹不存在则创建    
		            if(!file1 .exists()  && !file1 .isDirectory()){       
		                file1 .mkdir();  
		            }
		            targetFile = new File(file1, fileName);
//		          targetFile = new File(path, fileName);
		            try {
		                file.transferTo(targetFile);
//		              msg=returnUrl+fileName;
		                msg=returnUrl+fileAdd+"/"+fileName;
		                code=0;
		            } catch (Exception e) {
		                e.printStackTrace();
		            }
		        }
		        return msg;
		    }*/
	
	//自己写获取图片
	@RequestMapping("/icon")
	@ResponseBody
	public String uploadPicture(String formData, HttpServletRequest request){
		System.out.println("lalala");
		System.out.println(formData);
		
		return "控制器";
	}
	
	
	@RequestMapping("/upload")
	@ResponseBody
	private String upLoadIcon() {
		File file = new File("C:\\Users\\Administrator\\Desktop\\JOKER.jpg");
		String path = Response.class.getClassLoader().getResource("").getPath()+"icons/"+file.getName();
//		System.out.println(Response.class.getClassLoader().getResource("").getPath());
		File refile = new File(path);
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			fis = new FileInputStream(file);
			fos = new FileOutputStream(refile);
			byte[] buf = new byte[1024];
			while(fis.read(buf) != -1) {
				fos.write(buf);
			}
			return path;
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
		return null;
	}

	@ResponseBody
    @RequestMapping("getpic")
    public String getpic(@RequestParam(value = "file", required = false)File file,
            HttpServletRequest request) { 
		
        if (file.exists()) {
        	
        	String fileName = file.getName();
            String path = Response.class.getClassLoader().getResource("").getPath()+"/icons"+fileName;
            
            File refile = new File(path);
    		FileInputStream fis = null;
    		FileOutputStream fos = null;
    		try {
    			fis = new FileInputStream(file);
    			fos = new FileOutputStream(refile);
    			byte[] buf = new byte[1024];
    			while(fis.read(buf) != -1) {
    				fos.write(buf);
    			}
    			return path;
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
        return null;
	}
	
		//form表单方式提交上传文件要点：
		//1.提交方式必须是post提交方式
		//2.form标签的 属性enctype="multipart/form-data"必须要有
		@ResponseBody
	    @RequestMapping(value="/getpic4",method = RequestMethod.POST)
	    public void getpic4(@RequestParam(value="file") MultipartFile file) {
			
	        if (!file.isEmpty()) {
	            String path =Response.class.getClassLoader().getResource("").getPath()+"icons/"+file.getOriginalFilename();
	            try {
					file.transferTo(new File(path));
				} catch (IllegalStateException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
	        }
		}
	
	
}
