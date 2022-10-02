package task1;

import jdk.jshell.execution.Util;

import java.util.Scanner;


/**
 * @Author :
 * @Date : 27 Aug 2022
 *
 * """
 * This is main class for task 1,
 * you can run this class to get the expected result in console.
 * """
 *
 */


public class Main {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("\nPlease Enter your Unit Name : ");
        String unitName = input.nextLine();
        System.out.print("\nHow many Students are there in '" + unitName + "' unit : ");
        Integer noOfStudent = Utils.getIntegerInput(input);
        Double[] studentsMarks = new Double[noOfStudent];
        for (int i = 0; i < noOfStudent; i++) {
            System.out.print("\nPlease Enter mark for student " + (i + 1) + " : ");
            Double score = Utils.getDoubleInput(input);
            if (Utils.isScoreValid(score)) {
                studentsMarks[i] = score;
            } else {
                System.out.println("Please Enter a valid score!");
                i--;
            }




        }
        input.close(); //closing the scanner

        Utils.printStudentDetail(unitName, studentsMarks);
        System.out.println("Highest Score : " + Algorithm1.search(studentsMarks,true));
        System.out.println("Lowest Score : " + Algorithm1.search(studentsMarks,false));

        System.out.print("\nThe mean and SD for the marks are as follows!");
        System.out.print("\n================");

        System.out.print("\nMean : " + Algorithm2.CalculateMean(studentsMarks));
        System.out.print("\nPopulation Standard Deviation : " + Algorithm2.calculatePopulationStandardDeviation(studentsMarks));
        System.out.print("\nSample Standard Deviation : " + Algorithm2.calculateSampleStandardDeviation(studentsMarks));

        System.out.print("\n================");

    }






}
