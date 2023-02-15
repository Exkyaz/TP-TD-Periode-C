import org.junit.Ignore;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

public class AthleteTest {

    //TDD : Test-Driven-Developement

    @Test
    public void testToString() {
        Athlete athlete = new Athlete();
        String athleteToString = athlete.toString();
        assertEquals("Coureur dossard : " + athlete.nbDossard, athleteToString);
        assertTrue(athlete.nbDossard<9999 && athlete.nbDossard>1);
    }

    @Test
    public void testPrendLeTemoin() {
        Athlete premierAthlete = new Athlete();
        Athlete deuxiemeAthlete = new Athlete();

        assertFalse(premierAthlete.temoin);
        assertFalse(deuxiemeAthlete.temoin);

        premierAthlete.prendLeTemoin();
        assertTrue(premierAthlete.temoin);
        assertFalse(deuxiemeAthlete.temoin);

        premierAthlete.passeLeTemoin(deuxiemeAthlete);
        assertFalse(premierAthlete.temoin);
        assertTrue(deuxiemeAthlete.temoin);
    }

    @Test
    public void testCourt() {
        Athlete athlete = new Athlete();

        assertEquals(0,athlete.dernierTemps, 0);

        athlete.prendLeTemoin();
        athlete.court();
        assertTrue(athlete.getDernierTemps()>=Athlete.MIN_TEMPS && athlete.getDernierTemps()<=Athlete.MAX_TEMPS);

    }
}