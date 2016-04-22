package ro.ubbcluj.scs;

import junit.framework.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Blenesi Attila on 2/29/16
 */
public class LogAnalyserTest {

    private LogAnalyser logAnalyser;
    private FakeWebService webService;

    @Before
    public void setUp() throws Exception {
        FileManagerFactory.getInstance().setFileManager(new FakeFileManager());
        logAnalyser = new LogAnalyser();
        logAnalyser.setWebService(webService);
    }

    @After
    public void tearDown() throws Exception {
        // Nothing to do ...
    }

    @Test(expected = IllegalArgumentException.class)
    public void isValidLogFileName_ToShort_ExceptionThrown() throws Exception {
        logAnalyser.isValidLogFileName("");
    }

    @Test
    public void isValidLogFileName_FileNameTooShort_CallWebService() {
        String name = "ab";
        logAnalyser.isValidLogFileName(name);
        Assert.assertEquals("Should be too short", webService.getLastError(), name + " Too short");
    }

    @Test
    public void isValidLogFileNameMock_FileNameTooShort_CallWebService(){
        WebService mockedWebService = Mockito.mock(WebService.class);
        logAnalyser.setWebService(mockedWebService);
        logAnalyser.isValidLogFileName("12");
        Mockito.verify(mockedWebService, Mockito.times(2)).logError("12 too short");
    }
}