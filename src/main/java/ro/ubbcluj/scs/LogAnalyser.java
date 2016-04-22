package ro.ubbcluj.scs;


/**
 * Created by Blenesi Attila on 2/29/16.
 */
public class LogAnalyser {

    private WebService webService;

    public boolean isValidLogFileName(String name) {
        isTheFileValid();

        if(webService != null && name.length()<3){
            webService.logError(name+" Too short");
        }
        return false;
    }

    public void isTheFileValid(){

    }

    public void setWebService(WebService webService) {
        this.webService = webService;
    }

    public WebService getWebService() {
        return webService;
    }
}
