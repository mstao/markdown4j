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
 * 加粗
 *
 * @author hanjuntao
 * @date 2022/1/18
 */
@Builder
@Data
public class BoldElement implements Element {
    private String content;

    @Override
    public String toMd() {
        ElementEncoder encoder = ElementEncoderFactory.getEncoder(ElementType.BOLD);
        return encoder.encode(this);
    }

    @Override
    public ElementType getType() {
        return ElementType.BOLD;
    }
}
