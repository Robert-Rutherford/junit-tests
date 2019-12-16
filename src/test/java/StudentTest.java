import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class StudentTest {

    Student student;
    Student invalidID;
    Student invalidName;
    Student invalidGrades;

    @Before
    public void setUp(){
        student = new Student(48521, "Robert R");
        student.addGrade(98);
        student.addGrade(87);
        student.addGrade(100);
        student.addGrade(91);
        student.addGrade(70);

        invalidID = new Student(0,"James");
        invalidName = new Student(348251, "");
        invalidGrades = new Student(2348, "bob");

    }


    @Test
    public void TestIfValidStudent(){
        assertEquals(48521,student.getId());
        assertEquals("Robert R",student.getName());
        assertEquals(2348,invalidGrades.getId());
        assertEquals("bob",invalidGrades.getName());
        assertNotEquals("",student.getName());
        assertNotEquals(0,student.getId());

    }

    @Test
    public void TestIfValidAverage(){

        assertEquals(89.2,student.getGradeAverage(),0.5);
//        assertNotEquals();



    }



}
