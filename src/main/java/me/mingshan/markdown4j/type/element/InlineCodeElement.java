package me.mingshan.markdown4j.type.element;

import lombok.Builder;
import lombok.Data;
import me.mingshan.markdown4j.encoder.element.ElementEncoder;
import me.mingshan.markdown4j.encoder.element.ElementEncoderFactory;
import me.mingshan.markdown4j.type.block.StringBlock;

/**
 * @author hanjuntao
 * @date 2022/1/18
 */
@Builder
@Data
public class InlineCodeElement implements Element {
    private String content;

    @Override
    public String toMd() {
        ElementEncoder encoder = ElementEncoderFactory.getEncoder(ElementType.INLINE_CODE);
        return encoder.encode(this);
    }

    @Override
    public ElementType getType() {
        return ElementType.INLINE_CODE;
    }

}
