import java.security.MessageDigest;

public class MD5 {

	public static void main(String[] args) throws Exception {
		byte[] data = "abcdefgh".getBytes();
		String temp;
		String hash = "419ee836f207c09d92566feaa14320d2";
		MessageDigest digest = MessageDigest.getInstance("MD5");
		Utils.printHex( digest.digest(data) );

		for (int i = 1; i < 64001; i++) {
			temp = Integer.toString(i);
			data = temp.getBytes();
			temp = ba2string( digest.digest(data) );
			if (temp.equals(hash)) {
				System.out.println(i);
				break;
			}
		}



		/*

		digest = MessageDigest.getInstance("SHA-1");
		Utils.printHex( digest.digest(data) );

		digest = MessageDigest.getInstance("SHA-256");
		Utils.printHex( digest.digest(data) );

		digest = MessageDigest.getInstance("SHA-384");
		Utils.printHex( digest.digest(data) );

		digest = MessageDigest.getInstance("SHA-512");
		Utils.printHex( digest.digest(data) );
		*/
	}

	public static String ba2string(byte[] ba) {
		StringBuffer hexString = new StringBuffer();
		   for (int i=0;i<ba.length;i++) {
		   String hex=Integer.toHexString(0xff & ba[i]);
		   if(hex.length()==1) hexString.append('0');
		     hexString.append(hex);
		   }
		   return hexString.toString();
	 }

}
