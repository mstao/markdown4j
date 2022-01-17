package me.mingshan.markdown4j.type.block;

import lombok.Builder;
import lombok.Data;

/**
 * 标题块
 *
 * <pre>
 *     # 一级标题
 *     ## 二级标题
 *     ### 三级标题
 *     #### 四级标题
 *     #####  五级标题
 * </pre>
 *
 * @author hanjuntao
 * @date 2022/1/17
 */
@Builder
@Data
public class TitleBlock implements Block {
    private Level level;
    private String content;

    @Override
    public BlockType getType() {
        return BlockType.TITLE;
    }

    /**
     * 标题级别枚举
     */
    public enum Level {
        FIRST,
        SECOND,
        THIRD,
        FOURTH,
        FIFTH;
    }
}
