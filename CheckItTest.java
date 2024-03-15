import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class CheckItTest {

    // Test cases for Predicate Coverage
    @Test
    public void testPredicateCoverageTrue() {
        assertTrue(CheckIt.checkIt(true, false, false));
    }

    @Test
    public void testPredicateCoverageFalse() {
        assertFalse(CheckIt.checkIt(false, false, false));
    }

    // Test cases for Clause Coverage
    @Test
    public void testClauseCoverageTrue() {
        assertTrue(CheckIt.checkIt(true, true, true));
    }

    @Test
    public void testClauseCoverageFalse() {
        assertFalse(CheckIt.checkIt(false, false, false));
    }

    // Test cases for CACC (Condition-Adequate Coverage Criterion)
    @Test
    public void testCACCFirstTrue() {
        assertTrue(CheckIt.checkIt(true, false, true));
    }

    @Test
    public void testCACCSecondTrue() {
        assertTrue(CheckIt.checkIt(false, true, true));
    }


    // Test cases for RACC (Relational-Adequate Coverage Criterion)


    @Test
    public void testRACCSecondTrue() {
        assertTrue(CheckIt.checkIt(false, true, true));
    }

    @Test
    public void testRACCTrue() {
        assertTrue(CheckIt.checkIt(true, true, true));
    }

}
