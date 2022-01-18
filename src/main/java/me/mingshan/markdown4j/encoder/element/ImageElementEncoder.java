package me.mingshan.markdown4j.encoder.element;

import me.mingshan.markdown4j.type.element.Element;
import me.mingshan.markdown4j.type.element.ElementType;
import me.mingshan.markdown4j.type.element.ImageElement;

/**
 * @author hanjuntao
 * @date 2022/1/18
 */
public class ImageElementEncoder implements ElementEncoder {
    @Override
    public String encode(Element element) {
        ImageElement imageElement = (ImageElement) element;

        String imageUrl = imageElement.getImageUrl();
        return "![](" + imageUrl + ")";
    }

    @Override
    public ElementType getType() {
        return ElementType.IMAGE;
    }
}
