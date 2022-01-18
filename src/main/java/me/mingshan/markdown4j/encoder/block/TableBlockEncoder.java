package me.mingshan.markdown4j.encoder.block;

import me.mingshan.markdown4j.constant.FlagConstants;
import me.mingshan.markdown4j.type.block.Block;
import me.mingshan.markdown4j.type.block.BlockType;
import me.mingshan.markdown4j.type.block.TableBlock;

import java.util.List;

/**
 * 表格编码器
 *
 * @author hanjuntao
 * @date 2022/1/18
 */
public class TableBlockEncoder implements BlockEncoder {
    private static final String SEP = "|";
    private static final String SPE2 = "-------------";

    @Override
    public String encode(Block block) {
        TableBlock tableBlock = (TableBlock) block;
        List<String> titles = tableBlock.getTitles();

        StringBuilder result = new StringBuilder(SEP);

        // 拼接表头
        for (String title : titles) {
            result.append(FlagConstants.SPACE).append(title).append(FlagConstants.SPACE).append(SEP);
        }

        result.append(FlagConstants.LINE_BREAK);

        result.append(SEP);
        // 拼接 表头与表内容分割
        for (int i = 0; i < titles.size(); i++) {
            result.append(FlagConstants.SPACE).append(SPE2).append(SEP);
        }

        result.append(FlagConstants.LINE_BREAK);

        // 拼接表格内容
        List<TableBlock.TableRow> rows = tableBlock.getRows();

        for (TableBlock.TableRow tableRow : rows) {
            List<String> list = tableRow.getRows();
            result.append(SEP);
            for (String item : list) {
                result.append(FlagConstants.SPACE);
                if (item == null) {
                    result.append(FlagConstants.SPACE);
                } else {
                    result.append(item);
                }

                result.append(SEP);
            }

            result.append(FlagConstants.LINE_BREAK);
        }

        return result.toString();
    }

    @Override
    public BlockType getType() {
        return BlockType.TABLE;
    }
}
