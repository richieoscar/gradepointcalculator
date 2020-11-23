package utils;

import utils.DataManager;

import java.util.List;

public class Calculate {

    /**
     * Class constants
     *
     */

    private static final int A = 5;
    private static final int B = 4;
    private static final int C = 3;
    private static final int D = 2;
    private static final int E = 1;
    private static final int F = 0;


    /**
     * This method returns the course units sum total
     * @param courseUnits
     * @return
     */
    public static int totalCourseUnits(List<Integer> courseUnits){
        return sumCourseUnits(courseUnits);
    }


    /**
     * This methods calculates the total sum of the course units
     * @param units
     * @return
     */
    private static int sumCourseUnits(List<Integer> units){
        int total = 0;
       for(int items : units){
           total += items;

       }
      return total;
    }

    /**
     * This method returns the total Grade Sum Points of courses
     * @param grades
     * @param courseUnits
     * @return
     */

    public static double calculateGrades(List<String> grades, List<Integer> courseUnits){
        int totalNumberOfCourses = DataManager.getTotalCourseOffered();
            double  sum = 0;
        for (int i = 0; i <totalNumberOfCourses ; i++) {
            String grade = grades.get(i);
            int unit = courseUnits.get(i);
            sum += calculate(grade, unit);
            System.out.println("grades = " + grades + ", courseUnits = " + courseUnits +" = " +sum);
        }
        System.out.println();
        return  sum;
    }


    /**
     * This methods does the individual grade point calculation
     * Multiplies the grade entered by the corresponding course unit
     * @param grades
     * @param courseUnit
     * @return
     */

    private static int calculate(String grades, int courseUnit){
        int result = 0;
        switch (grades){
            case "A":
                if(grades.equals("A")){
                    result = A * courseUnit;
                }
                break;

            case "B":
                if (grades.equals("B")){
                    result = B * courseUnit;
                }
                break;
            case "C":
                if(grades.equals("C")){
                    result = C * courseUnit;
                }
                break;
            case "D":
                if (grades.equals("D")){
                    result = D * courseUnit;
                }
                break;
            case"E":
                if (grades.equals("E")){
                    result = E * courseUnit;
                }
                break;
            case "F":
                if (grades.equals("F")){
                    result = F * courseUnit;
                }
                break;
            default:
                return 0;
        }
        return result;
    }

    /**
     * This methods returns the Grade Point Result
     * @param gradePointSum
     * @param totalCourseUnit
     * @return
     */

    public  static double calculateGp(double gradePointSum, int totalCourseUnit){
         return calculate(gradePointSum, totalCourseUnit);
    }

    /**
     * This methods calculates the Grade Point result by dividing the to gradePointSum by the totalCourseUnits offered
     * @param gradePointSum
     * @param totalCourseUnits
     * @return
     */
    private static double calculate(double gradePointSum, int totalCourseUnits){
        double result = gradePointSum/ totalCourseUnits;
        return  result;
    }


    /**
     * This methods prints out the calculated results
     * @param totalGradePoint
     * @param totalCourseUnit
     */

    public static void printResult(double totalGradePoint, int totalCourseUnit, double result){
        System.out.println("Processing...");
        printLabel("Processing...");
        System.out.println();
        System.out.println("Total Grade Point: " +String.format("%.0f", totalGradePoint));
        System.out.println("Total Course Unit: " +totalCourseUnit);
        System.out.print("GP: " +String.format("%.2f",result));


    }

    /**
     * This method prints out the asterix
     * @param value
     */

    private static  void printLabel(String value){
        for (int i = 0; i < value.length(); i++) {
            System.out.print("*");

        }
    }





}
