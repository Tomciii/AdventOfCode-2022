package com.utils;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class FileReaderUtil {

    public static int[][] readFileAs2DIntArray(String path){
        List<String> file = readFile(path);

        int[][] result = new int[file.size()][file.get(0).length()];

        for (int i = 0; i < file.size(); i++){
            for (int j = 0; j < file.get(0).length(); j++){
                result[i][j] = Integer.parseInt(file.get(i).substring(j,j + 1));
            }
        }

        return result;
    }

    private static BufferedReader getBufferedReader(String path){
        ClassLoader classloader = Thread.currentThread().getContextClassLoader();
        InputStream is = classloader.getResourceAsStream(path);
        return new BufferedReader(new InputStreamReader(is, StandardCharsets.UTF_8));
    }

    public static List<String> readFile(String path) {
        try (BufferedReader bufferedReader = FileReaderUtil.getBufferedReader(path)) {
            String line;

            List<String> result = new ArrayList<>();
            while ((line = bufferedReader.readLine()) != null) {
                result.add(line);
            }

            return result;
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

        return null;
    }
}