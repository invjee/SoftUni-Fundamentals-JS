package ArraysEx;

import java.util.Arrays;
import java.util.Scanner;

public class KaminoFactory09NotDone {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String line = scanner.nextLine();
        String maxSeq ="";
        int indexMin=0;
        int seq1Max=0;
        int sumMax =0;
        int counter = 1;
        int maxCounter = 1;

        while (!line.equals("Clone them!")) {
            String[] arr = line.split("!+");

            int index =0;
            int currIndex=0;
            int currentSeq =0;
            int currentSum =0;


            for (int i = 0; i < arr.length; i++) {
                int seq1=0;


                if (arr[i].equals("1")) {
                    currIndex =i;
                    currentSum++;
                    seq1++;
                    for (int j = i + 1; j < arr.length; j++) {
                        if (arr[j].equals("1")) {
                            seq1++;

                        }else{
                            break;
                        }
                    }
                }

                if(currentSeq<seq1){
                    currentSeq=seq1;
                    index= currIndex;

                }
            }
            if(seq1Max<currentSeq){
                seq1Max=currentSeq;
                indexMin=index;
                sumMax=currentSum;
                maxSeq= line;
                maxCounter=counter;
            }else if(seq1Max==currentSeq){
                if(indexMin>index){
                    seq1Max=currentSeq;
                    indexMin=index;
                    maxSeq=line;
                    maxCounter=counter;
                    sumMax=currentSum;
                }else if(indexMin==index){
                    if(currentSum>sumMax){
                        seq1Max=currentSeq;
                        maxSeq=line;
                        indexMin=index;
                        maxCounter=counter;
                        sumMax=currentSum;
                    }
                }
            }

            line = scanner.nextLine();

            counter++;
        }
        System.out.printf("Best DNA sample %d with sum: %d.%n",maxCounter,sumMax );
        String[] arrMaxSeq = maxSeq.split("!+");

        System.out.println(String.join(" ", arrMaxSeq));


    }
}
