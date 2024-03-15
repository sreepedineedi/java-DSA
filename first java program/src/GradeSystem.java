import java.util.Scanner;
public class GradeSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the science marks");
        float scienceMarks = input.nextFloat();
        System.out.println("enter the maths marks");
        float mathsMarks = input.nextFloat();
        System.out.println("enter the social");
        float social = input.nextFloat();
        System.out.println("enter the english marks");
        float english = input.nextFloat();
        System.out.println("enter the telugu marks");
        float telugu = input.nextFloat();
        float percentage = (scienceMarks + mathsMarks + social + english + telugu) / 5;
        String grade;
        if (percentage >= 90 && percentage <= 100) {
            grade = "A+";

        } else if (percentage >= 80 && percentage < 90) {
            grade = "A";

        } else if (percentage >= 70 && percentage < 80) {
            grade = "B";
        } else if (percentage >= 60 && percentage < 70) {
            grade = "b-";
        } else if (percentage >= 50 && percentage < 60) {
            grade = "c";

        } else if (percentage >= 40 && percentage < 50) {
            grade = "d";
        } else {
            grade = "F";
        }
        System.out.println("grade is " + grade);
    }



    }

