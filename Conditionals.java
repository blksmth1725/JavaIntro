public class Conditionals {

  public static void main(String[] args) {
    int number1 = 4;
    int number2 = 9;

    int day = 4;
    String sentPrefix = "Today is";

    if (number1 % 2 == 0)
      System.out.println("The number " + number1 + " is even!");
    if (number2 % 2 != 0)
      System.out.println("The number " + number2 + " is odd!");

    switch (day) {
    case 1:
      System.out.println(sentPrefix + " Monday");
      break;
    case 2:
      System.out.println(sentPrefix + " Tuesday");
      break;
    case 3:
      System.out.println(sentPrefix + " Wednesday");
      break;
    case 4:
      System.out.println(sentPrefix + " Thursday");
      break;
    case 5:
      System.out.println(sentPrefix + " Friday");
      break;
    case 6:
      System.out.println(sentPrefix + " Saturday");
      break;
    case 7:
      System.out.println(sentPrefix + " Sunday");
      break;
    default:
      break;
    }
  }
}
