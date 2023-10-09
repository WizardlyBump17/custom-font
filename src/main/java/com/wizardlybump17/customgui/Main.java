package com.wizardlybump17.customgui;

import com.wizardlybump17.customgui.font.provider.Provider;
import com.wizardlybump17.customgui.image.Image;
import lombok.NonNull;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.List;

public class Main {

    public static void main(String[] args) throws Exception {
        File file = new File(Main.class.getClassLoader().getResource("test.png").toURI());
        Image image = new Image(
                Provider.bitmap()
                        .file(file.getAbsolutePath())
                        .chars(List.of(
                                "abcdefgh",
                                "ijklmnop",
                                "qrstuvwx"
                        ))
                        .build()
        );

        List<@NonNull BufferedImage> images = image.getImages();
        for (int i = 0; i < images.size(); i++) {
            ImageIO.write(images.get(i), "png", new File(file.getParent(), + i + ".png"));
        }
    }
}
