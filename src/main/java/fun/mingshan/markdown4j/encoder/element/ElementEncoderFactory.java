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
package fun.mingshan.markdown4j.encoder.element;

import fun.mingshan.markdown4j.type.element.ElementType;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author hanjuntao
 * @date 2022/1/18
 */
public class ElementEncoderFactory {
    private static final Map<String, ElementEncoder> ENCODER_MAP = new ConcurrentHashMap<>();

    static {
        ENCODER_MAP.put(ElementType.BOLD.name(), new BoldElementEncoder());
        ENCODER_MAP.put(ElementType.INLINE_CODE.name(), new InlineCodeElementEncoder());
        ENCODER_MAP.put(ElementType.ITALIC.name(), new ItalicElementEncoder());
        ENCODER_MAP.put(ElementType.IMAGE.name(), new ImageElementEncoder());
        ENCODER_MAP.put(ElementType.URL.name(), new UrlElementEncoder());
    }

    public static ElementEncoder getEncoder(ElementType elementType) {
        ElementEncoder elementEncoder = ENCODER_MAP.get(elementType.name());
        if (elementEncoder == null) {
            throw new IllegalStateException("Miss elementEncoder : " + elementType.name());
        }

        return elementEncoder;
    }
}
