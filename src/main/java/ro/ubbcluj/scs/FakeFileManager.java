package ro.ubbcluj.scs;

/**
 * Created by Blenesi Attila on 4/8/16.
 */
public class FakeFileManager implements FileManager {

    private boolean valid;

    public boolean isValid(String name) {
        return valid;
    }

    public void setValid(boolean valid) {
        this.valid = valid;
    }
}
