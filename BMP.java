import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import java.io.IOException;

public class BMP {
    public static void main(String[] args) throws IOException {
        File bmpFile = new File("alice_stego.bmp");
        BufferedImage image = ImageIO.read(bmpFile);
        System.out.print(image);
    }


}
