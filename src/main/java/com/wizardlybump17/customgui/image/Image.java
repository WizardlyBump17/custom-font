package com.wizardlybump17.customgui.image;

import com.wizardlybump17.customgui.font.provider.Bitmap;
import lombok.Data;
import lombok.NonNull;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Data
public class Image {

    private final @NonNull Bitmap font;
    private final @NonNull BufferedImage mainImage;
    private final @NonNull List<@NonNull BufferedImage> images;

    public Image(@NonNull Bitmap font) throws IOException {
        this.font = font;
        this.mainImage = ImageIO.read(new File(font.getFile()));
        images = createImages();
    }

    protected @NonNull List<@NonNull BufferedImage> createImages() {
        List<BufferedImage> output = new ArrayList<>();

        List<@NonNull String> chars = font.getChars();
        int verticalSplit = mainImage.getHeight() / chars.size();
        int horizontalSplit = mainImage.getWidth() / chars.get(0).length();

        for (int i = 0; i < chars.size(); i++)
            for (int j = 0; j < chars.get(i).length(); j++)
                output.add(mainImage.getSubimage(j * horizontalSplit, i * verticalSplit, horizontalSplit, verticalSplit));

        return output;
    }
}
