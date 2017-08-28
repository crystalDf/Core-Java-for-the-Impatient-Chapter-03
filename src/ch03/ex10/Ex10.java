package ch03.ex10;

import java.io.File;
import java.io.FileFilter;
import java.util.function.Predicate;

public class Ex10 {

    public static void main(String[] args) {

        File file = new File(".");

        System.out.println(file.getAbsolutePath());

        FileFilter fileFilter = new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.isDirectory();
            }
        };

        fileFilter = pathname -> pathname.isDirectory();

        fileFilter = File::isDirectory;

        File[] files = file.listFiles(fileFilter);

        for (File directory : files) {
            System.out.println(directory.getName());
        }

        System.out.println();

        Predicate<File> predicate = new Predicate<File>() {
            @Override
            public boolean test(File file) {
                return file.isDirectory();
            }
        };

        predicate = file1 -> file1.isDirectory();

        predicate = File::isDirectory;

        files = file.listFiles();

        for (File directory : files) {
            if (predicate.test(directory)) {
                System.out.println(directory.getName());
            }
        }
    }
}
