package utility;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Reader {
	
	private Reader(){
		// ensures that no reader object can be created
	}
	
	public static String getString(String message) throws IOException{
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println(message);
		return reader.readLine();
	}
}
