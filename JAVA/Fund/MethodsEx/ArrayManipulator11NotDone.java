package MethodsEx;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayManipulator11NotDone {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();
        String line = scanner.nextLine();
        while (!line.equals("end")) {
            String[] tokens = line.split(" ");
            String type = tokens[0];
            switch (type) {
                case "exchange":
                    int index = Integer.parseInt(tokens[1]);
                    if (index >= 0 && index <= arr.length - 1) {
                        arr = exchangeIndex(arr, index);
                    } else {
                        System.out.println("Invalid index");
                    }


                    break;
                case "max":
                    String commandMax = tokens[1];
                    maxEvenOdd(arr, commandMax);
                    break;
                case "min":
                    String commandMin = tokens[1];
                    minEvenOdd(arr, commandMin);
                    break;
                case "last":
                    int countLast = Integer.parseInt(tokens[1]);
                    String commandLastInd = tokens[2];
                    if (countLast >= 0 && countLast <= arr.length) {
                        lastCountEvenOdd(arr, countLast, commandLastInd);
                    } else {
                        System.out.println("Invalid count");
                    }

                    break;
                case "first":
                    int countFirst = Integer.parseInt(tokens[1]);
                    String commandFirstInd = tokens[2];
                    if (countFirst >= 0 && countFirst <= arr.length) {

                        firstCountEvenOdd(arr, countFirst, commandFirstInd);
                    }else{
                        System.out.println("Invalid count");
                    }
                    break;
            }

            line = scanner.nextLine();
        }
        String[] arrStr = new String[arr.length];
        for (int i = 0; i < arrStr.length; i++) {
            arrStr[i]= String.valueOf(arr[i]);
        }
        System.out.println("["+String.join(", ",arrStr)+"]");


    }


    static int[] exchangeIndex(int[] arr, int index) {

        int[] arrNew = new int[arr.length];
        for (int i = index + 1; i < arr.length; i++) {


            arrNew[i - (index + 1)] = arr[i];

        }

        for (int i = 0; i <= index; i++) {

            arrNew[(arr.length + i) - (index + 1)] = arr[i];
        }

        return arrNew;


    }


    static void maxEvenOdd(int[] arr, String command) {
        if (command.equals("even")) {
            int indexMaxEl = 0;
            int maxEl = Integer.MIN_VALUE;
            for (int i = 0; i < arr.length; i++) {

                if ((arr[i] % 2 == 0) && arr[i] >= maxEl) {
                    maxEl = arr[i];
                    indexMaxEl = i;
                }
            }
            if (maxEl != Integer.MIN_VALUE) {
                System.out.println(indexMaxEl);
            } else {
                System.out.println("No matches");
            }

        } else {
            int maxEl = Integer.MIN_VALUE;
            int indexMaxEl = 0;
            for (int i = 0; i < arr.length; i++) {

                if ((arr[i] % 2 == 1) && arr[i] >= maxEl) {
                    maxEl = arr[i];
                    indexMaxEl = i;
                }
            }
            if (maxEl != Integer.MIN_VALUE) {
                System.out.println(indexMaxEl);
            } else {
                System.out.println("No matches");
            }
        }


    }

    static void minEvenOdd(int[] arr, String command) {
        if (command.equals("even")) {
            int indexMin = 0;
            int minEl = Integer.MAX_VALUE;
            for (int i = 0; i < arr.length; i++) {
                if ((arr[i] % 2 == 0) && arr[i] <= minEl) {
                    minEl = arr[i];
                    indexMin = i;
                }
            }
            if (minEl != Integer.MAX_VALUE) {
                System.out.println(indexMin);
            } else {
                System.out.println("No matches");
            }

        } else {
            int minEl = Integer.MAX_VALUE;
            int indexMin = 0;
            for (int i = 0; i < arr.length; i++) {
                if ((arr[i] % 2 == 1) && arr[i] <= minEl) {
                    minEl = arr[i];
                    indexMin = i;
                }
            }
            if (minEl != Integer.MAX_VALUE) {
                System.out.println(indexMin);
            } else {
                System.out.println("No matches");
            }
        }


    }

    static void firstCountEvenOdd(int[] arr, int count, String command) {
        if (command.equals("even")) {

                StringBuilder builder = new StringBuilder();
                int counter = 0;
                for (int i = 0; i < arr.length; i++) {
                    if (arr[i] % 2 == 0) {
                        builder.append(arr[i] + " ");
                        counter++;
                    }
                    if (counter == count) {

                        //System.out.println(builder.toString());
                        break;
                    }
                }
                String[] newArr = builder.toString().split(" ");

                System.out.println("[" + String.join(", ", newArr) + "]");



        } else {

                StringBuilder builder = new StringBuilder();
                int counter = 0;
                for (int i = 0; i < arr.length; i++) {
                    if (arr[i] % 2 == 1) {
                        builder.append(arr[i] + " ");
                        counter++;
                    }
                    if (counter == count) {

                        //System.out.println(builder.toString());
                        break;
                    }
                }
                String[] newArr = builder.toString().split(" ");

                System.out.println("[" + String.join(", ", newArr) + "]");


        }
    }

    static void lastCountEvenOdd(int[] arr, int count, String command) {
        if (command.equals("even")) {
            int counter = 0;
            StringBuilder builder = new StringBuilder();
            for (int i = arr.length - 1; i >= 0; i--) {

                if (arr[i] % 2 == 0) {
                    builder.append(arr[i] + " ");
                    counter++;

                }
                if (counter == count) {
                    break;
                }
            }
            String[] lastCountEl = builder.toString().split(" ");
            for (int i = 0; i < lastCountEl.length/2; i++) {
                String current = lastCountEl[i];
                lastCountEl[i] = lastCountEl[lastCountEl.length-1-i];
                lastCountEl[lastCountEl.length-1]= current;
            }
            System.out.println("[" + String.join(", ", lastCountEl) + "]");

        } else {
            int counter = 0;
            StringBuilder builder = new StringBuilder();
            for (int i = arr.length - 1; i >= 0; i--) {

                if (arr[i] % 2 == 1) {
                    builder.append(arr[i] + " ");
                    counter++;

                }
                if (counter == count) {
                    break;
                }
            }
            String[] lastCountEl2 = builder.toString().split(" ");
            for (int i = 0; i < lastCountEl2.length/2; i++) {
                String current = lastCountEl2[i];
                lastCountEl2[i] = lastCountEl2[lastCountEl2.length-1-i];
                lastCountEl2[lastCountEl2.length-1]= current;
            }
            System.out.println("[" + String.join(", ", lastCountEl2) + "]");
        }

    }


}
