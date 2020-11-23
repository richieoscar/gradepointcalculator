import utils.DataManager;

import java.util.Arrays;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        List<String> grades = DataManager.getGrades();
        List<Integer> units = DataManager.getCourseUnits();
        Calculate.calculateGrades(grades, units);

    }
}
