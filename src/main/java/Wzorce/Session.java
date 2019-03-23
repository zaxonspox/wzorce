package Wzorce;

public class Session {

    private static Session ses;
    private String user = null;
    private String lang = "pl-PL";

    private Session(){
        // uniemożliwienie stworzenia kolejnej instancji poprzez konstruktor
    }
    public static Session getInstance()
    {   // pozwala utworzyć tylko jedną instakcję, a później odnosić się tylko do niej
        if( ses == null )
            ses = new Session();
        return ses;
    }

    public void setLang(String lang)
    {
        this.lang=lang;
    }
    public String getLang()
    {
        return lang;
    }
    public void loginUser(String user)
    {
        this.user=user;
    }
    public String getUser()
    {
        return user;
    }
    public String logoutUser()
    {
        String user = this.user;
        this.user = null;
        return "Użytkownik "+ user + " został wylogowany";
    }
}
