package ro.ubbcluj.scs;

import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

/**
 * Created by Blenesi Attila on 2/29/16
 */
@RunWith(Parameterized.class)
public class LogAnalyserTest {

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                { "abc.str", true }, { "abc.str1", false }, { "abc.str2", false }
        });
    }
    private LogAnalyser logAnalyser;

    @Parameterized.Parameter
    public String fInput;

    @Parameterized.Parameter
    public boolean fExpected;

    @Before
    public void setUp() throws Exception {
        logAnalyser = new LogAnalyser();
    }

    @After
    public void tearDown() throws Exception {
        // Nothing to do ...
    }

    @Ignore
    @Test(expected = IllegalArgumentException.class)
    public void isValidLogFileName_ToShort_ExceptionThrown() throws Exception {
        logAnalyser.isValidLogFileName("");
    }

    @Test
    public void isValidLogFileName_ValidName_ReturnsTrue() throws Exception{
        Assert.assertEquals(fExpected,logAnalyser.isValidLogFileName(fInput));
    }
}