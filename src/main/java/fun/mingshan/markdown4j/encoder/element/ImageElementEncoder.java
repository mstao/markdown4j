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

import fun.mingshan.markdown4j.type.element.Element;
import fun.mingshan.markdown4j.type.element.ElementType;
import fun.mingshan.markdown4j.type.element.ImageElement;

/**
 * @author hanjuntao
 * @date 2022/1/18
 */
public class ImageElementEncoder implements ElementEncoder {
    @Override
    public String encode(Element element) {
        ImageElement imageElement = (ImageElement) element;

        String imageUrl = imageElement.getImageUrl();
        return "![](" + imageUrl + ")";
    }

    @Override
    public ElementType getType() {
        return ElementType.IMAGE;
    }
}
