public class ReverseOrder {
  public static void main(String[] args) {
    String[] cities = { "Atlanta", "Charlotte", "Dallas", "Los Angeles", "New York", "Orlando", "Philadelphia",
        "Seattle" };

    /* reverse the order of the array below */

    // print the result
    for (int i = cities.length - 1; i < cities.length; i--) {
      System.out.println(cities[i]);
    }
  }
}
