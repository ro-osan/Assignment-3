package task2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class CSVReader {
/**
*  @Author :
 * @Date : 27 Aug 2022
 * """
 * This is CsvReader class which reads data from file and converts into Students objects.
 *
 * """
* */

    static ArrayList<Student> readFromFile(String filePath,String delimiter) throws FileNotFoundException {
        Scanner csvFileScanner = new Scanner(new File(filePath)); //parsing a CSV file into the constructor of Scanner class
        String unitName = "";
        ArrayList<Student> students = new ArrayList<>();

        while (csvFileScanner.hasNextLine()) {
            String[] currStudentDetailFromFile = csvFileScanner.nextLine().split(delimiter);
            if (currStudentDetailFromFile[0].startsWith("Unit")) {
                unitName = currStudentDetailFromFile[0].split(":")[1]; //split this line with :
                csvFileScanner.nextLine();
                continue;
            }
            //now for each line we will create student object
            Student student = createStudentObject(currStudentDetailFromFile, unitName);
            if (Objects.nonNull(student)){
                students.add(student);
            }


        }
        csvFileScanner.close();
        return students;
    }

    static Student createStudentObject(String[] currStudentDetailFromFile, String unitName) {
        if(currStudentDetailFromFile.length<1)return null;
        int len = currStudentDetailFromFile.length;
        String lastName = currStudentDetailFromFile[0];
        String firstName = len>1?currStudentDetailFromFile[1]:"";
        String studentId = len>2?currStudentDetailFromFile[2]:"";
        Double a1Marks = len>3?Double.parseDouble(currStudentDetailFromFile[3] != "" ? currStudentDetailFromFile[3] : "0"):0;
        Double a2Marks = len>4?Double.parseDouble(currStudentDetailFromFile[4] != "" ? currStudentDetailFromFile[4] : "0"):0;
        Double a3Marks = len>5?Double.parseDouble(currStudentDetailFromFile[5] != "" ? currStudentDetailFromFile[5] : "0"):0;

        return new Student(unitName, studentId, lastName, firstName, a1Marks, a2Marks, a3Marks);

    }
}
