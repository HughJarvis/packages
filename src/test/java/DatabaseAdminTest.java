import org.junit.Before;
import org.junit.Test;
import staff.tech_staff.DatabaseAdmin;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin databaseAdmin;

    @Before
    public void setUp() {
        databaseAdmin = new DatabaseAdmin("Ruth", "GH111213I", 60000.00);
    }

    @Test
    public void canGetName() {
        assertEquals("Ruth", databaseAdmin.getName());
    }

    @Test
    public void canGetNINumber() {
        assertEquals("GH111213I", databaseAdmin.getNiNumber());
    }

    @Test
    public void canGetSalary() {
        assertEquals(60000.00, databaseAdmin.getSalary(), 0.01);
    }

    @Test
    public void canRaiseSalary() {
        databaseAdmin.raiseSalary(5000.00);
        assertEquals(65000.00, databaseAdmin.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus() {
        assertEquals(600.00, databaseAdmin.payBonus(), 0.01);
    }
}
