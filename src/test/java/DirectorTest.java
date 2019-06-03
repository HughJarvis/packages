import org.junit.Before;
import org.junit.Test;
import staff.management.Director;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void setUp(){
        director = new Director ("Milo", "JK151617L", 120000, "Finance", 6000000);
    }

    @Test
    public void canGetName() {
        assertEquals("Milo", director.getName());
    }

    @Test
    public void canGetDeptName() {
        assertEquals("Finance", director.getDeptName());
    }

    @Test
    public void canGetNINumber() {
        assertEquals("JK151617L", director.getNiNumber());
    }

    @Test
    public void canGetSalary() {
        assertEquals(120000.00, director.getSalary(), 0.01);
    }


    @Test
    public void canGetBudget() {
        assertEquals(6000000, director.getBudget(), 0.01);
    }

    @Test
    public void canRaiseSalary() {
        director.raiseSalary(5000.00);
        assertEquals(125000.00, director.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus() {
        assertEquals(2400.00, director.payBonus(), 0.01);
    }
}
