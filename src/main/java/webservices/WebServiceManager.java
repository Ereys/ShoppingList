package webservices;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import javax.naming.OperationNotSupportedException;

public class WebServiceManager {
	
	private URL baseUrl;
	private HttpURLConnection con;
	
	private static WebServiceManager wsc= null;
	
	private WebServiceManager() {};
	
	public static WebServiceManager getInstance() {
		if(wsc == null) wsc = new WebServiceManager();
		return wsc;
	}
	
	private void connect() {
		try {
			this.baseUrl = new URL(BaseUrl.BASE_URL_GATEWAY);
			this.con = (HttpURLConnection) this.baseUrl.openConnection();
		}catch(Exception ioe) {
			System.out.println(ioe);
		}
	}
	
	public void disconnect() {
		this.con.disconnect();
	}
	
	public String get() {
		try {
			this.connect();
			this.con.setRequestMethod("GET");
			con.setRequestProperty("Content-Type", "application/json");
			return readResponse();
		}catch(Exception ioe) {
			System.out.println(ioe);
			return null;
		}
	}
	
	public String post(){
		return "null";
	}
	
	public String readResponse() {
		try {
			BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
			String inputLine;
			StringBuffer content = new StringBuffer();
			while ((inputLine = in.readLine()) != null) {
			    content.append(inputLine);
			}
			in.close();
			this.disconnect();
			
			return content.toString();
		}catch(Exception ioe) {
			System.out.println(ioe);
			return null;
		}
	}
	
	public void setUrl(String newUrl) {
		try {
			this.baseUrl = new URL(newUrl);
		}catch(Exception ioe) {
			System.out.println(ioe);
		}
	}
}
