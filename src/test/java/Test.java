import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import org.json.JSONObject;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.soccerfield.utils.Response;

public class Test {

	/**********************************上传头像部分未完****************************************/
	//上传头像
	@RequestMapping("/icon")
	@ResponseBody
	public Response login(String icon){
				
		Response response = new Response();
		JSONObject json = new JSONObject(icon);
		json.getJSONObject(icon);
		

		return response;
	}
	
	//上传文件
	private String uploadFile(File file){
		
		String path = Response.class.getClassLoader().getResource("").getPath()+"icon/"+file.getName();
//		System.out.println(Response.class.getClassLoader().getResource("").getPath());
		File copyFile = new File(path);
		
		InputStream fis = null;
		OutputStream fos = null;
		
		try {
			fis = new FileInputStream(file);
			fos = new FileOutputStream(copyFile);
			byte[] buff = new byte[20];//1024的倍数
			while(fis.read(buff)!=-1){
				fos.write(buff);
			}
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
		
		return path;
	}
	
	//下载图片
	private File downLoadIcon(String path) {
		return new File(path);
	}

}
