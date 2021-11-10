public class MethodsWithParams {

  public static void main(String[] args) {
    MethodsWithParams self = new MethodsWithParams();

    // double[] arr = self.square(2, 4, 6, 5);
    // double[] arr2 = self.square2(2, 4, 6, 5);

    String firstWord = self.findFirstWord("Yikes", "Claire");
    System.out.println(firstWord);
    // System.out.println(arr);
    // System.out.println(arr2);
    // System.out.println(square3(2, 4, 6, 5));
  }

  // public double[] square(int a, int b, int c, int d) {
  // double[] result = { Math.pow(a, 2), Math.pow(b, 2), Math.pow(c, 2),
  // Math.pow(d, 2) };
  // return result;
  // }

  // public double[] square2(int a, int b, int c, int d) {
  // double[] result2 = { a * a, b * b, c * c, d * d };
  // return result2;
  // }

  // public static double[] square3(int a, int b, int c, int d) {
  // double[] result3 = { Math.pow(a, 2), Math.pow(b, 2), Math.pow(c, 2),
  // Math.pow(d, 2) };
  // return result3;
  // }

  public String findFirstWord(String word1, String word2) {
    char[] letterWord1 = word1.toCharArray();
    char[] letterWord2 = word2.toCharArray();

    for (int i = 0; i < letterWord1.length; i++) {
      if (letterWord1[i] < letterWord2[i]) {
        return word1;
      }
      if (letterWord1[i] > letterWord2[i]) {
        return word2;
      }
    }
    return word1;
  }
}
