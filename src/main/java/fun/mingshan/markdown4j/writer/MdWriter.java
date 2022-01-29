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
package fun.mingshan.markdown4j.writer;

import fun.mingshan.markdown4j.Markdown;
import fun.mingshan.markdown4j.constant.FlagConstants;

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
