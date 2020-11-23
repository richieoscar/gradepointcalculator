import utils.Calculate;
import utils.DataManager;

import java.util.List;

public class GpCalculator {

    public static void main(String[] args) {

        GpCalculator gpCalculator = new GpCalculator();
        gpCalculator.start();

    }

    private void start(){
        List<String> grades = DataManager.getGrades();
        List<Integer> units = DataManager.getCourseUnits();
        double totalGradePoints = Calculate.calculateGrades(grades, units);
        int totalCourseUnit = Calculate.totalCourseUnits(units);
        double result = Calculate.calculateGp(totalGradePoints,totalCourseUnit);
        Calculate.printResult(totalGradePoints, totalCourseUnit, result);

    }
}
