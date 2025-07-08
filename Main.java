/**
 * Add the methods for this calculator class to function.
 *
 * @author {your name}
 * @version 1.0
 */
class Calculator
{
  /**
   * adder adds two integers.
   */
  public int adder(final int one, final int two) { /* create this method */ return 0; }

  /**
   * subtracter subtracts two integers.
   */
  public int subtracter(final int one, final int two) { /* create this method */ return 0; }

  /**
   * multiplier multiplies two integers.
   */
  public int multiplier(final int one, final int two) { /* create this method */ return 0; }

  /**
   * divider divides two integers.
   */
  public float divider(final int one, final int two) { /* create this method */ return 0; }
}

/**
 * This class contains main method (program execution begins there).
 */
public class Main
{
  /**
   * This is the main method (you might have guessed).
   */
  public static void main(String[] args)
  {
    System.out.println("Welcome to the calculator app!\n");

    Calculator cl = new Calculator();
    int[][] tests = {{1,2}, {3,4}, {5,6}, {7,8}};

    for (int[] var : tests) {
      final int i     = cl.adder(var[0], var[1]); 
      final int j     = cl.subtracter(var[0], var[1]); 
      final int k     = cl.multiplier(var[0], var[1]); 
      final float l   = cl.divider(var[0], var[1]);
      
      System.out.print(String.join("\n",
        String.format("Adding %d and %d equals %d",       var[0], var[1], i),
        String.format("Substracting %d and %d equals %d", var[0], var[1], j),
        String.format("Multiplying %d and %d equals %d",  var[0], var[1], k),
        String.format("Dividing %d and %d equals %f",     var[0], var[1], l),
        "\n"
      ));
    }
  }
}
