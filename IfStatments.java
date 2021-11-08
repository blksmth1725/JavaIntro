public class IfStatments {

  public static void main(String[] args) {
    boolean value = false;
    boolean firstCondition = false;
    boolean secondCondition = true;

    if (value) {
      System.out.println("We are inside the if-statment");
    }

    if (firstCondition) {
      System.out.println("We are inside firstCondition if-statment");
      if (secondCondition) {
        System.out.println("We are inside secondCondition if-statement");
      }
    } else if (secondCondition) {
      System.out.println(5);
    }

    System.out.println("We are outside the if-statment");
  }
}
