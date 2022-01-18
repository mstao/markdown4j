package me.mingshan.markdown4j.encoder.block;

import me.mingshan.markdown4j.constant.FlagConstants;
import me.mingshan.markdown4j.type.block.Block;
import me.mingshan.markdown4j.type.block.BlockType;
import me.mingshan.markdown4j.type.block.ReferenceBlock;

/**
 * @author hanjuntao
 * @date 2022/1/18
 */
public class ReferenceBlockEncoder implements BlockEncoder {
    @Override
    public String encode(Block block) {
        ReferenceBlock referenceBlock = (ReferenceBlock) block;
        String content = referenceBlock.getContent();

        return FlagConstants.REFERENCE_BLOCK_FLAG + FlagConstants.SPACE + content;
    }

    @Override
    public BlockType getType() {
        return BlockType.REFERENCE;
    }
}
