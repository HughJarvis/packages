import org.junit.Before;
import org.junit.Test;
import staff.tech_staff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void setUp(){
        developer = new Developer("Hugh", "DE678910F", 90000.00);
    }

    @Test
    public void canGetName() {
        assertEquals("Hugh", developer.getName());
    }

    @Test
    public void canGetNINumber() {
        assertEquals("DE678910F", developer.getNiNumber());
    }

    @Test
    public void canGetSalary() {
        assertEquals(90000.00, developer.getSalary(), 0.01);
    }

    @Test
    public void canRaiseSalary() {
        developer.raiseSalary(5000.00);
        assertEquals(95000.00, developer.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus() {
        assertEquals(900.00, developer.payBonus(), 0.01);
    }
}
