package fun.mingshan.markdown4j.encoder.block;

import fun.mingshan.markdown4j.type.block.BlockType;
import fun.mingshan.markdown4j.constant.FlagConstants;
import fun.mingshan.markdown4j.type.block.Block;
import fun.mingshan.markdown4j.type.block.CodeBlock;

/**
 * 代码块编译
 *
 * @author hanjuntao
 * @date 2022/1/17
 */
public class CodeBlockEncoder implements BlockEncoder {
    @Override
    public String encode(Block block) {
        CodeBlock codeBlock = (CodeBlock) block;
        String language = codeBlock.getLanguage();

        String result = "";

        if (language != null) {
            result += FlagConstants.CODE_BLOCK_FLAG + language;
        } else {
            result += FlagConstants.CODE_BLOCK_FLAG;
        }

        result += FlagConstants.LINE_BREAK;

        result += codeBlock.getContent();
        result += FlagConstants.LINE_BREAK;
        result += FlagConstants.CODE_BLOCK_FLAG;
        result += FlagConstants.LINE_BREAK;

        return result;
    }

    @Override
    public BlockType getType() {
        return BlockType.CODE;
    }
}
