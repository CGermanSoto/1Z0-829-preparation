package org.enricogiurin.ocp17.book.ch7.record;

import java.time.LocalDate;

public record RecordConstructor(int size, String brand, LocalDate expires) {

  public static int MAX_STORAGE = 100;

  //Overloaded constructor
  public RecordConstructor() {
    //For this reason, the first line must be a call to another constructor,
    this(0, "", LocalDate.now());
  }

  //Overloaded constructor
  public RecordConstructor(int size, String brand) {
    //For this reason, the first line must be a call to another constructor,
    this(size, brand, LocalDate.now());
  }

  //Overloaded constructor (mixed up order of arg)
  public RecordConstructor(int size, LocalDate expires, String brand) {
    this(size, brand, expires);
  }
}