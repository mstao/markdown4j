package me.mingshan.markdown4j.encoder.element;

import me.mingshan.markdown4j.type.element.Element;
import me.mingshan.markdown4j.type.element.ElementType;
import me.mingshan.markdown4j.type.element.InlineCodeElement;
import me.mingshan.markdown4j.type.element.ItalicElement;

/**
 * @author hanjuntao
 * @date 2022/1/18
 */
public class InlineCodeElementEncoder implements ElementEncoder {
    @Override
    public String encode(Element element) {
        InlineCodeElement italicElement = (InlineCodeElement) element;
        return "`" + italicElement.getContent() + "`";
    }

    @Override
    public ElementType getType() {
        return ElementType.INLINE_CODE;
    }
}
