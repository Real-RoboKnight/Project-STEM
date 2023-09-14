import java.util.Scanner;  // Import the Scanner class
//import java.util.stream.IntStream;

public class Main {
  
  public static void main (String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);
    
    String input = scanner.nextLine().toLowerCase();
    int p = 0;
    
    char[] vowels = {'a', 'e', 'i', 'o', 'u'};
    for (int i = 0; i < input.length() - 1; i++) {
      for (char vowel : vowels)
        if (input.substring(i, i+2).equals("p" + vowel))
          p++;
    }
    
    System.out.printf("Contains p followed by a vowel %d times.", p);


    if (args.length == Integer.MAX_VALUE) throw new Exception("EndDocument");
  }
}
