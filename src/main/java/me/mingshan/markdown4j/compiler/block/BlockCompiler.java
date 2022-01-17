package me.mingshan.markdown4j.compiler.block;

import me.mingshan.markdown4j.type.block.Block;
import me.mingshan.markdown4j.type.block.BlockType;

/**
 * Block块编码器，将java代码编译成markdown 语法
 *
 * @author hanjuntao
 * @date 2022/1/17
 */
public interface BlockCompiler {
    /**
     * 编译
     *
     * @param block java代码
     * @return markdown语法字符串
     */
    String compile(Block block);

    /**
     * 返回块类型
     *
     * @return 块类型
     */
    BlockType getType();
}
