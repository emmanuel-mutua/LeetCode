package com.emmutua.programz;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class WorkingWithFiles {
    public static void main(String[] args) throws IOException {
        var filePath = System.getProperty("user.dir") + "/src/test.txt";
        System.out.println(WorkingWithFilesEx.getWorkingDir(filePath));
//        System.out.println(WorkingWithFilesEx.getFileLines(filePath));
        System.out.println(WorkingWithFilesEx.readLines(filePath));
    }

}

class WorkingWithFilesEx {
    public static String getWorkingDir(String filePath) {
        return Paths.get("").toAbsolutePath().toString();
    }
    public static List<String> getFileLines(String filePath) throws IOException {
        System.out.println(filePath);
        var encoding = Charset.defaultCharset();
        return Files.readAllLines(Paths.get(filePath), encoding);
    }

    public static String readLines(String filepath) throws IOException {
        var encoding = Charset.defaultCharset();
        byte[] encoded = Files.readAllBytes(Paths.get(filepath));
        String lines = new String(encoded, encoding);
        return lines;
    }
}