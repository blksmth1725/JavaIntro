public class Loops {
  // Are used to execute statements repeatedly until a condition
  // is met

  // They are Ideal for iterrating over collections and performing
  // repetitive algorithms

  // Java has 3 kind's of loops => the "for", "while" & "do-while" loop

  public static void main(String[] args) {
    // for loops run for a set number of times (idealy)

    // for(initialization; termination; increament) {
    // statement || block to be executed
    // }

    // -------- FOR LOOP -------//

    // for (int count = 1; count <= 10; count++) {
    // System.out.println(count);
    // }

    // System.out.println("We have exited the loop");
    // }

    // -------- NESTED FOR LOOP -------//

    int[] arr1 = { 1, 2, 3, 4, 5 };
    int[] arr2 = { 6, 7, 8, 9 };

    for (int i = 0; i < arr1.length; i++) {
      for (int j = 0; j < arr2.length; j++) {
        System.out.println(arr1[i] * arr2[j]);
      }
    }

    // int count = 1;

    // -------- WHILE LOOP -------//

    // while (count <= 10) {
    // System.out.println(count);
    // count++;
    // }
    // System.out.println("We have excited the loop");

    // -------- DO-WHILE LOOP -------//
    // do {
    // System.out.println(count);
    // count++;
    // } while (count <= 10);

    // System.out.println("We have exited the loop");
  }
}
