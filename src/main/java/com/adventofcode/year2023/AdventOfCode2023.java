package com.adventofcode.year2023;

import com.utils.FileReaderUtil;

import java.util.List;

public class AdventOfCode2023 {

    public Integer day1_1(String path) {
        List<String> input = FileReaderUtil.readFile(path);
        Integer sum = 0;

        for (int lineIndex = 0; lineIndex < input.size(); lineIndex++) {
            char firstDigit = ' ';
            char secondDigit = ' ';

      INNER:  for (int charIndex = 0; charIndex < input.get(lineIndex).length(); charIndex++) {
                if (Character.isDigit(input.get(lineIndex).charAt(charIndex))) {
                    secondDigit = input.get(lineIndex).charAt(charIndex);

                    if (firstDigit == ' ')
                        firstDigit = input.get(lineIndex).charAt(charIndex);
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append(firstDigit);
            sb.append(secondDigit);

            sum = sum + Integer.valueOf(sb.toString());
        }

        return sum;
    }

    public Integer day1_2(String path) {
        List<String> input = FileReaderUtil.readFile(path);
        Integer sum = 0;

        for (int lineIndex = 0; lineIndex < input.size(); lineIndex++) {
            char firstDigit = ' ';
            char secondDigit = ' ';

            INNER:  for (int charIndex = 0; charIndex < input.get(lineIndex).length(); charIndex++) {
                if (Character.isDigit(input.get(lineIndex).charAt(charIndex))) {
                    secondDigit = input.get(lineIndex).charAt(charIndex);

                    if (firstDigit == ' ')
                        firstDigit = input.get(lineIndex).charAt(charIndex);
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append(firstDigit);
            sb.append(secondDigit);

            sum = sum + Integer.valueOf(sb.toString());
        }

        return sum;
    }
}
