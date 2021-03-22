import org.junit.Before;
import org.junit.Test;
import staff.techStaff.DatabaseAdmin;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    private DatabaseAdmin databaseAdmin;

    @Before
    public void before(){
        databaseAdmin = new DatabaseAdmin("JoeJack", "PL789456D", 30000.00);
    }

    @Test
    public void hasName(){
        assertEquals("JoeJack", databaseAdmin.getName());
    }

    @Test
    public void hasNiNumber(){
        assertEquals("PL789456D", databaseAdmin.getNiNumber());
    }

    @Test
    public void hasSalary(){
        assertEquals(30000.00, databaseAdmin.getSalary(), 0.01);
    }

    @Test
    public void canRaiseSalary(){
        databaseAdmin.raiseSalary(5.00);
        assertEquals(30005.00, databaseAdmin.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus(){
        assertEquals(300.00, databaseAdmin.payBonus(), 0.01);
    }
}
