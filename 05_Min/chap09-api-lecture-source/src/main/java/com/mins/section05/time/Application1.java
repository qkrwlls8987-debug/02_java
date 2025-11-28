package com.mins.section05.time;

import java.util.Date;

public class Application1 {
  public static void main(String[] args) {

    Date today = new Date(); // 해당 라인이 해석 되는 시간이 기록 됨
    System.out.println("today = " + today);

    /* 매개변수 있는 생성자 */
    Date date = new Date(1000L * 60 * 60 * 24 * 365);
    System.out.println("date = " + date);


  }
}
