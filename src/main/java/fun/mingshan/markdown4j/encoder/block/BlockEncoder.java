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
import fun.mingshan.markdown4j.type.block.Block;

/**
 * Block块编码器，将java代码编译成markdown 语法
 *
 * @author hanjuntao
 * @date 2022/1/17
 */
public interface BlockEncoder {
    /**
     * 编译
     *
     * @param block java代码
     * @return markdown语法字符串
     */
    String encode(Block block);

    /**
     * 返回块类型
     *
     * @return 块类型
     */
    BlockType getType();
}
