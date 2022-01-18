package me.mingshan.markdown4j.encoder.element;

import me.mingshan.markdown4j.type.element.Element;
import me.mingshan.markdown4j.type.element.ElementType;

/**
 * @author hanjuntao
 * @date 2022/1/18
 */
public interface ElementEncoder {
    /**
     * 编译
     *
     * @param element java代码
     * @return markdown语法字符串
     */
    String encode(Element element);

    /**
     * 返回元素类型
     *
     * @return 元素类型
     */
    ElementType getType();
}
