package com.thoughtworks.capability.gtb;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Calendar;

/**
 * 对任意日期获取下一个工作日, 不考虑节假日
 *
 * @author itutry
 * @create 2020-05-15_17:20
 */
public class Practice2 {

  public static LocalDate getNextWorkDate(LocalDate date) {
    LocalDate resDate = LocalDate.from(date);
    do {
      resDate = resDate.plusDays(1);
    } while (resDate.getDayOfWeek().equals(DayOfWeek.SATURDAY) || resDate.getDayOfWeek().equals(DayOfWeek.SUNDAY));
    return resDate;
  }
}
