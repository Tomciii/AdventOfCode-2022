package com.adventofcode.year2015;

import com.utils.FileReaderUtil;

import java.util.List;
import java.util.function.Function;

public class AdventOfCode2015 {

    public static Function<String, Integer> solveDay2 = (path) -> {
        Integer result = 0;

        List<String> input = FileReaderUtil.readFile(path);

        for (String line : input){
            String[] dimensions = line.split("x");
            Integer l = Integer.valueOf(dimensions[0]);
            Integer w = Integer.valueOf(dimensions[1]);
            Integer h = Integer.valueOf(dimensions[2]);

            Integer smallestFace1 = l;
            Integer smallestFace2 = w;
            Integer smallestFace3 = h;

            if (l > w){
                smallestFace1 = w;
            }

            if (w > h){
                smallestFace2 = h;
            }

            if (h > l){
                smallestFace3 = l;
            }

            Integer side1 = l*w;
            Integer side2 = w*h;
            Integer side3 = h*l;

            result = result + l + smallestFace1 + smallestFace2 + smallestFace3 + l*w*h;
        //    result = result + 2*l*w + 2*w*h + 2*h*l + smallestSide;
        }

        return result;
    };

    public static Function<String, Integer> solveDay1 = (path) -> {
        int result = 0;
        List<String> input = FileReaderUtil.readFile(path);

        for (int i = 0; i < input.get(0).length(); i++){
            if (input.get(0).charAt(i) == '('){
                result = result + 1;
            } else {
                result = result - 1;
                if (result == -1){
                    return i + 1;
                }
            }
        }

        return result;
    };


}
