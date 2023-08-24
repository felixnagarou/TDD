package org.example;

import org.example.Exercice001.GradingCalculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GradingCalculatorTest {


    @Test
    public void  testGetGradeFirstScenario(){
        GradingCalculator calculator = new GradingCalculator();

        //scénario 1
        calculator.setScore(95);
        calculator.setAttendancePercentage(90);
        char grade = calculator.getGrade();

        Assertions.assertEquals('A', grade);
    }

    public void  testGetGradeScenario2(){
        GradingCalculator calculator = new GradingCalculator();

        //scénario 1
        calculator.setScore(85);
        calculator.setAttendancePercentage(90);
        char grade = calculator.getGrade();

        Assertions.assertEquals('A', grade);
    }


    public void  testGetGradeScenario3(){
        GradingCalculator calculator = new GradingCalculator();

        //scénario 1
        calculator.setScore(65);
        calculator.setAttendancePercentage(90);
        char grade = calculator.getGrade();

        Assertions.assertEquals('C', grade);
    }

    public void  testGetGradeScenario4(){
        GradingCalculator calculator = new GradingCalculator();

        //scénario 1
        calculator.setScore(95);
        calculator.setAttendancePercentage(65);
        char grade = calculator.getGrade();

        Assertions.assertEquals('B', grade);
    }

    public void  testGetGradeScenario5(){
        GradingCalculator calculator = new GradingCalculator();

        //scénario 1
        calculator.setScore(95);
        calculator.setAttendancePercentage(55);
        char grade = calculator.getGrade();

        Assertions.assertEquals('F', grade);
    }

    public void  testGetGradeScenario6(){
        GradingCalculator calculator = new GradingCalculator();

        //scénario 1
        calculator.setScore(65);
        calculator.setAttendancePercentage(55);
        char grade = calculator.getGrade();

        Assertions.assertEquals('F', grade);
    }

    public void  testGetGradeScenario7(){
        GradingCalculator calculator = new GradingCalculator();

        //scénario 1
        calculator.setScore(50);
        calculator.setAttendancePercentage(90);
        char grade = calculator.getGrade();

        Assertions.assertEquals('F', grade);
    }


}
