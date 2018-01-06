/**
 * Created by alexandraqin on 4/14/15.
 */
public class Conditionals {

  public static void main (String args[]) {
    boolean b = isOdd(4);
    System.out.println(b);
    b = isMultipleOfThree(3);
    System.out.println(b);
    b = isOddAndIsMultipleOfThree(9);
    System.out.println(b);
    b = isOddAndIsMultipleOfThree2(8);
    System.out.println(b);
    fizzMultipleofThree(9);
    Person p = new Person("Logan");
    p.setCity("London");
    Person person = new Person("Waynetholimu");
    person.setCity("NewYork");
    System.out.println(fromLondon(person));
    longName(p);
    b = cigarParty(61,true);
    System.out.println(b);

  }

  private static boolean cigarParty(int i, boolean b) {
    if(i>=40 && b){
      return true;
    } else if (i>=40 && i <=60){
      return true;
    }
    return false;
  }

  private static void longName(Person person) {
    if (person.getName().length() > 5){
      System.out.println(person.getName());
    }else {
      System.out.println("Name is too short.");
    }
  }

  private static boolean fromLondon(Person person) {
    if (person.getCity().toLowerCase().equals("london")){
      return true;
    }
    return false;
  }

  private static void fizzMultipleofThree(int i) {
    if (i%3==0){
      System.out.println("fizz");
    } else {
      System.out.println(i);
    }
  }

  private static boolean isOddAndIsMultipleOfThree2(int i) {
    return isOdd(i) && isOddAndIsMultipleOfThree(i);
  }

  private static boolean isOddAndIsMultipleOfThree(int n) {
    if (n%3 == 0 && n%2 ==1){
      return true;
    }
    return false;
  }

  private static boolean isMultipleOfThree(int n) {
    if (n%3==0){
      return true;
    }
    return false;
  }

  private static boolean isOdd(int n) {
    if (n % 2 == 1){
      return true;
    }
    return false;
  }
}
