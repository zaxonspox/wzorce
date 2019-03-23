package Wzorce;

public class PhpFormat implements Decor {

    private String tekst;
    private String wartosc;

    public PhpFormat( String rawText)
    {
        String[] splt = rawText.split("_");
        this.tekst = splt[0];
        this.wartosc = splt[1];
    }
    public String getText()//String tekst, String wartosc)
    {
        String fTekst;
        fTekst = "<?php/r/necho "+tekst+";/r/necho "+wartosc+";/r/n ?>";
        return fTekst;
    }
}
