package backjoon;

import java.util.Scanner;

public class backjoon_10798 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 5줄 총 15개 2차원 배열 선언
        char[][] str = new char[5][15];

        String input = "";
        for (int i = 0; i < str.length; i++) {
            input = sc.next();
            for (int j = 0; j < input.length(); j++) {
                str[i][j] = input.charAt(j);
            }

        }


        for (int i = 0; i < 15; i++) { //한줄에 최대 15개
            for (int j = 0; j < 5; j++) { //총 5줄
                if (str[j][i] == '\0') //빈문자열이면 출력하지 않기
                    continue;
                System.out.print(str[j][i]);

            }
        }
    }
}