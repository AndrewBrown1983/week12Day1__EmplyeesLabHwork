import Staff.techStaff.DatabaseAdmin;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin databaseAdmin;

    @Before
    public void setUp(){
        databaseAdmin = new DatabaseAdmin("Sally", "HYU987663", 28000);
    }

    @Test
    public void canGetName() {
        assertEquals("Sally", databaseAdmin.getName());
    }

    @Test
    public void canGetNInumber() {
        assertEquals("HYU987663", databaseAdmin.getNumberNI());
    }

    @Test
    public void canGetSalary() {
        assertEquals(28000, databaseAdmin.getSalary(), 0.01);
    }

    @Test
    public void canIncreaseSalary() {
        databaseAdmin.raiseSalary(650.50);
        assertEquals(28650.50, databaseAdmin.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus() {
        assertEquals(280, databaseAdmin.payBonus(), 0.01);
    }
}
