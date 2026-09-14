
import java.util.*;

public class conditional {

    public static void main(String[] args) {

        // -- Simple If Statement -- //
        int dailyPractices = 12;

        if (dailyPractices >= 12) {
            System.out.println("Good Consistency");
        }

        // -- If Statement -- //
        int age = 100;

        if (age >= 18) {
            System.out.println("You are eligible to vote");
        }

        // -- If-Else Statement -- //
        int score = 50;

        if (score >= 100) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }

        // -- If-Else Statement -- //
        int target = 10;

        if (target >= 18) {
            System.out.println("Can vote");
        } else {
            System.out.println("Cannot vote");
        }

        // -- If-Else-If Ladder -- //
        int day = 3;

        if (day == 1) {
            System.out.println("Monday");
        } else if (day == 2) {
            System.out.println("Tuesday");
        } else if (day == 3) {
            System.out.println("Wednesday");
        } else if (day == 4) {
            System.out.println("Thursday");
        } else if (day == 5) {
            System.out.println("Friday");
        } else if (day == 6) {
            System.out.println("Saturday");
        } else {
            System.out.println("Sunday");
        }

        System.out.println("Ab mai line 59 me agaya hu");

        // -- Nested If-Else -- //
        boolean hasSubscription = true;
        int solvedProblems = 220;

        if (hasSubscription) {

            if (solvedProblems >= 200) {
                System.out.println("Unlock Advanced Sheet");
            } else {
                System.out.println("Practice More Problems");
            }

        } else {
            System.out.println("Upgrade to Premium");
        }

        // -- Nested If-Else -- //
        int height = 18;
        char gender = 'M';

        if (gender == 'M') {

            System.out.println("You are a Male");

            if (height >= 18) {
                System.out.println("You are a Male and height >= 18");
            } else {
                System.out.println("You are a Male and height < 18");
            }

        } else {

            System.out.println("You are not Male");

            if (height > 18) {
                System.out.println("You are not Male and height > 18");
            } else {
                System.out.println("You are not Male and height <= 18");
            }
        }

        // -- Ternary Operator -- //
        int streakDay = 5;

        String status = (streakDay >= 10)
                ? "Consistency"
                : "Irregular";

        System.out.println(status);

        // -- Ternary Operator -- //
        int age1 = 10;
        //int ans;
        int ans = (age1 >= 100) ? 12 : 14;
        //if(age1 >=100){
        //    ans = 14;
        //}else{
        //    ans = 42;
        //}

        System.out.println("Ans: " + ans);

        // -- Switch Statement -- //
        System.out.println("Enter the value for day:");

        Scanner sc = new Scanner(System.in);

        day = sc.nextInt();

        switch (day) {

            case 1:
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tuesday");
                break;

            case 3:
                System.out.println("Wednesday");
                break;

            case 4:
                System.out.println("Thursday");
                break;

            case 5:
                System.out.println("Friday");
                break;

            case 6:
                System.out.println("Saturday");
                break;

            default:
                System.out.println("Sunday");
        }

        // -- Switch Case: Marks Grading -- //
        System.out.println("Enter the Marks:");

        int marks = sc.nextInt();

        int grade = marks / 10;

        switch (grade) {

            case 10:
            case 9:
                System.out.println("Grade A -- Excellent");
                break;

            case 8:
                System.out.println("Grade B -- Very Good");
                break;

            case 7:
                System.out.println("Grade C -- Good");
                break;

            case 6:
                System.out.println("Grade D -- Average");
                break;

            case 5:
                System.out.println("Grade E -- Pass");
                break;

            default:
                System.out.println("Grade F -- Fail");
        }

        sc.close();
    }
}

