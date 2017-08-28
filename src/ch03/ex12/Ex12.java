package ch03.ex12;

import java.io.File;
import java.util.Arrays;
import java.util.Comparator;

public class Ex12 {

    public static void main(String[] args) {

        File file = new File(".");

        File[] files = file.listFiles();

        for (File file1 : files) {
            System.out.println(file1.getName());
        }

        System.out.println();

        Arrays.sort(files, new Comparator<File>() {
            @Override
            public int compare(File o1, File o2) {

                if (o1.isDirectory() && o2.isFile()) {
                    return 1;
                } else if (o1.isFile() && o2.isDirectory()) {
                    return -1;
                } else {
                    return o1.getName().compareTo(o2.getName());
                }
            }
        });

        Arrays.sort(files, (o1, o2) -> {

            if (o1.isDirectory() && o2.isFile()) {
                return 1;
            } else if (o1.isFile() && o2.isDirectory()) {
                return -1;
            } else {
                return o1.getName().compareTo(o2.getName());
            }
        });

        for (File file1 : files) {
            System.out.println(file1.getName());
        }

        System.out.println();
    }
}
