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
package fun.mingshan.markdown4j;

import fun.mingshan.markdown4j.type.block.Block;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Markdown文档
 *
 * @author hanjuntao
 * @date 2022/1/17
 */
@AllArgsConstructor
@Data
public class Markdown {
    private String name;
    private List<Block> blocks;

    public static MarkdownBuilder builder() {
        return new MarkdownBuilder();
    }

    public static class MarkdownBuilder {
        private String name;
        private List<Block> blocks;

        MarkdownBuilder() {
        }

        public MarkdownBuilder name(String name) {
            Objects.requireNonNull(name, "the name not be null");

            this.name = name;
            return this;
        }

        public MarkdownBuilder block(Block block) {
            Objects.requireNonNull(block, "the block not be null");

            if (blocks == null) {
                blocks = new ArrayList<>();
                blocks.add(block);
            } else {
                blocks.add(block);
            }

            return this;
        }

        public Markdown build() {
            return new Markdown(this.name, this.blocks);
        }

    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();

        for (Block block : blocks) {
            result.append(block.toMd());
        }

        return result.toString();
    }
}
