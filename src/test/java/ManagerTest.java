import org.junit.Before;
import org.junit.Test;
import staff.management.Manager;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void setUp(){
        manager = new Manager("Joanna", "AB123456C", 50000.00, "Finance");
    }

    @Test
    public void canGetName() {
        assertEquals("Joanna", manager.getName());
    }

    @Test
    public void canGetDeptName() {
        assertEquals("Finance", manager.getDeptName());
    }

    @Test
    public void canGetNINumber() {
        assertEquals("AB123456C", manager.getNiNumber());
    }

    @Test
    public void canGetSalary() {
        assertEquals(50000.00, manager.getSalary(), 0.01);
    }

    @Test
    public void canRaiseSalary() {
        manager.raiseSalary(5000.00);
        assertEquals(55000.00, manager.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus() {
        assertEquals(500.00, manager.payBonus(), 0.01);
    }
}
