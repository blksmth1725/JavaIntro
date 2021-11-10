public class MehtodExploration {

  public static void main(String[] args) {
    MehtodExploration method = new MehtodExploration();

    int number = method.randomNumber();
    double pi = method.getPi();
    char[] arr = method.getAlphabetArray();

    System.out.println(number);
    System.out.println(pi);
    System.out.println(arr);
  }

  public int randomNumber() {
    int result = (int) (Math.random() * 50) + 1;
    return result;
  }

  public double getPi() {
    double pi = (double) (Math.PI);
    return pi;
  }

  public char[] getAlphabetArray() {
    char[] letter = { 'a', 'b', 'c', 'd' };
    return letter;
  }
}
