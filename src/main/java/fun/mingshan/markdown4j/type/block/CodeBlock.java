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
package fun.mingshan.markdown4j.type.block;

import fun.mingshan.markdown4j.encoder.block.BlockEncoder;
import fun.mingshan.markdown4j.encoder.block.BlockEncoderFactory;
import lombok.Builder;
import lombok.Data;

/**
 * 代码块
 *
 * <pre>
 *     ```java
 *     public class CodeBlock extends Block {
 *     }
 *     ```
 * </pre>
 *
 * @author hanjuntao
 * @date 2022/1/17
 */
@Builder
@Data
public class CodeBlock implements Block {
    private String language;
    private String content;

    @Override
    public BlockType getType() {
        return BlockType.CODE;
    }

    @Override
    public String toMd() {
        BlockEncoder encoder = BlockEncoderFactory.getEncoder(BlockType.CODE);
        return encoder.encode(this);
    }

    /**
     * 语言
     *
     * @author hanjuntao
     * @date 2022/1/17
     */
    public enum Language {
        JAVA("JAVA"),
        C("C"),
        CPLUSPLUS("C++"),
        JAVASCRIPT("JAVASCRIPT");

        private final String desc;

        Language(String desc) {
            this.desc = desc;
        }

        public String getDesc() {
            return desc;
        }
    }
}
