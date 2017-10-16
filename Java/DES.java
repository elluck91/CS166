import java.security.Key;
import java.util.Arrays;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public class DES {

	public static void main(String[] args) throws Exception {

		//Data and key
		byte[] k = {1,2,3,4,5,6,7,8};
		byte[] pt = "10851646".getBytes();

		//Encryption
		Cipher cipher = Cipher.getInstance("DES");
        Key key = new SecretKeySpec(k,"DES");
        cipher.init(Cipher.ENCRYPT_MODE ,key);
        byte[] ct = cipher.doFinal(pt);
        
		//Outputs
		System.out.println( Arrays.toString(pt) );
	}
}
