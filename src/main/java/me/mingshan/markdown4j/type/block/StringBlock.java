package me.mingshan.markdown4j.type.block;

import lombok.Builder;
import lombok.Data;

/**
 * @author hanjuntao
 * @date 2022/1/18
 */
@Data
@Builder
public class StringBlock implements Block {
    private String content;

    @Override
    public String toMd() {
        return content;
    }

    @Override
    public BlockType getType() {
        return BlockType.STRING;
    }
}
