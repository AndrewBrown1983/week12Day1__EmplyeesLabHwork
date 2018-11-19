import Staff.techStaff.Developer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void setUp(){
        developer = new Developer("John", "HYR349827", 50000);
    }

    @Test
    public void canGetManagerName() {
        assertEquals("John", developer.getName());
    }

    @Test
    public void canGetNInumber() {
        assertEquals("HYR349827", developer.getNumberNI());
    }

    @Test
    public void canGetSalary() {
        assertEquals(50000, developer.getSalary(), 0.01);
    }

    @Test
    public void canIncreaseSalary() {
        developer.raiseSalary(850.98);
        assertEquals(50850.98, developer.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus() {
        assertEquals(500, developer.payBonus(), 0.01);
    }


}
