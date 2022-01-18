package me.mingshan.markdown4j.encoder.block;

import me.mingshan.markdown4j.type.block.BlockType;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author hanjuntao
 * @date 2022/1/18
 */
public class BlockEncoderFactory {
    private static final Map<String, BlockEncoder> ENCODER_MAP = new ConcurrentHashMap<>();

    static {
        ENCODER_MAP.put(BlockType.CODE.name(), new CodeBlockEncoder());
        ENCODER_MAP.put(BlockType.TABLE.name(), new TableBlockEncoder());
        ENCODER_MAP.put(BlockType.TITLE.name(), new TitleBlockEncoder());
        ENCODER_MAP.put(BlockType.REFERENCE.name(), new ReferenceBlockEncoder());
    }

    public static BlockEncoder getEncoder(BlockType blockType) {
        BlockEncoder blockEncoder = ENCODER_MAP.get(blockType.name());
        if (blockEncoder == null) {
            throw new IllegalStateException("Miss blockEncoder : " + blockType.name());
        }

        return blockEncoder;
    }
}
