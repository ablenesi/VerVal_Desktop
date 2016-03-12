package ro.ubbcluj.scs;

import java.util.IllegalFormatException;

/**
 * Created by Blenesi Attila on 2/29/16.
 */
public class LogAnalyser {

    public static final String SUFFIX = ".str";

    public boolean isValidLogFileName(String name){
        if(name != null){
            if(name.length()<SUFFIX.length()){
                throw new IllegalArgumentException("Name is to short.");
            }
            return name.endsWith(SUFFIX);
        }
        return false;
    }

}
