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
    System.out.printf("Vowels removed: %d\nRepeats removed: %d\nAlgorithm 1 message: %s\nAlgorithm 1 characters saved: %d", (int)AlgoOneOutput.get(0), (int)AlgoOneOutput.get(1), AlgoOneOutput.get(2), (int)AlgoOneOutput.get(3));
    
  }
  static Character vowelPlaceholder = '`';
  private static List<Object> algoOne (String input) {
    
    List<Object> vowelsRemoved = RemovesVowels(input);
    List<Object> repeatsRemoved = RemovesRepeats((String)vowelsRemoved.get(1));
    int vowelCount = (int)vowelsRemoved.get(0);
    int repeatsCount = (int)repeatsRemoved.get(0);
    String output = RemovesAllOccurrences((String) repeatsRemoved.get(1), vowelPlaceholder);
    return Arrays.asList(vowelCount, repeatsCount, output, vowelCount + repeatsCount);
  }
  
  /**
   * Replaces vowels with the character vowelPlaceholder
   *
   * @param input the input character sequence
   * @return the input with all vowels replaced with vowelPlaceholder
   */
  private static List<Object> RemovesVowels (String input) {
    //    Removing Vowels
    HashSet<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
    StringBuilder vowelsRemovedStr = new StringBuilder();
    int vowelCount = 0;
    
    for (String word : input.split(" ")) {

//      Ignore the first letter of any word
      vowelsRemovedStr.append(word.charAt(0));
      
      for (char letter : word.substring(1).toCharArray()) {
        if (vowels.contains(letter)) {
          vowelCount++;
          vowelsRemovedStr.append(vowelPlaceholder);
        } else vowelsRemovedStr.append(letter);
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
//      Dont count the vowels
      if (input.charAt(i) == input.charAt(i + 1) && input.charAt(i) != vowelPlaceholder) repeatsCount++;
      else repeatsRemovedStr.append(input.charAt(i));
    return Arrays.asList(repeatsCount, repeatsRemovedStr.toString());
  }
  
  private static String RemovesAllOccurrences (String input, Character Character) {
    return input.replace(Character.toString(), "");
  }
}