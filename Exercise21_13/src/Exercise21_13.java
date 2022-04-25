import java.util.*;
public class Exercise21_13 {
  protected static Map[] boys = new Map[10];
  protected static Map[] girls = new Map[10]; 

  public static void main(String[] args) {
      // Create a Scanner
      Scanner input = new Scanner(System.in);

      getNames(); 

      boolean inquiry;

      do {
          // Tell the user to enter year, gender and a name
          System.out.print("Enter the year: ");
          String year = input.nextLine();
          System.out.print("Enter the gender: ");
          String gender = input.nextLine();
          System.out.print("Enter the name: ");
          String name = input.nextLine();

          // Display the ranking for the name
          System.out.println(getGender(gender.toUpperCase()) + 
              " name " + name + " is ranked #" + 
              getRank(year, gender.toUpperCase(), name) 
              + " in year " + year);

          // Prompt the user to enter another 
          // inquiry or exit the program
          System.out.print("Enter another inquiry? ");
          inquiry = input.nextLine().toUpperCase().equals("Y"); 

      } while (inquiry);
  }
  // Returns the specified gender 
  private static String getGender(String gender) {
      return gender.equals("M") ? "Boy" : "Girl";
}

//Stores names and ranks in the arrays 
private static void getNames() {
  for (int year = 2001, i = 0; year <= 2010 && i < 10; year++, i++) {
      // Create maps for boy and girl names 
      Map<String, String> mapBoys = new HashMap<>();
      Map<String, String> mapGirls = new HashMap<>();

try {
  java.net.URL url = new java.net.URL(
  "https://liveexample.pearsoncmg.com/data/babynamesranking" 
      + year + ".txt");

  // Create input file from url
  Scanner input = new Scanner(url.openStream());
  while (input.hasNext()) {
      String rank = input.next();
      mapBoys.put(input.next(), rank);
      input.next();
      mapGirls.put(input.next(), rank);
      input.next();
  } 
}
catch (java.net.MalformedURLException ex) {
  System.out.println("Invalid URL");
}
catch (java.io.IOException ex) {
  System.out.println("I/0 Errors: no such file");
}


boys[i] = mapBoys;
girls[i] = mapGirls;}
}
private static String getRank(
          String yr, String gender, String name) {
      int year = Integer.parseInt(yr) - 2001;

      if (gender.charAt(0) == 'M') {
          return boys[year].get(name) + "";
      }
      else
          return girls[year].get(name) + "";

  }
}

