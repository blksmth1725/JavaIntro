public class MehtodExploration {

  public static void main(String[] args) {
    MehtodExploration method = new MehtodExploration();

    int number = method.randomNumber();
    System.out.println(number);
  }

  public int randomNumber() {
    int result = (int) (Math.random() * 50) + 1;
    return result;
  }
}
