package fun.mingshan.markdown4j.test;

import fun.mingshan.markdown4j.Markdown;
import fun.mingshan.markdown4j.type.block.CodeBlock;
import fun.mingshan.markdown4j.type.block.StringBlock;
import fun.mingshan.markdown4j.type.block.TableBlock;
import fun.mingshan.markdown4j.type.element.ImageElement;
import fun.mingshan.markdown4j.writer.MdWriter;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author hanjuntao
 * @date 2022/1/17
 */
public class Test {
    public static void main(String[] args) throws IOException {
        CodeBlock codeBlock = CodeBlock.builder()
                .language(CodeBlock.Language.JAVA.getDesc())
                .content("function test() {\n" +
                "\tconsole.log(\"Hello world!\");\n" +
                "}").build();

        List<TableBlock.TableRow> rows = new ArrayList<>();

        TableBlock.TableRow tableRow1 = new TableBlock.TableRow();
        tableRow1.setRows(Arrays.asList("小明", "29"));
        rows.add(tableRow1);

        TableBlock tableBlock = TableBlock.builder()
                .titles(Arrays.asList("姓名", "年龄"))
                .rows(rows)
                .build();

        StringBlock imageBlock = ImageElement.builder()
                .imageUrl("https://pandao.github.io/editor.md/examples/images/7.jpg")
                .build().toBlock();

        Markdown markdown = Markdown.builder()
                .name("测试文档")
                .block(codeBlock)
                .block(tableBlock)
                .block(imageBlock)
                .build();

        MdWriter.write(markdown);
    }
}
