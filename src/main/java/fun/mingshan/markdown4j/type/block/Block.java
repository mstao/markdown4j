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
package fun.mingshan.markdown4j.type.block;

/**
 * 块的概念，代表markdown 一块元素
 * <p>
 * 例如：
 * <p>
 * 1. 代码块
 * <pre>
 *     ```java
 *     ccccc
 *     ```
 * </pre>
 * <p>
 * 2. 一个标题
 * <pre>
 *     # 这是一个标题
 * </pre>
 *
 * @author hanjuntao
 * @date 2022/1/17
 */
public interface Block {
    String toMd();

    BlockType getType();
}
