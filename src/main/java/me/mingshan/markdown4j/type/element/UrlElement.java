package me.mingshan.markdown4j.type.element;

/**
 * @author hanjuntao
 * @date 2022/1/17
 */
public class UrlElement implements Element {
    @Override
    public ElementType getType() {
        return ElementType.URL;
    }
}
