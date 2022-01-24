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
