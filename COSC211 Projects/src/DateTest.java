import org.junit.*;
import org.hamcrest.MatcherAssert;
import org.hamcrest.core.CombinableMatcher;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;


public class DateTest {

  @Test
  public final void getMonth_Jantest() {
    dateOfMonth d = new dateOfMonth(); // 
    d.setMonthString("January");
    int actualMonthNum = d.getMonth();
    int expectedMonthNum = 1;
    Assert.assertEquals(expectedMonthNum, actualMonthNum);
    
 
  }
  
  @Test
  public final void getMonth_MayTest() {
    dateOfMonth d = new dateOfMonth();
    d.setMonthString("May");
    int actualMonthNum = d.getMonth();
    int expectedMonthNum = 5;
    assertEquals(expectedMonthNum, actualMonthNum);
  }
  
  @Test
  public final void getMonth_test() {
    String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", 
"December"};
    int[] monthNums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
    dateOfMonth day = new dateOfMonth();
    for (int i = 0; i < months.length; i++) {
      day.setMonthString(months[i]);
      int actualNum = day.getMonth();
      int expectedNum = monthNums[i];
      assertEquals(expectedNum, actualNum);
    
  }

}

  
}