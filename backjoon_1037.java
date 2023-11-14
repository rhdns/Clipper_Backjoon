package backjoon;

import java.util.Arrays;
import java.util.Scanner;


public class backjoon_1037 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int divCount = sc.nextInt();
        int[] divArray = new int[divCount];

        for (int i = 0; i < divCount; i++) {
            divArray[i] = sc.nextInt();
        }

        Arrays.sort(divArray);

        int divMin = divArray[0];
        int divMax = divArray[divCount - 1];

        System.out.println(divMin * divMax);
    }
}
