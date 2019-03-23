package Wzorce;

public class JavaFormat implements Decor {

    private String tekst;
    private String wartosc;

    public JavaFormat( String rawText)
    {
        String[] splt = rawText.split("_");
        this.tekst = splt[0];
        this.wartosc = splt[1];
    }
    public String getText()//String tekst, String wartosc)
    {
        String fTekst;
        fTekst = "System.out.println(\""+tekst+" "+wartosc+"\");";
        return fTekst;
    }
}