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
package fun.mingshan.markdown4j.type.element;

import lombok.Builder;
import lombok.Data;
import fun.mingshan.markdown4j.encoder.element.ElementEncoder;
import fun.mingshan.markdown4j.encoder.element.ElementEncoderFactory;

/**
 * 图片元素：
 *
 * <pre>
 *     ![](https://pandao.github.io/editor.md/examples/images/4.jpg)
 * </pre>
 *
 * @author hanjuntao
 * @date 2022/1/17
 */
@Builder
@Data
public class ImageElement implements Element {
    private String imageUrl;

    @Override
    public String toMd() {
        ElementEncoder encoder = ElementEncoderFactory.getEncoder(ElementType.IMAGE);
        return encoder.encode(this);
    }

    @Override
    public ElementType getType() {
        return ElementType.IMAGE;
    }

}
