import utils.DataManager;

import java.util.List;

public class Calculate {

    private static final int A = 5;
    private static final int B = 4;
    private static final int C = 3;
    private static final int D = 2;
    private static final int E = 1;
    private static final int F = 0;

    public static int sumCourseUnits(List<Integer> units){
        int total = 0;
       for(int items : units){
           total += items;

       }
      return total;
    }

    public static void calculateGrades(List<String> grades, List<Integer> courseUnits){
        int totalNumberOfCourses = DataManager.getTotalCourseOffered();
            int sum = 0;
        for (int i = 0; i <totalNumberOfCourses ; i++) {
            String grade = grades.get(i);
            int unit = courseUnits.get(i);
            sum += calculate(grade, unit);
            System.out.println("grades = " + grades + ", courseUnits = " + courseUnits +" = " +sum);
        }
        System.out.println("Total = " +sum);



    }

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

}
