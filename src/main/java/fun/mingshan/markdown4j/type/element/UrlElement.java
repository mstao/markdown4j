package fun.mingshan.markdown4j.type.element;

import lombok.Builder;
import lombok.Data;
import fun.mingshan.markdown4j.encoder.element.ElementEncoder;
import fun.mingshan.markdown4j.encoder.element.ElementEncoderFactory;

/**
 * <pre>
 *     [普通链接](http://localhost/)
 * </pre>
 *
 * @author hanjuntao
 * @date 2022/1/17
 */
@Builder
@Data
public class UrlElement implements Element {
    private String tips;
    private String url;

    @Override
    public String toMd() {
        ElementEncoder encoder = ElementEncoderFactory.getEncoder(ElementType.URL);
        return encoder.encode(this);
    }

    @Override
    public ElementType getType() {
        return ElementType.URL;
    }
}
