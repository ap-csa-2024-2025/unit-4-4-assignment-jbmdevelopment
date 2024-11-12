import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    // You can test your method here
     System.out.println(isPrime(1));
     System.out.println(isPrime(4));
     System.out.println(isPrime(17));
  }

  public static boolean isPrime(int N)
  {
    int counter = 0;
    if(N == 0) {
      return false;
    }
    for(int i = N; i > 0; i--) {
       if(N % i == 0) {
          counter++;
       }
    }
    if(counter == 2) {
      return true;
    }
    // TODO: Replace and write your code below
    return false;
  }
}
