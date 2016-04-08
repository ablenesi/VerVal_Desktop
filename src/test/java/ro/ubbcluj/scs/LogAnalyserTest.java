package ro.ubbcluj.scs;

import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

/**
 * Created by Blenesi Attila on 2/29/16
 */

public class LogAnalyserTest {

    private LogAnalyser logAnalyser;
    private FakeFileManager fileManager;

    @Before
    public void setUp() throws Exception {
        fileManager = new FakeFileManager();
        logAnalyser = new LogAnalyser(fileManager);
    }

    @Test
    public void isValidLogFileName_ValidName_ReturnsTrue() throws Exception {
        fileManager.setValid(true);
        Assert.assertEquals(true, logAnalyser.isValidLogFileName("test.sdk"));
    }
}