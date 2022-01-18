package me.mingshan.markdown4j.type.element;

import lombok.Builder;
import lombok.Data;
import me.mingshan.markdown4j.encoder.element.ElementEncoder;
import me.mingshan.markdown4j.encoder.element.ElementEncoderFactory;

/**
 * 图片元素：
 *
 * <pre>
 *     ![](https://pandao.github.io/editor.md/examples/images/4.jpg)
 * </pre>
 *
 * @author hanjuntao
 * @date 2022/1/17
 */
@Builder
@Data
public class ImageElement implements Element {
    private String imageUrl;

    @Override
    public String toMd() {
        ElementEncoder encoder = ElementEncoderFactory.getEncoder(ElementType.IMAGE);
        return encoder.encode(this);
    }

    @Override
    public ElementType getType() {
        return ElementType.IMAGE;
    }

}
