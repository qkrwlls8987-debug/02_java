package com.greedy.level01.basic;

public class Calculator {

  /* 1. checkMethod() */
  public void checkMethod() {
    System.out.println("메소드 호출 확인");
  }

  /* 2. sum1to10() : 1~10 합 */
  public int sum1to10() {
    int sum = 0;
    for(int i = 1; i <= 10; i++) {
      sum += i;
    }
    return sum;
  }

  /* 3. checkMaxNumber(a, b) : 큰 수 출력 */
  public void checkMaxNumber(int a, int b) {
    int max = (a > b) ? a : b;
    System.out.println("두 수 중 큰 수는 " + max + "이다.");
  }

  /* 4. sumTwoNumber(a, b) : 합 반환 */
  public int sumTwoNumber(int a, int b) {
    return a + b;
  }

  /* 5. minusTwoNumber(a, b) : 차 반환 */
  public int minusTwoNumber(int a, int b) {
    return a - b;
  }
}