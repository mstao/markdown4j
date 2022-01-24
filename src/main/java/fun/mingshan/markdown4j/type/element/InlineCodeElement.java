package fun.mingshan.markdown4j.type.element;

import fun.mingshan.markdown4j.encoder.element.ElementEncoderFactory;
import lombok.Builder;
import lombok.Data;
import fun.mingshan.markdown4j.encoder.element.ElementEncoder;

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
