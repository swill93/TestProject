import static org.junit.Assert.*;
import org.junit.Test;

public class SquareTest {

  @Test
  public void testGetArea() {
    double actual = Math.pow(2.0, 2.0);
    double expected = 4.0;
    assertEquals(expected, actual, 0);
  }
  
  @Test
  public void testGetPerimeter() {
  double actual = 8.0 * 4;
  double expected = 32.0;
  assertEquals(expected, actual, 0);
  }
   

}
