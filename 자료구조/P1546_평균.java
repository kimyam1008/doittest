import java.util.Scanner;

/**
 * 문제 설명
 * 세준이는 기말고사를 망쳤습니다.
 * 그래서 점수를 조작해서 집에 가져가기로 합니다.
 * 1. 자기 점수 중 최대값(M)을 고릅니다.
 * 2. 그리고 모든 점수를 \frac{\text{점수}}{M} \times 100 으로 고칩니다.
 * 3. 이렇게 고친 새로운 점수들의 새로운 평균을 구하는 프로그램을 작성해야 합니다.
 * -------------------
 * 입력 조건
 * 1. 첫째 줄에 시험 본 과목의 개수 N이 주어집니다.(N \le 1000)
 * 2. 둘째 줄에 세준이의 현재 성적 N개가 공백으로 구분되어 주어집니다.(점수는 0보다 크거나 같고,
 *    100보다 작거나 같은 정수, 적어도 하나의 값은 0보다 큼)
 * --------------------
 * 핵심 포인트
 * 1. 최대값(M) 찾기: 점수를 조작하려면 기준이 되는 가장 큰 점수가 필요하므로, 입력 받은 점수 중 최댓값을 찾아야 합니다.
 * 2. 수식의 단순화 (수학적 트릭):
 *    - 각 점수마다 일일이 변환해서 더하고 나누려면 코드가 복잡해지고, 소수점 오차가 발생할 수 있습니다.
 *    - 수학적으로 식을 정리하면 한 번에 계산할 수 있습니다.
 *    - 코드의 주석이 바로 이 내용을 말합니다.
 * 3. 자료형 변환 (double): 평균은 소수점으로 나오기 때문에, 정수 나눗셈이 아닌 실수 나눗셈(100.0)을 해야 합니다.
 */


public class P1546_평균 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt(); // N 개
    int A[] = new int[N];
    for (int i = 0; i < N; i++) {
      A[i] = sc.nextInt();  // N 개 만큼 입력 받음
    }
    long sum = 0;
    long max = 0;
    for (int i = 0; i < N; i++) {
      System.out.println("A[i] = " + A[i]);
      if (A[i] > max)
        max = A[i]; // 가장 높은 점수를 받은것을 기준으로 max 값을줌
      sum = sum + A[i]; // 받은점수 다 합산

      System.out.println("i = " + i);
      System.out.println("max = " + max);
    }
    // 각각 계산이 아닌 수식 변환을 통해 총합에 대해 한번만 계산해주면 로직이 간단해 집니다.
    System.out.println(sum * 100.0 / max / N);
    // 18000 / 70 / 4
  }


  public static void main2(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int A[] = new int[N];

    for(int i = 0; i < N; i++){
      A[i] = sc.nextInt();  // N 개만큼 입력받기
    }

    long sum = 0;
    long max = 0;

    for(int i = 0; i < N; i++){
      if (A[i] > max){
        max = A[i];
        sum += A[i];
      }
    }

    System.out.println(sum * 100.0 / max / N);
    
  }

}
