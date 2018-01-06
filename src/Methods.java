/**
 * Created by alexandraqin on 4/14/15.
 */
public class Methods {

  public static void main (String args[]) {
    int n = calculateSquare(2);
    System.out.println(n);
    double d = calculateSquareRoot(4);
  }

  private static double calculateSquareRoot(int i) {
    return Math.sqrt(i);
  }

  public static int calculateSquare(int i) {
    return i * i;
  }

//  public static void
}
