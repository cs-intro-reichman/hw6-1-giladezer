import java.awt.Color;
public class Editor4{
    public static void main (String[] args){
        String fileName = args[0];

        Color[][] image = Runigram.read(fileName);
        Color[][] grayImage = Runigram.grayScaled(image);
        Runigram.display(grayImage);        
    }
}