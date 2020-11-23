package utils;

import java.util.*;

public class DataManager {

    private static Scanner scanner = new Scanner(System.in);
    private static int TOTAL_COURSE_OFFERED = 0;
    private static String[] alphabets = {"A", "B", "C", "D"};
    private static String prompt = "   Gp Calculator ";
    private static String prompt2 = "Enter Number Of Courses Offered: ";
    private static String prompt3 = "Course Units Offered: ";
    private static String prompt4 = "Grades for Courses Offered: ";


    public static int getTotalCourseOffered() {
        return TOTAL_COURSE_OFFERED;
    }

    /**
     * This method gets the grades from the user
     * It returns a list of grades
     * public method
     *
     * @return
     */
    public static List<String> getGrades() {
        return get();
    }


    /**
     * This method gets the grades from the user
     *
     * This method processes the grades and returns valid list of grades
     * @return
     */
    private static List<String> get() {
        List<String> grades = new ArrayList<>();
        System.out.println(prompt.toUpperCase());
        printLabel(prompt);
        System.out.println();

        //handles the thrown exception
        try{
            System.out.print(prompt2);
            TOTAL_COURSE_OFFERED = scanner.nextInt();
            System.out.println();
        }catch (InputMismatchException e){
            System.out.println("Invalid Number");
        }

        System.out.println(prompt4.toUpperCase());
        printLabel(prompt4);
        System.out.println();

        //Verifies the input if less than zero
        if(verifyInput(TOTAL_COURSE_OFFERED)) System.out.println("Number cannot be less than zero");

        else {
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
            System.out.println();
        }
        return grades;
    }

    /**
     * verifies the input from the console if less than zero
     * @param input
     * @return
     */
    private static Boolean verifyInput(int input) {
     if (input<= 0)
         return true;
     else  return false;
    }

    /**
     * This method verifies the grade inputed
     * The standard grade types are used for verification of grade input
     * It returns a boolean
     *
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

    /**
     * Verifies the course Unit input
     * Standard course Units in schools are used to verify
     * Method can be maintained if more course units are available
     * @param courseUnit
     * @return
     */

    private static boolean verifyCourseUnit(int courseUnit) {

        //more course units can be added to be verified
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
     *
     * @return
     */

    public static List<Integer> getCourseUnits() {
        return  getUnits();
    }

    /**
     * This method processes and returns valid list of course Units.
     * @return
     */
    private static  List<Integer> getUnits(){
        List<Integer> courseUnits = new ArrayList<>();
        System.out.println(prompt3.toUpperCase());
        printLabel(prompt);
        System.out.println("");
        int units = 0;
        try {
            for (int i = 0; i < TOTAL_COURSE_OFFERED; i++) {
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
        System.out.println();
        return courseUnits;
    }

    /**
     * This methods prints the asterix
     * @param value
     */
    private static  void printLabel(String value){
        for (int i = 0; i < value.length(); i++) {
            System.out.print("*");

        }
    }

}



