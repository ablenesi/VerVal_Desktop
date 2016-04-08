package ro.ubbcluj.scs;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

/**
 * Created by Blenesi Attila on 3/25/16.
 */
@RunWith(Parameterized.class)
public class LogAnalyserParameterizedTest {

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
        FileManagerFactory.getInstance().setFileManager(new FakeFileManager());
        logAnalyser = new LogAnalyser();
    }

    @After
    public void tearDown() throws Exception {
        // Nothing to do ...
    }

    @Test
    public void isValidLogFileName_validName_returnsTrue() throws Exception {
        Assert.assertEquals(fExpected, logAnalyser.isValidLogFileName(fInput));
    }
}
