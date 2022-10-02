import jdk.jshell.execution.Util;
import org.junit.Before;
import org.junit.Test;
import task1.Algorithm1;
import task1.Algorithm2;
import task2.Main;
import task2.Student;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Collections;

public class FunctionTest {

    ArrayList<Student> students = new ArrayList<>();

    Double[] studentMarks = {45.6,56.4,33.0,2.0,1.0,5.0,6.0,8.0};

    @Before
    public void populateStudent(){
        students.add(new Student("Intro To Python","12345","Raj","Vikram",24.5,54.5,11.0));
        students.add(new Student("Intro To Python","12346","Ramesh","Ramesh",25.5,4.5,41.0));
        students.add(new Student("Intro To Python","12347","Raju","Vikram",66.5,4.5,1.0));
        students.add(new Student("Intro To Python","12348","Rajdev","Vikram",14.5,4.5,61.0));
        students.add(new Student("Intro To Python","12349","singh","Vikram",4.5,5.5,31.0));
        students.add(new Student("Intro To Python","12350","Mohit","Vikram",4.5,54.0,4.0));
        students.add(new Student("Intro To Python","12351","Sah","Vikram",2.5,5.5,5.0));
        students.add(new Student("Intro To Python","12352","Kumar","Vikram",54.5,4.5,1.0));
        students.add(new Student("Intro To Python","12353","Roshan","Vikram",14.5,54.5,2.0));
        students.add(new Student("Intro To Python","12354","Dev","Vikram",2.5,54.5,1.0));
        students.add(new Student("Intro To Python","12355","Lily","Vikram",4.5,64.5,31.0));
        students.add(new Student("Intro To Python","12356","Mona","Vikram",2.5,4.5,1.0));

    }

    @Test
    public void testHighestRanker(){
            System.out.println("checking if We got the correct Student with highest marks");
            ArrayList<Student> toppers =  Main.getTop10Highest(students);
            assertEquals(toppers.get(0).getStudentId() , students.get(students.size()-1).getStudentId());
            String[] str=  "s,t,r,i,n,g".split(",");
    }


    @Test
    public void testLowestRanker(){

        System.out.println("checking if We got the correct Student with lowest marks");
        ArrayList<Student> lowers =  Main.getTop10Lowest(students);
        assertEquals(lowers.get(0).getStudentId() , students.get(0).getStudentId());
    }

    @Test
    public void testMean(){
        System.out.println("Checking if we got the correct mean");
        assertEquals(19.625,(double)Algorithm2.CalculateMean(studentMarks),0);
    }

    @Test
    public void testStandardDeviation(){
        System.out.println("Checking if we got the Population Standard deviation");
        assertEquals(20.61005519158064,(double)Algorithm2.calculatePopulationStandardDeviation(studentMarks),0);

        System.out.println("Checking if we got the Sample Standard deviation");
        assertEquals(22.033075785541804,(double)Algorithm2.calculateSampleStandardDeviation(studentMarks),0);
    }

    @Test
    public void testHighestScore(){
        System.out.println("Checking if we got the correct highest score");
        assertEquals(56.4,(double)Algorithm1.search(studentMarks,true),0);

    }

    @Test
    public void testLowestScore(){
        System.out.println("Checking if we got the correct highest score");
        assertEquals(1.0,(double)Algorithm1.search(studentMarks,false),0);
    }
}
