package me.mingshan.markdown4j.type.element;

import me.mingshan.markdown4j.type.block.StringBlock;

/**
 * 元素
 *
 * @author hanjuntao
 * @date 2022/1/17
 */
public interface Element {
    String toMd();

    ElementType getType();

    default StringBlock toBlock() {
        return StringBlock.builder().content(toMd()).build();
    }
}
