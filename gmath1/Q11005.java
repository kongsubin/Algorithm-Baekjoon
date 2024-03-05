/*
문제
10진법 수 N이 주어진다. 이 수를 B진법으로 바꿔 출력하는 프로그램을 작성하시오.
10진법을 넘어가는 진법은 숫자로 표시할 수 없는 자리가 있다. 이런 경우에는 다음과 같이 알파벳 대문자를 사용한다.
A: 10, B: 11, ..., F: 15, ..., Y: 34, Z: 35

입력
첫째 줄에 N과 B가 주어진다. (2 ≤ B ≤ 36) N은 10억보다 작거나 같은 자연수이다.

출력
첫째 줄에 10진법 수 N을 B진법으로 출력한다.

예제 입력 1
60466175 36

3 2
예제 출력 1
ZZZZZ

11
 */
package gmath1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q11005 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        br.close();

        String result = "";

        while(N > 0) {
            int c = N%B;
            N = N/B;
            if (10 <= c && c<= 36) {
                int t = c + 'A' - 10;
                result += (char) t;
            } else {
                int t = c + '0';
                result += (char) t;
            }
        }

        // reverse
        StringBuffer sb = new StringBuffer(result);
        String reversedStr = sb.reverse().toString();

        System.out.println(reversedStr);
    }
}
