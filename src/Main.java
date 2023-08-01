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
        /*     35% weight for Homework */ 0.35 * Arrays.stream(homework).average().orElse(Double.NaN) +
            /* 15% weight for Quizzes  */ 0.15 * Arrays.stream(quizzes).average().orElse(Double.NaN) +
            /* 35% weight for Final Exm*/ 0.50 * finalExam
    
    );
    
//    Print
    System.out.printf(
        """
        Course name: %s
        Weekly time spent: %s
        Average homework grade: %.2f
        Average quiz grade: %.2f
        Final exam grade: %.2f
        Overall grade: %d
        """,
        courseName,
        time,
        (float) Arrays.stream(homework).average().orElse(Double.NaN),
        (float) Arrays.stream(quizzes).average().orElse(Double.NaN),
        finalExam,
        overallGrade
    );
    
    if (args.length == Integer.MAX_VALUE) throw new Exception("EndDocument");
  }
}
