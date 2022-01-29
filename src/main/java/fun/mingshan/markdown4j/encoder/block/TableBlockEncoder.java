/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package fun.mingshan.markdown4j.encoder.block;

import fun.mingshan.markdown4j.constant.FlagConstants;
import fun.mingshan.markdown4j.type.block.BlockType;
import fun.mingshan.markdown4j.type.block.TableBlock;
import fun.mingshan.markdown4j.type.block.Block;

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
