import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class CohortTest {

    Cohort jupiter = new Cohort();
    Cohort pluto = null;
    Student newStudent = new Student(7065432, "Will");
    Student newerStudent = new Student(7065433, "Bill");

    @Before
    public void setUp(){
        newStudent.addGrade(100);
        newerStudent.addGrade(50);
        jupiter.addStudent(newStudent);
        jupiter.addStudent(newerStudent);
    }

    @Test
    public void testCreateCohort(){
        assertNotNull(jupiter);
        assertNull(pluto);
    }

    @Test
    public void testAddStudent(){
        assertTrue("one student has been added", jupiter.getStudents().contains(newStudent));
    }

    @Test
    public void testGetStudents(){
        assertSame(newStudent, jupiter.getStudents().get(0));
        assertSame(newerStudent, jupiter.getStudents().get(1));
    }

    @Test
    public void testGetCohortAverage(){
        assertEquals(75, jupiter.getCohortAverage(), 0);
    }

    @Test
    public void testFindStudentById(){
        assertSame(newStudent, jupiter.findStudentById(7065432));
    }
}
