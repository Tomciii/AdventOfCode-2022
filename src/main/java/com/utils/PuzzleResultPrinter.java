package com.utils;

import java.util.function.Function;

public class PuzzleResultPrinter {
    public static void printResult(Function<String, ?> puzzle, String filePath){
        System.out.println(puzzle.apply(filePath));
    }
}