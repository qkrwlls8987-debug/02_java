package com.mins.section02.encapssulation.problem1;

public class Monster {

  String name;
  int hp;

  public void sethp(int hp) {
    if (hp > 0) {
      /* this 참조 변수 : 만들어진 인스턴스의 주소를 저장하는 참조형 변수
       * - 샐성된 객체가 자신을 참조할 때 사용
       * */
      this.hp = hp;
      System.out.println("양수 값이 입력되어 몬스터의 체력을 입력 값으로 변경");
    } else {
      this.hp = 0;
      System.out.println("0 이하의 값이 입력되어 몬스터의 체력을 0으로 변경");
    }
  }
}
