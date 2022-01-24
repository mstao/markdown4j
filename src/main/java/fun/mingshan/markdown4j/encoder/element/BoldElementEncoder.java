package fun.mingshan.markdown4j.encoder.element;

import fun.mingshan.markdown4j.type.element.BoldElement;
import fun.mingshan.markdown4j.type.element.Element;
import fun.mingshan.markdown4j.type.element.ElementType;

/**
 * @author hanjuntao
 * @date 2022/1/18
 */
public class BoldElementEncoder implements ElementEncoder {
    @Override
    public String encode(Element element) {
        BoldElement boldElement = (BoldElement) element;

        return "**" + boldElement.getContent() + "**";
    }

    @Override
    public ElementType getType() {
        return ElementType.BOLD;
    }
}
