package pwd_utils;

import java.util.Base64;
import java.util.Base64.Encoder;

public class PwdSecurityService {
	
	public String encode(String text) {
		Encoder encoder = Base64.getEncoder();
		String encodeToString = encoder.encodeToString(text.getBytes());
		return encodeToString;
	}

   // fixing bug -123
	public String greet(){
		return "Good Morning";
	}
	
     // fixing bug -122

	 public String welcome(){
		return "Welcome";
	 }
}
