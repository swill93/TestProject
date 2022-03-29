
public class Employee extends Person {
  private String office;
  private double salary;
  private MyDate dateHired;



  public Employee(String name, String address, String phoneNumber, String email, String office,
      double salary) {
    super(name, address, phoneNumber, email);
    this.office = office;
    this.salary = salary;
    this.dateHired = new MyDate();
  }

  public String getOffice() {
    return office;
  }

  public double getSalary() {
    return salary;
  }

  public String getDateHired() {
    return dateHired.getMonth() + "/" + dateHired.getDay() + "/" + dateHired.getYear();
  }

  public void setOffice(String office) {
    this.office = office;
  }

  public void setSalary(double salary) {
    this.salary = salary;
  }

  public void setDateHired() {
    dateHired = new MyDate();
  }

  public String toString() {
    return super.toString() + "\nOffice: " + office + "\nSalary: $" + getSalary() + "\nDate hired: "
        + getDateHired();
  }

}