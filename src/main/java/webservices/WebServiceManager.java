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
	
	public void connect() {
		try {
			this.con = (HttpURLConnection) this.baseUrl.openConnection();
		}catch(Exception ioe) {
			System.out.println(ioe);
		}
	}
	
	public void disconnect() {
		this.con.disconnect();
	}
	

	public HttpURLConnection getConnection() {
		return con;
	}


	public void setUrl(String newUrl) {
		try {
			this.baseUrl = new URL(newUrl);
		}catch(Exception ioe) {
			System.out.println(ioe);
		}
	}
}
