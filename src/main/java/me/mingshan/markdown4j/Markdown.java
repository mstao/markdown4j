package me.mingshan.markdown4j;

import me.mingshan.markdown4j.type.block.Block;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/**
 * @author hanjuntao
 * @date 2022/1/17
 */
public class Markdown {
    private String name;
    private List<Block> blocks;

    public static Markdown builder() {
        return new Markdown();
    }

    public Markdown name(String name) {
        Objects.requireNonNull(name, "the name not be null");

        this.name = name;
        return this;
    }

    public Markdown addBlock(Block... block) {
        Objects.requireNonNull(block, "the block not be null");

        if (blocks == null) {
            blocks = new ArrayList<>();
            blocks.addAll(Arrays.asList(block));
        } else {
            blocks.addAll(Arrays.asList(block));
        }

        return this;
    }

    public void build() {
        // 形成字符串
        return;
    }
}
