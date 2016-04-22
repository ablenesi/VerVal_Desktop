package ro.ubbcluj.scs;

/**
 * Created by Blenesi Attila on 4/22/16.
 */
public class FakeWebService implements WebService {

    private String lastError;

    public void logError(String error) {
        lastError = error;
    }

    public String getLastError() {
        return lastError;
    }
}
