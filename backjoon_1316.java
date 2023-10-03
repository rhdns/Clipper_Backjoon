package backjoon;

import java.util.Scanner;

public class backjoon_1316 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num=scan.nextInt();
        int cnt=num;

        for(int c = 0;c<num;c++) {
            String st = scan.next();
            boolean test[] = new boolean[26];

            for(int i=0;i<st.length()-1;i++) {
                if(st.charAt(i)!=st.charAt(i+1)) {
                    if(test[st.charAt(i+1)-97]==true) {
                        cnt--;
                        break;
                    }
                }
                test[st.charAt(i)-97]=true;
            }
        }
        System.out.println(cnt);
    }
}
