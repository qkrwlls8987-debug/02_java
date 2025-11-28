package com.mins.section04.wrapper;

public class Application2 {
  public static void main(String[] args) {

    /* Wrapper class 종류 == 기본 자료형 종류 */

    /* parsing :
        문자열(String) 값을 다른 원하는 자료형으로 바꾸는 것
    */

    /* 문자열 -> 기본자료형 parsing */
    byte b = Byte.parseByte("1"); // "1" -> (byte) 1
    short s = Short.parseShort("2"); // "2" -> (short) 1
    int i = Integer.parseInt("4"); // "4" -> (int) 1
    long l = Long.parseLong("8"); // "8" -> (long) 8L
    float f = Float.parseFloat("4.0");
    double d = Double.parseDouble("8.0");
    boolean isTrue = Boolean.parseBoolean("true"); // "true"

    /* Character 는 parsing 기능을 제공하지 않는다. */
    // char ch = Character.parseChar -> parschar("c")
    char ch = "c".charAt(0);

  }
}
