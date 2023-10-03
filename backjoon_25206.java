package backjoon;

import java.util.Scanner;

class backjoon_25206 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        double result = 0, credit_sum = 0; // result = 학점*과목평균, credit_sum = 학점 총합
        char c;

        for(int i=0;i<20;i++) {
            double credit = 0;
            double grade = 0;

            String str_arr[] = scan.nextLine().split(" ");// 공백 기준으로 단어를 나눔
            credit += Double.parseDouble(str_arr[1]);//문자열을 double형태로 바꿔줌
            c = str_arr[2].charAt(0);

            switch(c) {
                case 'A':
                    if(str_arr[2].charAt(1) == '+') grade += 4.5;
                    else grade += 4.0;
                    break;
                case 'B':
                    if(str_arr[2].charAt(1) == '+') grade += 3.5;
                    else grade += 3.0;
                    break;
                case 'C':
                    if(str_arr[2].charAt(1) == '+') grade += 2.5;
                    else grade += 2.0;
                    break;
                case 'D':
                    if(str_arr[2].charAt(1) == '+') grade += 1.5;
                    else grade += 1.0;
                    break;
                case 'F':
                    grade += 0;
                    break;
                case 'P':
                    grade += 0;
                    credit = 0;
                    break;
            }
            credit_sum += credit;
            result += credit*grade;
        }

        System.out.println(result/credit_sum);
    }
}
