package me.mingshan.markdown4j.type.element;

import lombok.Data;
import me.mingshan.markdown4j.encoder.element.ElementEncoder;
import me.mingshan.markdown4j.encoder.element.ElementEncoderFactory;

/**
 * 加粗
 *
 * @author hanjuntao
 * @date 2022/1/18
 */
@Data
public class BoldElement implements Element {
    private String content;

    @Override
    public String toMd() {
        ElementEncoder encoder = ElementEncoderFactory.getEncoder(ElementType.BOLD);
        return encoder.encode(this);
    }

    @Override
    public ElementType getType() {
        return ElementType.BOLD;
    }
}
