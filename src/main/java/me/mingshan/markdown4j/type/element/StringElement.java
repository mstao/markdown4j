package me.mingshan.markdown4j.type.element;

/**
 * @author hanjuntao
 * @date 2022/1/18
 */
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
