package utils;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class DataManager {

    private static Scanner scanner = new Scanner(System.in);
    private static int TOTAL_COURSE_OFFERED = 0;

    public static int getTotalCourseOffered() {
        return TOTAL_COURSE_OFFERED;
    }



    /**
     * This method gets the grades from the user
     * It returns a list of grades
     *
     * @return
     */

    public static List<String> getGrades() {
        System.out.print("Enter Number of Courses Offered: ");
        TOTAL_COURSE_OFFERED = scanner.nextInt();
        List<String> grades = new ArrayList<>();

        try {
            for (int i = 0; i < TOTAL_COURSE_OFFERED; i++) {
                System.out.print("Enter Grades: ");
                String grade = scanner.next();
                if (verifyGrades(grade.toUpperCase())) {
                    grades.add(grade.toUpperCase());
                    continue;
                } else {
                    System.out.print("Invalid Grade was entered");
                    grades.clear();
                    break;
                }
            }

        } catch (InputMismatchException e) {
            System.out.println("Invalid Grade ");
            grades.clear();
        }
        return grades;
    }

    /**
     * This method verifies the grade inputed
     * It returns a boolean
     * @param grade
     * @return
     */

    private static Boolean verifyGrades(String grade) {
        switch (grade) {
            case "A":
                if (grade.equals("A")) return true;
            case "B":
                if (grade.equals("B")) return true;
            case "C":
                if (grade.equals("C")) return true;
            case "D":
                if (grade.equals("D")) return true;
            case "E":
                if (grade.equals("E")) return true;
            case "F":
                if (grade.equals("F")) return true;

            default:
                return false;

        }
    }

    private static boolean verifyCourseUnit(int courseUnit) {
        switch (courseUnit) {
            case 1:
                if (courseUnit == 1) return true;
            case 2:
                if (courseUnit == 2) return true;
            case 3:
                if (courseUnit == 3) return true;
            case 4:
                if (courseUnit == 4) return true;
            case 5:
                if (courseUnit == 5) return true;
            case 6:
                if (courseUnit == 6) return true;

            default:
                return false;
        }

    }

    /**
     * This method gets the course units
     * It returns a list of course units
     * It takes no argument
     * @return
     */

    public static List<Integer> getCourseUnits() {
        List<Integer> courseUnits = new ArrayList<>();
        System.out.print("Enter Number of courses offered: ");
        int totalCourseOffered = scanner.nextInt();
        int units = 0;
        try {
            for (int i = 0; i < totalCourseOffered; i++) {
                System.out.print("Enter Course Units: ");
                units = scanner.nextInt();
                if (verifyCourseUnit(units)) {
                    courseUnits.add(units);
                    continue;
                } else {
                    System.out.println("Invalid Course unit");
                    break;
                }
            }
        } catch (InputMismatchException e) {
            System.out.println(" Invalid Course Unit");
            courseUnits.clear();
        }
        return courseUnits;
    }

}



