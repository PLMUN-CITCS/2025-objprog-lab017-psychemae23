import java.util.Scanner;

public class GradeCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int score = getStudentScore(scanner);
        String grade = calculateGraade(score);

        System.out.println("Your Grade is:"+ grade);
    }
    public static int getStudentScore(Scanner 
    scanner) {
        System.out.println("Enter your score:");
        return scanner.nextInt();
    }

    public static String calculateGrade(int score) {
        if (score >=90) {
            return "A"
        } else if (score >=80) {
            return "B"
        } else if (score >=70) {
            return "C"
        } else if (score >=60) {
            return "D"
        } else { 
            return "F"
    }
    }
}