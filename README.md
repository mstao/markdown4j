# markdown4j
[![Build Status](https://github.com/mstao/markdown4j/build/badge.svg?branch=main)](https://github.com/mstao/markdown4j/actions)
[![license](https://img.shields.io/github/license/seata/seata.svg?style=flat-square)](https://www.apache.org/licenses/LICENSE-2.0.html)
[![maven](https://img.shields.io/maven-central/v/fun.mingshan/markdown4j?style=flat-square)](https://search.maven.org/search?q=fun.mingshan)

Use java to generate markdown file.

https://commonmark.org/

# maven

```
<dependency>
  <groupId>fun.mingshan</groupId>
  <artifactId>markdown4j</artifactId>
  <version>1.0</version>
</dependency>
```

# How to use?

```Java
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
```
