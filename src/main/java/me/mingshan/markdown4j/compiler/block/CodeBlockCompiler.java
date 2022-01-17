package me.mingshan.markdown4j.compiler.block;

import me.mingshan.markdown4j.constant.FlagConstants;
import me.mingshan.markdown4j.type.block.Block;
import me.mingshan.markdown4j.type.block.BlockType;
import me.mingshan.markdown4j.type.block.CodeBlock;

/**
 * 代码块编译
 *
 * @author hanjuntao
 * @date 2022/1/17
 */
public class CodeBlockCompiler implements BlockCompiler {
    @Override
    public String compile(Block block) {
        CodeBlock codeBlock = (CodeBlock) block;
        String language = codeBlock.getLanguage();

        String result = "";

        if (language != null) {
            result += FlagConstants.CODE_BLOCK_FLAG + language;
        } else {
            result += FlagConstants.CODE_BLOCK_FLAG;
        }

        result += codeBlock.getContent();
        result += FlagConstants.CODE_BLOCK_FLAG;

        return result;
    }

    @Override
    public BlockType getType() {
        return BlockType.CODE;
    }
}
