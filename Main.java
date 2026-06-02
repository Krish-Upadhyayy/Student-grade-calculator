import java.util.Scanner;

public class Main {

    // Function to calculate percentage
    public static double calculatePercentage(int totalMarks, int subjects) {
        return (double) totalMarks / subjects;
    }

    // Function to assign grade
    public static String assignGrade(double percentage) {

        if (percentage >= 90) {
            return "A+";
        } else if (percentage >= 80) {
            return "A";
        } else if (percentage >= 70) {
            return "B";
        } else if (percentage >= 60) {
            return "C";
        } else if (percentage >= 50) {
            return "D";
        } else {
            return "F";
        }
    }

    // Function to display result
    public static void displayResult(String name, int totalMarks,
                                     double percentage, String grade) {

        System.out.println("\n===== RESULT =====");
        System.out.println("Student Name : " + name);
        System.out.println("Total Marks  : " + totalMarks);
        System.out.printf("Percentage   : %.2f%%\n", percentage);
        System.out.println("Grade        : " + grade);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== Student Grade Calculator =====");

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Number of Subjects: ");
        int subjects = sc.nextInt();

        int totalMarks = 0;

        for (int i = 1; i <= subjects; i++) {
            System.out.print("Enter Marks for Subject " + i + ": ");
            int marks = sc.nextInt();

            while (marks < 0 || marks > 100) {
                System.out.print("Invalid marks! Enter between 0 and 100: ");
                marks = sc.nextInt();
            }

            totalMarks += marks;
        }

        double percentage = calculatePercentage(totalMarks, subjects);
        String grade = assignGrade(percentage);

        displayResult(name, totalMarks, percentage, grade);

        sc.close();
    }
}