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

import fun.mingshan.markdown4j.type.block.BlockType;

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
