package ro.ubbcluj.scs;

/**
 * Created by Blenesi Attila on 3/25/16.
 */
public class FakeFileManager implements FileManager {

    public static final String FILE_EXTENSION = "log";

    public String getLogNameExt() {
        return FILE_EXTENSION;
    }
}
