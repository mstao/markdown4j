package me.mingshan.markdown4j.writer;

import me.mingshan.markdown4j.Markdown;
import me.mingshan.markdown4j.constant.FlagConstants;

import java.io.*;
import java.nio.charset.StandardCharsets;

/**
 * @author hanjuntao
 * @date 2022/1/18
 */
public class MdWriter {
    public static void write(Markdown markdown) throws IOException {
        try (FileOutputStream fos = new FileOutputStream("./" + markdown.getName() + ".md");
             OutputStreamWriter osw = new OutputStreamWriter(fos, StandardCharsets.UTF_8);
             BufferedWriter bw = new BufferedWriter(osw)) {
            String[] arrs = markdown.toString().split(FlagConstants.LINE_BREAK);

            for (String arr : arrs) {
                bw.write(arr + "\r\n");
            }
        }
    }
}
