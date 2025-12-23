import java.util.Scanner;

/**
 * 문제 설명
 * N개의 숫자가 공백 없이 쓰여 있다.
 * 이 숫자를 모두 합해서 출력하는 프로그램을 작성하는 문제이다.
 * ---------------------------------
 * 입력조건
 * 1. 첫째 줄에 숫자의 개수 N (1 <= N <= 100) 이 주어진다.
 * 2. 둘째 줄에 숫자 N개가 공백 없이 주어진다.
 * ---------------------------------
 * 핵심 포인트
 * 일반적인 정수형(int, long) 변수로는 이 문제를 풀기가 어려움
 * 이유
 * N이 최대 100이므로, 100자리 숫자가 들어올 수 있다.
 * int 나 long 이 담을 수 있는 범위를 훨씬 초과하기 때문에,
 * 숫자를 문자열(String) 로 받아야만 처리가 가능하다.
 *
 */

public class P11720_숫자의합 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // 숫자의 개수 N을 받음
    int N = sc.nextInt();
    // String 변수로 받아 배열 변수로 변환하기(공백 없는 긴 숫자를 문자열로)
    String sNum = sc.next();
    // 문자열을 한 글자씩 쪼개서(char), 숫자로 변환하여 더한다(문제의 목표)
    char[] cNum = sNum.toCharArray();
    int sum = 0;
    for (int i = 0; i < cNum.length; i++) { // cNum.length 인 이유 실제 데이터와 입력값 N이 불일치 할 수 있어서
      sum += cNum[i] - '0'; // 문자 값을 정수 형으로 변환하여 더해주기글
    }
    System.out.print(sum);
  }

}
