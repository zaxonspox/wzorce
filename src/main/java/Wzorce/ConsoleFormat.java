package Wzorce;

public class ConsoleFormat implements Decor {

    private int dlugosc = 8;    // ustalona długość Definicji
    private String tekst;
    private String wartosc;

    public ConsoleFormat( String rawText, int dlugosc )
    {
        this.dlugosc = dlugosc;
        String[] splt = rawText.split("_");
        this.tekst = splt[0];
        this.wartosc = splt[1];
    }

    public String getText()//String tekst, String wartosc)
    {   // uzupełnia ciąg znaków do odpowiedniej długości
        String fTekst = ""; // sformatowany tekst
        String spcs = "";   // ciąg uzupełnienia
        char spc = ' ';     // znak uzupełniający
        char colon = ':';   // znak oddielający
        int ileSpc = 0;     // ile będzie spacji
        int dlTekstu = tekst.length();
        if( dlTekstu > this.dlugosc )
        {   // tekst jest za długi - przytnij
            int zaDlugi = dlTekstu-this.dlugosc;     // o ile za długi - potem odejmiesz od tekstu
            fTekst = tekst.substring(0, dlTekstu-zaDlugi).toUpperCase() + colon + spc + wartosc;    // format: Tek:_tekstowy
        }
        if( dlTekstu <= this.dlugosc )
        {   // tekst krótszy od dostępnego miejsca
            ileSpc = this.dlugosc-dlTekstu; // ile znaków uzupełnić
            for(int i=0; i<ileSpc; i++)
                spcs+= spc;
            fTekst = tekst.toUpperCase() + colon + spcs + spc + wartosc;    // format: Tekst:___tekstowy
        }
        return fTekst;
    }
}
