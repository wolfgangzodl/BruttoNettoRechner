package com.example.wolfi.bruttonettorechner;

/**
 * Created by wolfi on 14.10.15.
 */
public class Ergebnis {
    public float betrag;
    public boolean isNetto;
    public int ustProzent;
    public float betragNetto;
    public float betragBrutto;
    public float betragUst;

    public void berechneErgebnis() {
        if (isNetto){
            betragNetto = betrag;
            betragUst= betrag * ustProzent / 100;
            betragBrutto = betrag + betragUst;
        }
        else {
            betragBrutto = betrag;
            betragUst = betrag * ustProzent / (100 + ustProzent);
            betragNetto = betrag - betragUst;
        }

    }

}
