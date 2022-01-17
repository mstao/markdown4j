package me.mingshan.markdown4j.type.block;

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
}
