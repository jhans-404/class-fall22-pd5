import java.util.Scanner;

public class CoordinatePlane {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    String point1, point2;
    boolean isValid;
    do {
      System.out.print("Please enter a point in the form (x, y): ");
      // write a statement to store the input
      point1 = s.nextLine();

      // check if the user input the point correctly
      // if yes, continue code
      // if no, get the input again
      isValid = checkInput(point1);
      if (isValid != true) {
        System.out.println("Invalid entry!");
      }
    } while (isValid != true);

    do {
      System.out.print("Please enter a second point: ");
      // write a statement to store the input
      point2 = s.nextLine();

      // check if the user input the point correctly
      // if yes, continue code
      // if no, get the input again
      isValid = checkInput(point2);
      if (isValid != true) {
        System.out.println("Invalid entry!");
      }
    } while (isValid != true);

    // test your methods below:
    int x1 = getX(point1);
    int x2 = getX(point2);
    System.out.println(x1 + " " + x2);
    int y1 = getY(point1);
    int y2 = getY(point2);
    System.out.println(y1 + " " + y2);

  } // end main method

  /*
   * N: checkInput
   * P: determine whether or not the input followed correct format
   * I: String user typed in
   * R: ???
   */
  public static boolean checkInput(String p) {
    boolean status = true;

    // if the point's index of 0 is equal to "("
    // if (p.substring(0, 1).equals("(")) {
    //   status = true;
    // }
    // else {
    //   status = false;
    // }

    // is the opening parenthesis first?
    if (p.indexOf("(") != 0) {
      status = false;
    } // end first if statement
    // is there a comma and space?
    if (p.indexOf(", ") == -1) {
      status = false;
    } // end second if statement
    // is the closing parentesis last?
    if (p.indexOf(")") != p.length() - 1) {
      status = false;
    } // end third if statement

    return status;
  } // end checkInput method

  /*
   * N: getX
   * P: get the x-coordinate of the point
   * I: coordinate in the form (x, y) (String)
   * R: x-coordinate (int)
   */
  public static int getX(String point) {
    // determine where the comma is located
    int commaPos = point.indexOf(",");

    // grab substring from after parentesis up to comma
    String x = point.substring(1, commaPos);

    // return value back to main so it can be used later in the program
    return Integer.parseInt(x);
  } // end getX method

  /*
   * N: getY
   * P: get the y-coordinate of the point
   * I: coordinate in the form (x, y) (String)
   * R: y-coordinate (int)
   */
  public static int getY(String point) {
    // determine where the comma is located
    int spacePos = point.indexOf(" ");

    // grab substring from after parentesis up to comma
    String y = point.substring(spacePos + 1, point.length() - 1);

    // return value back to main so it can be used later in the program
    return Integer.parseInt(y);
  } // end getX method

  /*
   * N: quadrant
   * P: determine which quadrant the point lies in
   * I:
   * R:
   */


  /*
   * N: euclideanDistance
   * P: calculate the distance between two points
        sqrt((x2 - x1)^2 + (y2 - y1)^2)
   * I:
   * R:
   */


  /*
   * N: taxicabDistance
   * P: calculate the distance between two points
        abs(x2 - x1) + abs(y2 - y1)
   * I:
   * R:
   */


} // end class
