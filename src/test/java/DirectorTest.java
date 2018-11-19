import Staff.Management.Director;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void setUp(){
        director = new Director("Bill", "KLJ973948", 75000, "Sales", 500000);
    }

    @Test
    public void canGetName() {
        assertEquals("Bill", director.getName());
    }

    @Test
    public void canGetNInumber() {
        assertEquals("KLJ973948", director.getNumberNI());
    }

    @Test
    public void canGetSalary() {
        assertEquals(75000, director.getSalary(), 0.01);
    }

    @Test
    public void canGetDeptName() {
        assertEquals("Sales", director.getDeptName());
    }

    @Test
    public void canGetBudget() {
        assertEquals(500000, director.getBudget(), 0.01);
    }

    @Test
    public void canIncreaseSalary() {
        director.raiseSalary(5000);
        assertEquals(80000, director.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus() {
        assertEquals(1500, director.payBonus(), 0.01);
    }
}
