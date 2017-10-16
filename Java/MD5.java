import java.io.BufferedReader;
import java.io.FileReader;
import java.security.MessageDigest;
public class MD5 {

	public static void main(String[] args) throws Exception {
		String current = new java.io.File( "." ).getCanonicalPath();
        System.out.println("Current dir:"+current);
		//File file = new File("passworddictionary.txt");
		FileReader fr = new FileReader(current + "/passworddictinary.txt");
		BufferedReader br = new BufferedReader(fr);

		String line;
		String temp;
		String hash = "79bb8d29bad9c9534b5b0d154febf0cec5efbdb9d15821bb6675af2636a061d2";
		boolean check = true;
		MessageDigest digest = MessageDigest.getInstance("MD5");
		byte[] data;

		while ((line = br.readLine()) != null && check) {
			data = line.getBytes();
			temp = ba2string( digest.digest(data) );
			if (temp.equals(hash)) {
				System.out.println(line);
				check = false;
				break;
			}
		}
		br.close();
		br = new BufferedReader(new FileReader(current + "/passworddictinary.txt"));
		digest = MessageDigest.getInstance("SHA-1");

		while ((line = br.readLine()) != null && check) {
			data = line.getBytes();
			temp = ba2string( digest.digest(data) );
			if (temp.equals(hash)) {
				System.out.println(line);
				check = false;
				break;
			}
		}

		br.close();
		br = new BufferedReader(new FileReader(current + "/passworddictinary.txt"));
		digest = MessageDigest.getInstance("SHA-256");

		while ((line = br.readLine()) != null && check) {
			data = line.getBytes();
			temp = ba2string( digest.digest(data) );
			if (temp.equals(hash)) {
				System.out.println(line);
				check = false;
				break;
			}
		}

		br.close();
		br = new BufferedReader(new FileReader(current + "/passworddictinary.txt"));
		digest = MessageDigest.getInstance("SHA-384");

		while ((line = br.readLine()) != null && check) {
			data = line.getBytes();
			temp = ba2string( digest.digest(data) );
			if (temp.equals(hash)) {
				System.out.println(line);
				check = false;
				break;
			}
		}

		br.close();
		br = new BufferedReader(new FileReader(current + "/passworddictinary.txt"));
		digest = MessageDigest.getInstance("SHA-512");

		while ((line = br.readLine()) != null && check) {
			data = line.getBytes();
			temp = ba2string( digest.digest(data) );
			if (temp.equals(hash)) {
				System.out.println(line);
				check = false;
				break;
			}
		}
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