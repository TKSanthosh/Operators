public class Main
{
  public static void main (String[]args)
  {
    int a = 10;
    int b = 5;

    //ARITHMETIC OPERATORS
      System.out.println ("ARITHMETIC OPERATORS");
      System.out.println ("ADDITION: " + (a + b));
      System.out.println ("SUBTRACTION:" + (a - b));
      System.out.println ("MULTIPLICATION:" + (a * b));
      System.out.println ("DIVISION:" + (a / b));
      System.out.println ("MODULOS:" + (a % b));
      System.out.println ("POST INCREMENT:" + a++);
      System.out.println ("POST DECREMENT:" + b--);
      System.out.println ("PRE INCREMENT:" + ++a);
      System.out.println ("PRE DECREMENT:" + --b);

    //COMPARATIVE OPERATORS
      System.out.println ("COMPARATIVE OPERATORS");
      System.out.println ("GREATER:" + (b > a));
      System.out.println ("LESSER:" + (b < a));
      System.out.println ("GREATER OR EQUAL:" + (a >= b));
      System.out.println ("LESSER OR EQUAL:" + (a <= b));
      System.out.println ("EQUALITY:" + (a == b));

    //LOGICAL OPERATORS
      System.out.println ("LOGICAL OPERATORS");
      System.out.println ("AND:" + ((b > a) && (a <= b)));
      System.out.println ("OR:" + ((b < a) || (b > a)));
      System.out.println ("NOT:" + (a != b));

    //ASSIGNMENT OPERATORS
      System.out.println ("ASSIGNMENT OPERATORS");
      System.out.println ("ADDITION EQUALS:" + (a += 2));
      System.out.println ("SUBTRACTION EQUALS:" + (b -= 2));
      System.out.println ("MULTIPLICATION EQUALS:" + (b *= 2));
      System.out.println ("DIVISION EQUALS:" + (a /= 2));
      System.out.println ("MODULOS EQUALS:" + (b %= 2));
      System.out.println ("EQUALS:" + (a = 2));

    //BITWISE OPERATORS
      System.out.println ("BITWISE OPERATORS");
      System.out.println ("AND:" + (a & b));
      System.out.println ("OR:" + (a | b));
      System.out.println ("COMPLEMENT:" + (~b));
      System.out.println ("XOR:" + (a ^ b));
      System.out.println ("RIGHT SHIFT:" + (a >> 1));
      System.out.println ("LEFT SHIFT:" + (b << 1));
      System.out.println ("ZERO FILL:" + (b >>> a));
  }
}
