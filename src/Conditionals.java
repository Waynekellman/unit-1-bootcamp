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
    int n = caughtSpeeding(81, false);
    System.out.println(n);
    String s = alarmClock(1, false);
    System.out.println(s);
    n = greenLottery(10,120,0);
    System.out.println(n);
    n = blackJack(22,19);
    System.out.println(n);
    b= evenlySpaced(2,6,4);
    System.out.println(b);
  }

  private static boolean evenlySpaced(int i, int i1, int i2) {
    int dif1 = i - i1;
    int dif2 = i1 - i2;

    if (dif1 == dif2){
      return true;
    }
    return false;
  }

  private static int blackJack(int i, int i1) {
    //idk what to do if they are the same number so i'm just returning 0.
    int dif1 = 21 - i;
    int dif2 = 21 - i1;
    if (i > 21 && i1 > 21){
      return 0;
    } else if (i > 21){
      return i1;
    } else if (i1 > 21){
      return i;
    }
    if (dif1 > dif2){
      return i1;
    } else if (dif2 > dif1){
      return i;
    }
    return 0;
  }

  private static int greenLottery(int i, int i1, int i2) {
    if(i == i2&& i == i1){
      return 20;
    }else if (i1 == i || i1 == i2 || i == i2){
      return 10;
    } else {
      return 0;
    }
  }

  private static String alarmClock(int i, boolean b) {
    switch (i){
      case 0:
          return "off";
      case 1:
        if (!b){
          return "7:00";
        } else {
          return "10:00";
        }
      case 2:
        if (!b){
          return "7:00";
        } else {
          return "10:00";
        }
      case 3:
        if (!b){
          return "7:00";
        } else {
          return "10:00";
        }
      case 4:
        if (!b){
          return "7:00";
        } else {
          return "10:00";
        }
      case 5:
        if (!b){
          return "7:00";
        } else {
          return "10:00";
        }
      case 6:
          return "off";
      default:
          return "not valid";
    }
  }

  private static int caughtSpeeding(int i, boolean b) {
    if (b){
      return 0;
    }
    if(i <= 60) {
      return 0;
    } else if (i <= 80){
      return 1;
    } else {
      return 2;
    }
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
