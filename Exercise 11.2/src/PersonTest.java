import static org.junit.Assert.*;
import org.junit.Test;

public class PersonTest {

  @Test
  public void testToString() {
    Person p = new Person("John", "555 Eagle Way", "234-567-8901", "john@emich.edu");
    String name = "John";
    assertEquals("Person's name is John ", name, "John"); // TODO
  }
  @Test
  public void testToString2() {
    Student s = new Student("John", "555 Eagle Way", "234-567-8901", "john@emich.edu", "Freshman");
    String status = "Freshman";
    assertEquals("John is a Freshman", status, "Freshman");
    
  }
  @Test
  public void testToString3() {
    Faculty f = new Faculty()
  }

}
