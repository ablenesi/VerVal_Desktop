package ro.ubbcluj.scs;

/**
 * Created by Blenesi Attila on 2/29/16.
 */
public class LogAnalyser {

    private FileManager fileManager;

    public LogAnalyser() {
        this.fileManager = FileManagerFactory.getInstance().getFileManager();
    }

    public boolean isValidLogFileName(String name) {
        if (name != null) {
            if (name.length() < fileManager.getLogNameExt().length() + 2) {
                throw new IllegalArgumentException("Name is to short.");
            }
            return name.endsWith("." + fileManager.getLogNameExt());
        }
        return false;
    }
}
