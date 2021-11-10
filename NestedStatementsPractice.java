public class NestedStatementsPractice {
  public static void main(String[] args) {
    String[] firstNames = { "Adam", "Alexis", "Dennis", "Jose", "Jessica", "Meghan", "Memphis", "Nicky", "Sarah",
        "William" };
    String[] lastNames = { "Adamson", "Bond", "Brown", "Johnson", "Gallagher", "Smith", "Thompson", "Perez", "Snow",
        "Tran" };

    for (int first = 0; first < firstNames.length; first++) {
      for (int last = 0; last < lastNames.length; last++) {
        System.out.println(firstNames[first] + " " + lastNames[last]);
      }
    }
  }
}
