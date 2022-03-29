
public class Student extends Person {
  private String status;

  public Student(String name, String address, String phoneNumber, String email, String status) {
    super(name, address, phoneNumber, email);
    this.status = status;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }


  public String toString() {
    return super.toString() + "\nStatus: " + getStatus();
  }
}


class MyDate {
  private int year;
  private int month;
  private int day;

  public MyDate() {}

  public MyDate(int year, int month, int day) {
    this.year = year;
    this.month = month;
    this.day = day;
  }

  public int getYear() {
    return year;
  }

  public int getMonth() {
    return month;
  }

  public int getDay() {
    return day;
  }

  public void setYear(int year) {
    this.year = year;
  }

  public void setMonth(int month) {
    this.month = month;
  }

  public void setDay(int day) {
    this.day = day;
  }
}



