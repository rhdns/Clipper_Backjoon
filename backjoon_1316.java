package backjoon;

import java.util.Scanner;

public class backjoon_1316 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num=scan.nextInt();
        int cnt=num;

        for(int c = 0;c<num;c++) {
            String st = scan.next();
            boolean test[] = new boolean[26];// 각 문자에 대한 true, false

            for(int i=0;i<st.length()-1;i++) {
                if(st.charAt(i)!=st.charAt(i+1)) {
                    if(test[st.charAt(i+1)-97]==true) {//한번 나온 문자가 다시 나오면 cnt--
                        cnt--;
                        break;
                    }
                }
                test[st.charAt(i)-97]=true;//한번 나온 문자면 true로 바꿔줌
            }
        }
        System.out.println(cnt);
    }
}
