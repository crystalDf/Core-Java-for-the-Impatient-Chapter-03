package ch03.ex11;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;

public class Ex11 {

    public static void main(String[] args) {

        File file = new File(".");

        FilenameFilter filenameFilter = new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return name.endsWith("iml");
            }
        };

        filenameFilter = (dir, name) -> name.endsWith("iml");

        String[] fileNames = file.list(filenameFilter);

        for (String fileName : fileNames) {
            System.out.println(fileName);
        }

        System.out.println();
    }
}
