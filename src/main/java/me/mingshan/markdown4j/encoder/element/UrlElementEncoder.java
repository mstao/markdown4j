package me.mingshan.markdown4j.encoder.element;

import me.mingshan.markdown4j.type.element.Element;
import me.mingshan.markdown4j.type.element.ElementType;
import me.mingshan.markdown4j.type.element.UrlElement;

/**
 * @author hanjuntao
 * @date 2022/1/18
 */
public class UrlElementEncoder implements ElementEncoder {
    @Override
    public String encode(Element element) {
        UrlElement urlElement = (UrlElement) element;

        String url = urlElement.getUrl();
        String tips = urlElement.getTips();

        String result = "[";
        if (tips != null) {
            result += tips;
        }

        result += "](" + url + ")";

        return result;
    }

    @Override
    public ElementType getType() {
        return null;
    }
}
