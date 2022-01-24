package fun.mingshan.markdown4j.encoder.block;

import fun.mingshan.markdown4j.type.block.BlockType;
import fun.mingshan.markdown4j.constant.FlagConstants;
import fun.mingshan.markdown4j.type.block.Block;
import fun.mingshan.markdown4j.type.block.TitleBlock;

/**
 * 标题块解析器
 *
 * @author hanjuntao
 * @date 2022/1/17
 */
public class TitleBlockEncoder implements BlockEncoder {
    @Override
    public String encode(Block block) {
        TitleBlock titleBlock = (TitleBlock) block;

        String content = titleBlock.getContent();
        TitleBlock.Level level = titleBlock.getLevel();
        String result = "";

        if (TitleBlock.Level.FIRST.equals(level)) {
            result += FlagConstants.TITLE_BLOCK_FLAG;
        } else if (TitleBlock.Level.SECOND.equals(level)) {
            result += FlagConstants.TITLE_BLOCK_FLAG + FlagConstants.TITLE_BLOCK_FLAG;
        } else if (TitleBlock.Level.THIRD.equals(level)) {
            result += FlagConstants.TITLE_BLOCK_FLAG + FlagConstants.TITLE_BLOCK_FLAG + FlagConstants.TITLE_BLOCK_FLAG;
        } else if (TitleBlock.Level.FOURTH.equals(level)) {
            result += FlagConstants.TITLE_BLOCK_FLAG + FlagConstants.TITLE_BLOCK_FLAG
                    + FlagConstants.TITLE_BLOCK_FLAG + FlagConstants.TITLE_BLOCK_FLAG;
        } else if (TitleBlock.Level.FIFTH.equals(level)) {
            result += FlagConstants.TITLE_BLOCK_FLAG + FlagConstants.TITLE_BLOCK_FLAG
                    + FlagConstants.TITLE_BLOCK_FLAG + FlagConstants.TITLE_BLOCK_FLAG + FlagConstants.TITLE_BLOCK_FLAG;
        }

        result += FlagConstants.SPACE + content;

        return result;
    }

    @Override
    public BlockType getType() {
        return BlockType.TITLE;
    }
}
