import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class StudentTest {
    Student newStudent;

    @Before
    public void setUp(){
        newStudent = new Student(0, "name");
        newStudent.addGrade(90);
        newStudent.addGrade(95);
        newStudent.addGrade(95);
        newStudent.addGrade(100);
    }

    @Test
    public void testIdExists(){
        assertNotNull(newStudent.id);
    }

    @Test
    public void testNameExists(){
        assertNotNull(newStudent.name);
    }

    @Test
    public void testGetId(){
        assertEquals(newStudent.id, newStudent.getId(), 0);
    }

    @Test
    public void testGetName(){
        assertEquals(newStudent.name, newStudent.getName());
    }

    @Test
    public void testAddGrade(){
        newStudent.addGrade(90);
        assertTrue(newStudent.grades.contains(90));
    }

    @Test
    public void testGetGrades(){
        assertEquals(newStudent.grades, newStudent.getGrades());
    }

    @Test
    public void testGetAverage(){
        assertEquals(95, newStudent.getGradeAverage(), 0);
    }
}
