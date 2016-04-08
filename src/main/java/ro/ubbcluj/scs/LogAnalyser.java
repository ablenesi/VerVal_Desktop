package ro.ubbcluj.scs;

import java.util.IllegalFormatException;

/**
 * Created by Blenesi Attila on 2/29/16.
 */
public class LogAnalyser {

    private FileManager fileManager;

    public LogAnalyser(FileManager fileManager){
        this.fileManager = fileManager;
    }

    public void setFileManager(FileManager fileManager) {
        this.fileManager = fileManager;
    }

    public boolean isValidLogFileName(String name){
        if(name != null){
            return fileManager.isValid(name);
        }
        return false;
    }

}
