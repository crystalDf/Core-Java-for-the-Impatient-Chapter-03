package ch03.ex03;

import javax.imageio.stream.ImageOutputStream;

public class Ex03 {

    public static void main(String[] args) throws ClassNotFoundException {

        printSuperClass("java.lang.String");

        System.out.println();

        printSuperClass("java.util.Scanner");

        System.out.println();

        printSuperClass("javax.imageio.stream.ImageOutputStream");

        System.out.println();
    }

    private static void printSuperClass(String className) throws ClassNotFoundException {

        Class<?> clazz = Class.forName(className);

        while (clazz != null) {

            System.out.println(clazz.getCanonicalName());

            clazz = clazz.getSuperclass();
        }
    }
}
