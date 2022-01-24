package fun.mingshan.markdown4j.type.block;

import fun.mingshan.markdown4j.encoder.block.BlockEncoder;
import fun.mingshan.markdown4j.encoder.block.BlockEncoderFactory;
import lombok.Builder;
import lombok.Data;

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
