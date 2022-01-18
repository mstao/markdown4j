package me.mingshan.markdown4j.type.element;

import lombok.Builder;
import lombok.Data;
import me.mingshan.markdown4j.encoder.element.ElementEncoder;
import me.mingshan.markdown4j.encoder.element.ElementEncoderFactory;

/**
 * 斜体
 *
 * <pre>
 *     _斜体字_
 * </pre>
 *
 * @author hanjuntao
 * @date 2022/1/18
 */
@Builder
@Data
public class ItalicElement implements Element {
    private String content;

    @Override
    public String toMd() {
        ElementEncoder encoder = ElementEncoderFactory.getEncoder(ElementType.ITALIC);
        return encoder.encode(this);
    }

    @Override
    public ElementType getType() {
        return ElementType.ITALIC;
    }

}
