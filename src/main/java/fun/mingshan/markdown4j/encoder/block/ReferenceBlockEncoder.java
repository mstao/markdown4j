package fun.mingshan.markdown4j.encoder.block;

import fun.mingshan.markdown4j.constant.FlagConstants;
import fun.mingshan.markdown4j.type.block.BlockType;
import fun.mingshan.markdown4j.type.block.ReferenceBlock;
import fun.mingshan.markdown4j.type.block.Block;

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
