package ro.ubbcluj.scs;

/**
 * Created by Blenesi Attila on 2/29/16.
 */
public class LogAnalyser {

    public LogAnalyser() {}

    public boolean isValidLogFileName(String name) {
        if (name != null) {
            if (name.length() < FileManagerFactory.getInstance().getFileManager().getLogNameExt().length() + 2) {
                throw new IllegalArgumentException("Name is to short.");
            }
            return name.endsWith("." + FileManagerFactory.getInstance().getFileManager().getLogNameExt());
        }
        return false;
    }
}
