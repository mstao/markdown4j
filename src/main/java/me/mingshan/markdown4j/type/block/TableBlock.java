package me.mingshan.markdown4j.type.block;

import lombok.Builder;
import lombok.Data;

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

    @Data
    public static class TableRow {
        private List<String> rows;
    }
}
