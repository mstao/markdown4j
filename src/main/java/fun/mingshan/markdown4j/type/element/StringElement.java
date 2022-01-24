package fun.mingshan.markdown4j.type.element;

import lombok.Builder;
import lombok.Data;

/**
 * @author hanjuntao
 * @date 2022/1/18
 */
@Builder
@Data
public class StringElement implements Element {
    private String content;

    @Override
    public String toMd() {
        return this.content;
    }

    @Override
    public ElementType getType() {
        return ElementType.STRING;
    }
}
