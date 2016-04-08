package ro.ubbcluj.scs;

/**
 * Created by Blenesi Attila on 2/29/16.
 */
public class Main {
    public static void main(String[] args) {
        LogAnalyser logAnalyser = new LogAnalyser(new AtomReactorImpl());
        System.out.println(logAnalyser.isValidLogFileName("test.filename"));
    }
}