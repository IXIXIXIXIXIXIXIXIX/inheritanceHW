import org.junit.Before;
import org.junit.Test;
import staff.management.Manager;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    private Manager manager;

    @Before
    public void before(){
        manager = new Manager("Hank", "AA101112H", 50000.00, "Propane");
    }

    @Test
    public void hasName(){
        assertEquals("Hank", manager.getName());
    }

    @Test
    public void hasNiNumber(){
        assertEquals("AA101112H", manager.getNiNumber());
    }

    @Test
    public void hasSalary(){
        assertEquals(50000.00, manager.getSalary(), 0.01);
    }

    @Test
    public void hasDept(){
        assertEquals("Propane", manager.getDeptName());
    }

    @Test
    public void canRaiseSalary(){
        manager.raiseSalary(5.00);
        assertEquals(50005.00, manager.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus(){
        assertEquals(500.00, manager.payBonus(), 0.01);
    }
}
