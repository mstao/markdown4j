package me.mingshan.markdown4j.type.block;

import lombok.Builder;
import lombok.Data;
import me.mingshan.markdown4j.encoder.block.BlockEncoder;
import me.mingshan.markdown4j.encoder.block.BlockEncoderFactory;

import java.util.List;

/**
 * 表格块
 *
 * <pre>
 * | header1 | header2 |
 * | ------- | ------- |
 * |   wqeq  |  qwq    |
 * </pre>
 *
 * @author hanjuntao
 * @date 2022/1/17
 */
@Builder
@Data
public class TableBlock implements Block {
    private List<String> titles;

    private List<TableRow> rows;

    @Override
    public BlockType getType() {
        return BlockType.TABLE;
    }

    @Override
    public String toMd() {
        BlockEncoder encoder = BlockEncoderFactory.getEncoder(BlockType.TABLE);
        return encoder.encode(this);
    }

    @Data
    public static class TableRow {
        private List<String> rows;
    }
}
