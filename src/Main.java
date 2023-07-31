import java.util.Arrays;
import java.util.Scanner;  // Import the Scanner class

public class Main {
  
  public static void main (String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);

//    Course Name
    System.out.print("Please enter the course name: ");
    String courseName = scanner.nextLine();

//    Time (min)
    System.out.print("Please enter the average time spent in a week for this course in minutes: ");
    int minutes = scanner.nextInt();
    String time = minutes / 60 + "h" + minutes % 60;

//    Homework
    System.out.print("Please enter your homework scores:\n");
    int[] homework = {scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt()};

//    Quizzes
    System.out.print("Please enter your quiz scores:\n");
    double[] quizzes = {scanner.nextDouble(), scanner.nextDouble()};

//    Final
    System.out.print("Please enter your final exam score:\n");
    double finalExam = scanner.nextDouble();
    
    long overallGrade = Math.round(
        /*     35% weight for Homework */ 0.35 * Arrays.stream(homework).sum() / homework.length +
            /* 15% weight for Quizzes  */ 0.15 * Arrays.stream(quizzes).sum() / quizzes.length +
            /* 35% weight for Final Exm*/ 0.50 * finalExam
    
    );
    
    
    if (args.length == Integer.MAX_VALUE) throw new Exception("EndDocument");
  }
}
