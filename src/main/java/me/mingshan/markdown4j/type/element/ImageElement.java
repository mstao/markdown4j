package me.mingshan.markdown4j.type.element;

/**
 * @author hanjuntao
 * @date 2022/1/17
 */
public class ImageElement implements Element {
    @Override
    public ElementType getType() {
        return ElementType.IMAGE;
    }
}
