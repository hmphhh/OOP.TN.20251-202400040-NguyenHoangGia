package com.hust.kstn.garbage;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class NoGarbage {

    public static void main(String[] args) throws IOException {
        String fileName = "src/com/hust/kstn/garbage/Garbage.txt";
        byte[] inputBytes = {0};
        long startTime, endTime;

        inputBytes = Files.readAllBytes(Paths.get(fileName));
        startTime = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for (byte b : inputBytes) {
            sb.append((char) b);
        }
        String outputString = sb.toString();
        endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);
    }
}
