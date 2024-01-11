

public interface ZohoWebConnector extends Webconnector{

    void logout();
    void vaidateTitle();
    void validateLogin();

    void openBrowser(String browser);
    void navigate(String url);
    void quit();
    

}