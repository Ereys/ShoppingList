package webservices;

import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.util.Scanner;

public class RequestHandler {
	
	public String get(String url) {
			WebServiceManager.getInstance().setUrl(url);
			WebServiceManager.getInstance().connect();
			HttpURLConnection con = WebServiceManager.getInstance().getConnection();
		try {
			
			con.setRequestMethod("GET");
			con.setRequestProperty("Content-Type", "application/json");
			
			if(con.getResponseCode() != 200) {
				throw new Exception("Erreur http : " + con.getResponseCode());
			}
			
			return this.readResponse();
		}catch(Exception ioe) {
			System.out.println("WebServiceManager get : " + ioe);
			return null;
		}
	}
	
	public String post(String url, String objectToPost){
		
		WebServiceManager.getInstance().setUrl(url);
		WebServiceManager.getInstance().connect();
		HttpURLConnection con = WebServiceManager.getInstance().getConnection();
		try {
		con.setRequestMethod("POST");
		con.setRequestProperty("Content-Type", "application/json");
		con.setRequestProperty("Accept", "application/json");
		con.setDoOutput(true);
		
		OutputStream os = con.getOutputStream();
		os.write(objectToPost.getBytes("UTF-8"));
		os.close();
		return this.readResponse();
		}catch(Exception ioe) {
			System.out.println("WebServiceManager post : " + ioe);
			return null;
		}
	}
	
	public String readResponse() {
		HttpURLConnection con = WebServiceManager.getInstance().getConnection();
		try {
			Scanner scanner = new Scanner(con.getInputStream());
			StringBuilder content = new StringBuilder();
			while (scanner.hasNextLine()) {
			    content.append(scanner.nextLine());
			}
			scanner.close();
			return content.toString();
		}catch(Exception ioe) {
			System.out.println("readResponse " + ioe);
			return null;
		}finally {
			WebServiceManager.getInstance().disconnect();
		}
	}
}
