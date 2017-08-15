package ch03.sec06;


import java.awt.Color;
import java.awt.image.BufferedImage;

public class PixelFunctionTest {

    public static void main(String[] args) {

        BufferedImage frenchFlag;

        frenchFlag = createImage(150, 100,
                new PixelFunction() {
                    @Override
                    public Color apply(int x, int y) {
                        return (x < 50) ?
                                Color.BLUE : ((x < 100) ? Color.WHITE : Color.RED);
                    }
                });

        frenchFlag = createImage(150, 100,
                (x, y) -> (x < 50) ?
                        Color.BLUE : ((x < 100) ? Color.WHITE : Color.RED));
    }

    public static BufferedImage createImage(int width, int height,
                                            PixelFunction pixelFunction) {

        BufferedImage bufferedImage =
                new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);

        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {

                Color color = pixelFunction.apply(x, y);
                bufferedImage.setRGB(x, y, color.getRGB());
            }
        }

        return bufferedImage;
    }
}

