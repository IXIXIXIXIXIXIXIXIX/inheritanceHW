import org.junit.Before;
import org.junit.Test;
import staff.management.Director;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class DirectorTest {

    private Director director;

    @Before
    public void before(){
        director = new Director("Buck", "BS369258S", 100000.00, "Propane", 300000.00);
    }

    @Test
    public void hasName(){
        assertEquals("Buck", director.getName());
    }

    @Test
    public void hasNiNumber(){
        assertEquals("BS369258S", director.getNiNumber());
    }

    @Test
    public void hasSalary(){
        assertEquals(100000.00, director.getSalary(), 0.01);
    }

    @Test
    public void hasDept(){
        assertEquals("Propane", director.getDeptName());
    }

    @Test
    public void canRaiseSalary(){
        director.raiseSalary(5.00);
        assertEquals(100005.00, director.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus(){
        // Note: bonus is 2% for directors
        assertEquals(2000.00, director.payBonus(), 0.01);
    }

    @Test
    public void hasBudget(){
        assertEquals(300000.00, director.getBudget(), 0.01);
    }

    @Test
    public void refusesToReduceSalary(){
        director.raiseSalary(-10000.00);
        assertEquals(100000.00, director.getSalary(), 0.01);
    }

    @Test
    public void canChangeName(){
        director.changeName("Bobby");
        assertEquals("Bobby", director.getName());
    }

    @Test
    public void refusesEmptyOrNullNameChange(){
        director.changeName("");
        assertEquals("Buck", director.getName());

        director.changeName(null);
        assertEquals("Buck", director.getName());
    }
}
