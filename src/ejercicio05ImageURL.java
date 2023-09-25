import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

public class ejercicio05ImageURL {
    public static void main (String[] args){
        String imageUrl = "https://static.wikia.nocookie.net/mushokutensei/images/e/ec/MT-AN-S2-Rudeus-Uniform-FullBody.png/revision/latest?cb=20230804000750";

        try {
            URL url = new URL(imageUrl);
            BufferedImage image = ImageIO.read(url);

            if (image != null){
                int width = image.getWidth();
                int height = image.getHeight();

                double aspectRatio = (double) width/height;

                System.out.println("ancho: "+width);
                System.out.println("largo: "+height);
                System.out.println("aspect ratio: "+aspectRatio);
            } else {
                System.out.println("no se pudo cargar la imagen");
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
