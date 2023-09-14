import java.util.Scanner;  // Import the Scanner class
//import java.util.stream.IntStream;

public class Main {
  
  public static void main (String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Enter a string: ");
    String input = scanner.nextLine().toLowerCase();
    
    char[] commonLetters = "etaio".toCharArray();
    boolean containsCommomLetter;
    
    for (int i = 0; i < input.length(); i++) {
      containsCommomLetter = false;
      for (char letters : commonLetters)
        if (input.charAt(i) == letters) {
          containsCommomLetter = true;
          break;
        }
      
      if (!containsCommomLetter)
        System.out.print(input.charAt(i));
    }
    


    if (args.length == Integer.MAX_VALUE) throw new Exception("EndDocument");
  }
}
