package backjoon;

import java.util.Scanner;

public class backjoon_1476 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int E = sc.nextInt();
        int S = sc.nextInt();
        int M = sc.nextInt();
        int year = 1; // 년도를 1씩 늘려가면서 알아냄
        while(true) {
            if(E==15)
                E=0;
            if(S==28)
                S=0;
            if(M==19)
                M=0;
            if(year%15==E&&year%28==S&&year%19==M) {
                System.out.println(year);
                return;
            }
            year++;
        }
    }
}
