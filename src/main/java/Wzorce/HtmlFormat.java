package Wzorce;

public class HtmlFormat implements Decor {

    private String tekst;
    private String wartosc;

    public HtmlFormat( String rawText)
    {
        String[] splt = rawText.split("_");
        this.tekst = splt[0];
        this.wartosc = splt[1];
    }

    public String getText()//String tekst, String wartosc)
    {
        String fTekst;
        fTekst = "<label>/r/n"+tekst+"/r/n<p>"+wartosc+"</p>/r/n</label>";
        return fTekst;
    }
}