package chapter3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Project: FunctionalProgrammingInJava8
 * FileName: ListFiles
 * Date: 2016-05-24
 * Time: 오후 11:52
 * Author: redfo
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class ListFiles {
    public static void main(String[] args) throws IOException {
        Files.list(Paths.get("."))
                .forEach(System.out::println);
    }
}
