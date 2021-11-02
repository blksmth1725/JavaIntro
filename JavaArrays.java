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

    System.out.println("The value of firstArr[1] is " + firstArr[1]);
    System.out.println("The length of secondArr is " + secondArr.length);
  }
}
