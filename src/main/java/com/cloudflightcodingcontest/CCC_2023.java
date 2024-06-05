package com.cloudflightcodingcontest;

import com.utils.FileReaderUtil;

import java.util.ArrayList;
import java.util.List;

public class CCC_2023 {
    public static void CCC_2023_Level2() {
        List<String> input = FileReaderUtil.readFile("CCC/2023/2/level2_1.in");

        Integer number = Integer.valueOf(input.get(0).split(" ")[1]);


        for(int i = 1; i < input.size(); i++){
            char[] inputs = input.get(i).toCharArray();

            List<String> winner = new ArrayList<>();

            for(int j = 0; j < number; j = j + 2){
                if(inputs[j] == 'P'){
                    if(inputs[j + 1] == 'R'){
                        winner.add("P");
                    }
                    if(inputs[j + 1] == 'S'){
                        winner.add("S");
                    }
                    if(inputs[j + 1] == 'P'){
                        winner.add("P");
                    }
                }
                if(inputs[j] == 'R'){
                    if(inputs[j + 1] == 'P'){
                        winner.add("P");
                    }
                    if(inputs[j + 1] == 'S'){
                        winner.add("R");
                    }
                    if(inputs[j + 1] == 'R'){
                        winner.add("R");
                    }
                }
                if(inputs[j] == 'S'){
                    if(inputs[j + 1] == 'P'){
                        winner.add("S");
                    }
                    if(inputs[j + 1] == 'R'){
                        winner.add("R");
                    }
                    if(inputs[j + 1] == 'S'){
                        winner.add("S");
                    }
                }
            }

            List<String> newWinner = new ArrayList<>();
            fillNewWinnerList(inputs, winner, newWinner);

            List<String> newWinner2 = new ArrayList<>();
            fillNewWinnerList(inputs, newWinner, newWinner2);

            List<String> newWinner3 = new ArrayList<>();
            fillNewWinnerList(inputs, newWinner2, newWinner3);

            List<String> newWinner4 = new ArrayList<>();
            fillNewWinnerList(inputs, newWinner3, newWinner4);

            for(int k = 0; k < newWinner2.size(); k = k + 4){
                System.out.print(newWinner2.get(k));
                System.out.print(newWinner2.get(k + 1));
                System.out.print(newWinner2.get(k + 2));
                System.out.println(newWinner2.get(k + 3));
            }

        } }

    private static void fillNewWinnerList(char[] inputs, List<String> winner, List<String> newWinner) {
        for(int j = 0; j < winner.size(); j = j + 2){
            if(inputs[j] == 'P'){
                if(inputs[j + 1] == 'R'){
                    newWinner.add("P");
                }
                if(inputs[j + 1] == 'S'){
                    newWinner.add("S");
                }
                if(inputs[j + 1] == 'P'){
                    newWinner.add("P");
                }
            }
            if(inputs[j] == 'R'){
                if(inputs[j + 1] == 'P'){
                    newWinner.add("P");
                }
                if(inputs[j + 1] == 'S'){
                    newWinner.add("R");
                }
                if(inputs[j + 1] == 'R'){
                    newWinner.add("R");
                }
            }
            if(inputs[j] == 'S'){
                if(inputs[j + 1] == 'P'){
                    newWinner.add("S");
                }
                if(inputs[j + 1] == 'R'){
                    newWinner.add("R");
                }
                if(inputs[j + 1] == 'S'){
                    newWinner.add("S");
                }
            }
        }
    }

    public static void CCC_2023_Level1() {
        List<String> input = FileReaderUtil.readFile("CCC/2023/1/level1_5.in");

        for(int i = 1; i < input.size(); i++){
            char[] inputs = input.get(i).toCharArray();

            if(inputs[0] == 'P'){
                if(inputs[1] == 'R'){
                    System.out.println("P");
                }
                if(inputs[1] == 'S'){
                    System.out.println("S");
                }
                if(inputs[1] == 'P'){
                    System.out.println("P");
                }
            }
            if(inputs[0] == 'R'){
                if(inputs[1] == 'P'){
                    System.out.println("P");
                }
                if(inputs[1] == 'S'){
                    System.out.println("R");
                }
                if(inputs[1] == 'R'){
                    System.out.println("R");
                }
            }
            if(inputs[0] == 'S'){
                if(inputs[1] == 'P'){
                    System.out.println("S");
                }
                if(inputs[1] == 'R'){
                    System.out.println("R");
                }
                if(inputs[1] == 'S'){
                    System.out.println("S");
                }
            }
        } }
}
