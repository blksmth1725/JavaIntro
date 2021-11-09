public class StringMethods {
  public static void main(String[] args) {
    String str = "Hello";
    String s = new String("Hello");
    System.out.println(str.equals(s));

    // use the length() method
    System.out.println(str.length());

    // use the indexOf() method
    System.out.println(str.indexOf('H'));

    // use the toUpperCase() method
    System.out.println(str.toUpperCase());

    // use the toLowerCase() method
    System.out.println(str.toLowerCase());

    // use the equalsIgnoreCase() method
    System.out.println(str.equalsIgnoreCase("hello"));

    // use the substring() method
    System.out.println(str.substring(0, 4));

  }
}
