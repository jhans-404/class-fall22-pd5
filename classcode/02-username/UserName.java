import java.util.Scanner;

public class UserName {
  public static void main(String[] args) {
    // create Scanner object
    Scanner s = new Scanner(System.in);

    // get String input from user
    System.out.print("Enter your first name: ");
    String firstName = s.nextLine();
    System.out.print("Enter your last name: ");
    String lastName = s.nextLine();

    // test output
    System.out.println("Hello " + getInitial(firstName) + "." + getInitial(lastName) + ".");

    generatePassword(8);
    s.close();
  } // end main method

  /*
   * Name: getInitial
   * Purpose: send back the first character (inital) of a name
   * Input: a name (String)
   * Return: a single character (String)
   */
  public static String getInitial(String n) {
    return n.substring(0, 1);
  } // end initialize method

  /*
   * Name: generatePassword
   * Purpose: send back a random String of numbers, upper/lower letters
   * Input: length of password (int)
   * Return: String
   */
  public static String generatePassword(int length) {
    String password = "";

    // generate a random number
    // 65 - 90 capital letter
    // 97 - 122 lower case
    // 33 - 47 special symbols
    int rand = (int)(Math.random()*(90-65+1) + 65);
    char c = (char)rand;
    System.out.println(rand + " " + c);
    // convert the int ---> character c =(char)i;

    // add the char to the password String

    return password;
  } // end generatePassword method











} // end class
