import utils.Calculate;
import utils.DataManager;

import java.util.List;

public class GpCalculator {

    public static void main(String[] args) {
        //launches the application
      GpCalculator.start();
    }

    private static void start(){
        List<String> grades = DataManager.getGrades();
        List<Integer> units = DataManager.getCourseUnits();
        double totalGradePoints = Calculate.calculateGrades(grades, units);
        int totalCourseUnit = Calculate.totalCourseUnits(units);
        double result = Calculate.calculateGp(totalGradePoints,totalCourseUnit);
        Calculate.printResult(totalGradePoints, totalCourseUnit, result);

    }
}
