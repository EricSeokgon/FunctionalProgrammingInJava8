package chapter3;

import java.io.File;

/**
 * Project: FunctionalProgrammingInJava8
 * FileName: ListHiddenFiles
 * Date: 2016-05-28
 * Time: 오전 12:10
 * Author: redfo
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class ListHiddenFiles {
    final File[] files = new File(".").listFiles(file -> file.isHidden());
}
