import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    // You can test your method here
     /*System.out.println(isPrime(1));
     System.out.println(isPrime(4));
     System.out.println(isPrime(17));*/
     Scanner input = new Scanner(System.in);
     System.out.println("Enter a string");
     String msg = input.nextLine();
     int counts = 0;
     msg = msg.toLowerCase();
     for(int i = 0; i < msg.length() - 1; i++) { // traverse two letters zt a time
        String second = msg.substring(i, i + 2); 
        boolean condition = (second.equals("pa") || second.equals("po") || second.equals("pu") || second.equals("pe") || second.equals("pi"));
        if(condition) {
            counts++;
        }
     }
     System.out.println("Contains p followed by a vowel " + counts + " times");
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
