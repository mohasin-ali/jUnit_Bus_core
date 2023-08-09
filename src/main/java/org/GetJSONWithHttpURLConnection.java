package org;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class GetJSONWithHttpURLConnection {
	public static void io (String args) throws IOException{
		try {
			if(args!=null) {
				main(new String[] {args});
			}
			else {
				main(null);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main (String []args) throws IOException{
		//Change the URL with any other publicly accessible POST resource, which accepts JSON request body
		try {
			if(args==null || args.length==0) {
				args = new String[1];
				args[0] = "https://reqres.in/api/users?delay=1";
			}
			URL url = new URL (args[0]);
			
			HttpURLConnection con = (HttpURLConnection)url.openConnection();
			con.setRequestMethod("GET");
			con.addRequestProperty("User-Agent", "Mozilla/4.76"); 
			//con.setRequestProperty("Content-Type", "application/json; utf-8");
			con.setRequestProperty("Accept", "application/json");
			
			con.setDoOutput(true);
			
			int code = con.getResponseCode();
			System.out.println(code);
			
			try(BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream(), "utf-8"))){
				StringBuilder response = new StringBuilder();
				String responseLine = null;
				while ((responseLine = br.readLine()) != null) {
					response.append(responseLine.trim());
				}
				System.out.println(response.toString());
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}