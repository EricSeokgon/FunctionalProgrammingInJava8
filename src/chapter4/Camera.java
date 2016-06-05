package chapter4;

import java.awt.*;
import java.util.function.Function;

/**
 * Project: FunctionalProgrammingInJava8
 * FileName: Camera
 * Date: 2016-06-05
 * Time: 오전 12:45
 * Author: redfo
 * Note:
 * To change this template use File | Settings | File Templates.
 */
@SuppressWarnings("unchecked")
public class Camera {
    private Function<Color, Color> filter;
    public Color capture(final Color inputColor) {
        final Color processedColor = filter.apply(inputColor);
//... more processing of color...
        return processedColor;
    }
//... other functions that use the filter ...
}
