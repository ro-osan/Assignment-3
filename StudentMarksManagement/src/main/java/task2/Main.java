package task2;

import jdk.jshell.execution.Util;
import task1.Utils;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {


    /**
     * @Author :
     * @Date : 27 Aug 2022
     *
     * """
     * This is main class for task 2,
     * you can run this class to get the expected result in console.
     * """
     *
     */

    public static void main(String[] args) throws FileNotFoundException {
        String filePath = "src/main/resources/prog5001_students_grade_2022.csv";
        String delimiter = ",";
        ArrayList<Student> students = CSVReader.readFromFile(filePath, delimiter);
        Scanner input = new Scanner(System.in);
        simpleMenu(input,students);
        input.close();


    }

    public static void simpleMenu(Scanner input,ArrayList<Student> students){
        while (true) {

            System.out.println("====================================================");
            System.out.println("Please Enter One Of The Option Below!");
            System.out.println("====================================================");
            System.out.println("1 => Print All The Student Marks");
            System.out.println("2 => Print Student Marks Less Than a Threshold");
            System.out.println("3 => Print Top 10 Highest Student Marks");
            System.out.println("4 => Print Top 10 Lowest Student Marks");
            System.out.println("5 => Quit");
            System.out.println("====================================================");
            System.out.print("\n Your Option : ");
            String option = input.next();
            switch (option) {
                case "1":
                    printStudents(students);
                    break;
                case "2":
                    System.out.print("\n Enter Threshold Value : ");
                    double threshold = Utils.getDoubleInput(input);
                    printStudentWithLessThanGivenThreshold(threshold, students);
                    break;
                case "3":
                    printStudents(getTop10Highest(students));
                    break;
                case "4":
                    printStudents(getTop10Lowest(students));
                    break;
                case "5":
                    return;
                default:
                    System.out.println("Please Select Valid Option");


            }


        }
    }
    public static void printStudentWithLessThanGivenThreshold(double threshold, ArrayList<Student> students) {
        List<Student> studentWithLessThanThresholdMarks = students.stream().filter(student -> student.getTotalMarks() < threshold).collect(Collectors.toList());
        printStudents((ArrayList<Student>) studentWithLessThanThresholdMarks);
        System.out.print("\n--------------------------------------------------------------");
        System.out.println("\nTotal no of Students less than " + threshold + " marks are : " + studentWithLessThanThresholdMarks.size());
    }

    public static ArrayList<Student> getTop10Highest(ArrayList<Student> students) {
        Collections.sort(students, new Student());
        ArrayList<Student> top10Students = new ArrayList<>();
        int i = students.size() - 1;
        while (top10Students.size() < 10) {
            top10Students.add(students.get(i));
            i--;
        }
        return top10Students;
    }

    public static ArrayList<Student> getTop10Lowest(ArrayList<Student> students) {
        Collections.sort(students, new Student());
        ArrayList<Student> top10Students = new ArrayList<>();
        int i = 0;
        while (top10Students.size() < 10) {
            top10Students.add(students.get(i));
            i++;
        }
        return top10Students;

    }

    public static void printStudents(ArrayList<Student> students) {
        String column1Format = "%-30s";
        String column2Format = "%-20s";
        String column3Format = "%-20s";
        String column4Format = "%-10s";
        String formatInfo = column1Format + " " + column2Format + " " + column3Format + " " + column4Format;
        System.out.format(formatInfo, "Last Name", "First Name", "Assessment Marks", "Total Marks");
        System.out.println();
        System.out.format(formatInfo, "---------", "----------", "-----------------", "-----------");
        System.out.println();

        for (Student student : students) {
            System.out.format(formatInfo, student.getLastName(), student.getFirstName(), student.getA1() + ", " + student.getA2() + ", " + student.getA3(), student.getTotalMarks());
            System.out.println();
        }
    }


}
