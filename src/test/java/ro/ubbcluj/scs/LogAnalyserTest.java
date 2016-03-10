package ro.ubbcluj.scs;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Blenesi Attila on 2/29/16.
 */
public class LogAnalyserTest {

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testIsValidLogFileName() throws Exception {
        assertFalse(LogAnalyser.isValidLogFileName(null));
        assertFalse(LogAnalyser.isValidLogFileName(""));
        assertTrue(LogAnalyser.isValidLogFileName(LogAnalyser.SUFFIX));
        assertTrue(LogAnalyser.isValidLogFileName("abc"+LogAnalyser.SUFFIX));
        assertFalse(LogAnalyser.isValidLogFileName(LogAnalyser.SUFFIX+"abc"));
    }
}