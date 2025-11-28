package com.mins.section02.string;

public class Application2 {
  public static void main(String[] args) {

    /* String의 불변성
    * - String은 한 번 값을 저장하면 바꿀 수 없다 (final field)
    * - 바꾸고 싶으면 새로운 String 객체를 생성하여
    *   해당 주소를 참조변수에 대입을 한다
    * */

    /* Heap > Constant Poll(상수 풀)
    * - "" 리터럴 표기법을 이용해 생성된 문자열이 저장되는 공간
    * - 동일한 값을 가진 문자열 인스턴스를 단일 인스턴스로 관리한다
    * */

    /* String 객체를 만드는 방법
    * 1) String s1 = "abcd";
    *   -> Constant Pool에 생성
    *
    * 2) String s2 = new String("abcd")
    *   -> Heap 메모리 영역에 생성
    * */

    String str1 = "java";
    String str2 = "java";
    String str3 = new String("java");
    String str4 = new String("java");

    System.out.println("str1 == str2 : " + (str1 == str2));
    System.out.println("str2 == str3 : " + (str2 == str3));
    System.out.println("str3 == str4 : " + (str3 == str4));

    /* 하지만 4개의 문자열 모두 동일한 hashCode값을 가진다.
     * 동일한 문자열은 동일한 hashCode값을 반환하도록 재정의 되어 있기 때문이다.
     * */
    System.out.println("str1의 hashCode : " + str1.hashCode());
    System.out.println("str2의 hashCode : " + str2.hashCode());
    System.out.println("str3의 hashCode : " + str3.hashCode());
    System.out.println("str4의 hashCode : " + str4.hashCode());
    System.out.println(System.identityHashCode(str1));
    System.out.println(System.identityHashCode(str2));
    System.out.println(System.identityHashCode(str3));
    System.out.println(System.identityHashCode(str4));

  }
}
