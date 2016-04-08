package ro.ubbcluj.scs;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Blenesi Attila on 2/29/16
 */
public class LogAnalyserTest {

    private LogAnalyser logAnalyser;

    @Before
    public void setUp() throws Exception {
        // With constructor
        logAnalyser = new LogAnalyser(new FakeFileManager());
        // Or with getter setter
        logAnalyser = new LogAnalyser();
        logAnalyser.setFileManager(new FakeFileManager());
    }

    @After
    public void tearDown() throws Exception {
        // Nothing to do ...
    }

    @Test(expected = IllegalArgumentException.class)
    public void isValidLogFileName_ToShort_ExceptionThrown() throws Exception {
        logAnalyser.isValidLogFileName("");
    }
}