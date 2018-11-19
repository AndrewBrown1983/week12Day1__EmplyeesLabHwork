import Staff.Management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {
    Manager manager;

    @Before
    public void setUp(){
        manager = new Manager("Jim", "FLK109802", 40000, "Sales");
    }

    @Test
    public void canGetManagerName() {
        assertEquals("Jim", manager.getName());
    }

    @Test
    public void canGetNInumber() {
        assertEquals("FLK109802", manager.getNumberNI());
    }

    @Test
    public void canGetSalary() {
        assertEquals(40000, manager.getSalary(), 0.01);
    }

    @Test
    public void canGetDeptName() {
        assertEquals("Sales", manager.getDeptName());
    }

    @Test
    public void canIncreaseSalary() {
        manager.raiseSalary(850.98);
        assertEquals(40850.98, manager.getSalary(), 0.01);
    }

    @Test
    public void preventNegativeValue() {
        manager.raiseSalary(-988);
        assertEquals(40000, manager.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus() {
        assertEquals(400, manager.payBonus(), 0.01);
    }

    @Test
    public void canChangeEmployeeName() {
        manager.setName("Bob");
        assertEquals("Bob", manager.getName());
    }

    @Test
    public void canChangeEmployeeName__notIfNullEmptyString() {
        manager.setName("");
        assertEquals("Jim", manager.getName());
    }

    @Test
    public void canChangeEmployeeName__notIfNullValue() {
        manager.setName(null);
        assertEquals("Jim", manager.getName());
    }
}
