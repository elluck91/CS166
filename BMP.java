import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class BMP {
    public static void main(String[] args) throws IOException {
//    	File bmpFile = new File("alice_stego.bmp");
//    	BufferedImage image = ImageIO.read(bmpFile);
    	byte[] pt = Files.readAllBytes( Paths.get("alice_stego.bmp") );
    	String binaryString = "";
    	String temp;
    	int[] binaryCharacter = new int[8];
    	int size = 0;

    	for (int i = 0; i < 1200; i++) {
    		if (size < 8) {
    			temp = String.format("%8s", Integer.toBinaryString(pt[i] & 0xFF)).replace(' ', '0');
    			binaryCharacter[size] = temp.charAt(7);
    			size++;
    		}
    		if (size == 8) {
    			size = 0;
    			for (int a = 7; a >= 0; a--) {
					binaryString += Character.getNumericValue(binaryCharacter[a]);
				}
    			System.out.print("Output: "+ Integer.parseInt(binaryString,2) + " | Character: " + (char)Integer.parseInt(binaryString,2) + "\n");
    			binaryString = "";
    		}
    	}

    }
}