import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HelloWorld {

	public static void main(String[] args) {
		
		String firstName = "";
		String lastName = "";
		
		try{
			BufferedReader reader = null;
			reader = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.println("Enter First Name: ");
			firstName = reader.readLine();
			System.out.println("Enter Last Name: ");
			lastName = reader.readLine();
			
			System.out.println(firstName + " " + lastName);
			
		}catch(IOException e){
			e.getStackTrace();
		}

	}

}
