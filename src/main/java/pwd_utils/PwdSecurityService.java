package pwd_utils;

import java.util.Base64;
import java.util.Base64.Encoder;

public class PwdSecurityService {
	
	public String encode(String text) {
		Encoder encoder = Base64.getEncoder();
		String encodeToString = encoder.encodeToString(text.getBytes());
		return encodeToString;
	}





	// fixing bug-122
	public String greet(){

		// bug fixing completed
	}


// fixing bu -121
 public String welocomwe(){

	// logic 
 }


// fixing bud-132

public String m2(){
	// logic
}




// fixing  bug - 131
 public String m1(){
	// logic 
 }





}
