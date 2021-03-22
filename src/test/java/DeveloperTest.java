import org.junit.Before;
import org.junit.Test;
import staff.techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {
        private Developer developer;

        @Before
        public void before(){
            developer = new Developer("Enrique", "EB551133R", 30000.00);
        }

        @Test
        public void hasName(){
            assertEquals("Enrique", developer.getName());
        }

        @Test
        public void hasNiNumber(){
            assertEquals("EB551133R", developer.getNiNumber());
        }

        @Test
        public void hasSalary(){
            assertEquals(30000.00, developer.getSalary(), 0.01);
        }

        @Test
        public void canRaiseSalary(){
            developer.raiseSalary(5.00);
            assertEquals(30005.00, developer.getSalary(), 0.01);
        }

        @Test
        public void canPayBonus(){
            assertEquals(300.00, developer.payBonus(), 0.01);
        }
}
