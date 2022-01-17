package me.mingshan.markdown4j.type.block;

/**
 * 块的概念，代表markdown 一块元素
 * <p>
 * 例如：
 * <p>
 * 1. 代码块
 * <pre>
 *     ```java
 *     ccccc
 *     ```
 * </pre>
 * <p>
 * 2. 一个标题
 * <pre>
 *     # 这是一个标题
 * </pre>
 *
 * @author hanjuntao
 * @date 2022/1/17
 */
public interface Block {
    BlockType getType();
}
