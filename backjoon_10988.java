package backjoon;

import java.util.Scanner;

class backjoon_10988 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int mid = str.length()/2;
        int pelin = 1; //펠린드롬이면 1, 아니면 0을 저장
        for (int i = 0; i < mid; i++) {
            if (str.charAt(i) != str.charAt(str.length() - i-1)) {
                pelin = 0;//문자열의 맨 앞 문자와 맨 뒤 문자부터 차례로 비교하고 다르면 0을 저장
                break;
            }
        }
        System.out.println(pelin);
    }
}