/**
 * JavaArrays
 */
public class JavaArrays {

  public static void main(String[] args) {

    int[] firstArr = new int[3];
    int[] secondArr = { 1, 2, 3, 4 };

    firstArr[0] = 1;
    firstArr[1] = 2;
    firstArr[2] = 3;

    int[] myInts = new int[] { 1, 2, 3, 4 };
    String languages[] = { "Java", "JavaScript", "SQL" };

    System.out.println(myInts[3]);
    System.out.println(languages[0]);

    String[] myArr = { "first", "second", "third" };
    for (int i = 0; i < myArr.length; i++) {
      System.out.println(myArr[i]);
    }

    System.out.println("The value of firstArr[1] is " + firstArr[1]);
    System.out.println("The length of secondArr is " + secondArr.length);
  }
}
