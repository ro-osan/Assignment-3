package task1;

import java.util.Scanner;

public class Utils {


    /**
     * @Author :
     * @Date : 31 Aug 2022
     *
     * """
     * This is utils class for task 1,
     * here all the support function is written that is required to complete
     * the task 1 assignment properly.
     * """
     *
     */
    public static Integer getIntegerInput(Scanner input){
        Integer userInput;
        while(true){
            if (input.hasNextInt()){
                userInput = input.nextInt();
                break;
            }else{
                System.out.print("\nPlease Enter valid number : ");
                input.next();
            }
        }
        return userInput;
    }

    public static Double getDoubleInput(Scanner input){
        Double userInput;
        while(true){
            if (input.hasNextDouble()){
                userInput = input.nextDouble();
                break;
            }else{
                System.out.print("\nPlease Enter valid number : ");
                input.next();
            }
        }
        return userInput;
    }

    public static Boolean isScoreValid(Double mark) {
        return ((mark >= 0) && (mark <= 100));
    }

    public static void printStudentDetail(String unitName, Double[] studentMarks) {
        System.out.println("Here is the list of Students marks in the '" + unitName + "' unit");
        for (int i = 1; i <= studentMarks.length; i++) {
            System.out.println("student " + i + " : " + studentMarks[i - 1]);
        }
    }
}
