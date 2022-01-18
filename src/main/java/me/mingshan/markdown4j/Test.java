package me.mingshan.markdown4j;

import me.mingshan.markdown4j.type.block.CodeBlock;
import me.mingshan.markdown4j.type.block.TableBlock;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author hanjuntao
 * @date 2022/1/17
 */
public class Test {
    public static void main(String[] args) {
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

        String result = Markdown.builder()
                .name("测试文档")
                .addBlock(codeBlock)
                .addBlock(tableBlock)
                .build();

        System.out.println(result);
    }
}
