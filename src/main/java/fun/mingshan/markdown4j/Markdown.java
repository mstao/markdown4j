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
