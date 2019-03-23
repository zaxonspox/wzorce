package Wzorce;

import java.util.Random;

import static java.lang.Integer.parseInt;

public class Account implements iAccountAdapter {
    String name;
    String lastName;
    Integer pin;
    String phoneNo;
    boolean active;

    /* KONSTRUKTOR przed dodaniem adaptera
    public Account(String name, String lastName, Integer pin, String phoneNo, boolean active)
    {
        this.name = name;
        this.lastName = lastName;
        this.pin = pin;
        this.phoneNo = phoneNo;
        this.active = active;
    }*/

    // KONSTRUKTOR po dodaniu adaptera          // te 3 zmienne pozostawione, bo nie chciało mi się wszystkiego przerabiać
    public Account(String name, String lastName, Integer pin, String phoneNo, boolean active)
    {
        this.name = name;
        this.lastName = lastName;
        saveUser(); // stąd zapisuję PIN, NUMER i AKTYWNY
    }

    public void saveUser()
    {
        this.pin = parseInt(getRandomDigits(4));
        this.phoneNo = getRandomDigits(9);
        this.active = true;
    }

    private String getRandomDigits(int size){
        Random random = new Random();

        String value = "";
        for(int i =0; i<size; i++){
            int randomValue = random.nextInt(10);
            value += randomValue;
        }
        return  value;
    }

    @Override
    public String toString() {
        String str = "Imie: "+this.name;
            str+= " Nazwisko: "+this.name;
            str+= " PIN: "+this.pin;
            str+= " Numer tel.: "+this.phoneNo;
            str+= " Aktywny: "+this.active;
        return str;
    }
}
