package me.mingshan.markdown4j.encoder.element;

import me.mingshan.markdown4j.type.element.Element;
import me.mingshan.markdown4j.type.element.ElementType;
import me.mingshan.markdown4j.type.element.ItalicElement;

/**
 * @author hanjuntao
 * @date 2022/1/18
 */
public class ItalicElementEncoder implements ElementEncoder {
    @Override
    public String encode(Element element) {
        ItalicElement italicElement = (ItalicElement) element;
        return "_" + italicElement.getContent() + "_";
    }

    @Override
    public ElementType getType() {
        return ElementType.ITALIC;
    }
}
