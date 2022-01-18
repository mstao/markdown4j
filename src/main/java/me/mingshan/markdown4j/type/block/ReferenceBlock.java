package me.mingshan.markdown4j.type.block;

import lombok.Builder;
import lombok.Data;
import me.mingshan.markdown4j.encoder.block.BlockEncoder;
import me.mingshan.markdown4j.encoder.block.BlockEncoderFactory;

/**
 * 引用块
 *
 * <pre>
 *     > aadadad
 * </pre>
 *
 * @author hanjuntao
 * @date 2022/1/17
 */
@Builder
@Data
public class ReferenceBlock implements Block {
    private String content;

    @Override
    public BlockType getType() {
        return BlockType.REFERENCE;
    }

    @Override
    public String toMd() {
        BlockEncoder encoder = BlockEncoderFactory.getEncoder(BlockType.REFERENCE);
        return encoder.encode(this);
    }
}
