import java.util.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
  public static void main (String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Type the message to be shortened");
    String rawInput = scanner.nextLine().toLowerCase();

//    Algo 1:
    List<Object> AlgoOneOutput = algoOne(rawInput);
    System.out.println(AlgoOneOutput);
    
  }
  
  private static List<Object> algoOne (String input) {
    
    Object[] vowelsRemoved = RemovesVowels(input).toArray();
    int vowelCount = (int)vowelsRemoved[0];
    
    Object[] repeatsRemoved = RemovesRepeats((String)vowelsRemoved[1]).toArray();
    int repeatsCount = (int)repeatsRemoved[0];
    
    return Arrays.asList(vowelCount, repeatsCount, repeatsRemoved[1], vowelCount + repeatsCount);
  }
  
  private static List<Object> RemovesVowels (String input) {
    //    Removing Vowels
    HashSet<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
    StringBuilder vowelsRemovedStr = new StringBuilder();
    int vowelCount = 0;
    
    for (String word : input.split(" ")) {

//      Ignore the first letter of any word
      vowelsRemovedStr.append(word.charAt(0));
      
      for (char letter : word.substring(1).toCharArray()) {
        if (vowels.contains(letter)) vowelCount++;
        else vowelsRemovedStr.append(letter);
      }

//    Add the space back after words end
      vowelsRemovedStr.append(' ');
    }
    return Arrays.asList(vowelCount, vowelsRemovedStr.toString());
  }
  
  private static List<Object> RemovesRepeats (String input) {
    //    Removing Repeats
    int repeatsCount = 0;
    StringBuilder repeatsRemovedStr = new StringBuilder();
    for (int i = 0; i < input.length() - 1; i++)
      if (input.charAt(i) == input.charAt(i + 1)) repeatsCount++;
      else repeatsRemovedStr.append(input.charAt(i));
    return Arrays.asList(repeatsCount, repeatsRemovedStr.toString());
  }
}