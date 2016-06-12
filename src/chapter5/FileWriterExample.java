package chapter5;

import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by hadeslee on 2016-06-12.
 */
public class FileWriterExample {
    private final FileWriter writer;

    public FileWriterExample(final String fileName) throws IOException {
        writer = new FileWriter(fileName);
    }
    public void writeStuff(final String message) throws IOException {
        writer.write(message);
    }
    public void finalize() throws IOException {
        writer.close();
    }
    //...

    public void close() throws IOException {
        writer.close();
    }

/*
  public static void main(final String[] args) throws IOException {
    final FileWriterExample writerExample =
      new FileWriterExample("peekaboo.txt");
    writerExample.writeStuff("peek-a-boo");
  }
*/

    public static void callClose(final String[] args) throws IOException {
        final FileWriterExample writerExample =
                new FileWriterExample("peekaboo.txt");

        writerExample.writeStuff("peek-a-boo");
        writerExample.close();
    }

    public static void main(final String[] args) throws IOException {
        final FileWriterExample writerExample =
                new FileWriterExample("peekaboo.txt");
        try {
            writerExample.writeStuff("peek-a-boo");
        } finally {
            writerExample.close();
        }
    }
}
