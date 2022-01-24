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
