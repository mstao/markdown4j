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
import fun.mingshan.markdown4j.type.block.ReferenceBlock;
import fun.mingshan.markdown4j.type.block.Block;

/**
 * @author hanjuntao
 * @date 2022/1/18
 */
public class ReferenceBlockEncoder implements BlockEncoder {
    @Override
    public String encode(Block block) {
        ReferenceBlock referenceBlock = (ReferenceBlock) block;
        String content = referenceBlock.getContent();

        return FlagConstants.REFERENCE_BLOCK_FLAG + FlagConstants.SPACE + content;
    }

    @Override
    public BlockType getType() {
        return BlockType.REFERENCE;
    }
}
