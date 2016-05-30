package chapter3;

import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.util.concurrent.TimeUnit;

/**
 * Project: FunctionalProgrammingInJava8
 * FileName: WatchFileChange
 * Date: 2016-05-30
 * Time: 오후 11:56
 * Author: redfo
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class WatchFileChange {
    public static void main(String[] args) throws Exception {
        new Thread(() -> watchFileChange()).start();
        final File file = new File("sample.txt");
        file.createNewFile();
        Thread.sleep(5000);
        file.setLastModified(System.currentTimeMillis());
    }

    public static void watchFileChange() {
        try {
            final Path path = Paths.get(".");
            final WatchService watchService =
                    path.getFileSystem()
                            .newWatchService();

            path.register(watchService, StandardWatchEventKinds.ENTRY_MODIFY);

            System.out.println("Report any file changed within next 1 minute...");

            final WatchKey watchKey = watchService.poll(1, TimeUnit.MINUTES);

            if(watchKey != null) {
                watchKey.pollEvents()
                        .stream()
                        .forEach(event ->
                                System.out.println(event.context()));
            }
        } catch(InterruptedException | IOException ex) {
            System.out.println(ex);
        }
    }
}
