package me.mingshan.markdown4j.type.element;

/**
 * 元素
 *
 * @author hanjuntao
 * @date 2022/1/17
 */
public interface Element {
    String toMd();

    ElementType getType();
}
