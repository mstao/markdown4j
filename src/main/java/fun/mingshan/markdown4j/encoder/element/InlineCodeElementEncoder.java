package fun.mingshan.markdown4j.encoder.element;

import fun.mingshan.markdown4j.type.element.Element;
import fun.mingshan.markdown4j.type.element.ElementType;
import fun.mingshan.markdown4j.type.element.InlineCodeElement;

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
