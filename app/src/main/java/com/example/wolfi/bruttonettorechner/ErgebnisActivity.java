package com.example.wolfi.bruttonettorechner;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by wolfi on 14.10.15.
 */
public class ErgebnisActivity extends Activity {

    @Override
    public void onCreate(Bundle icicle){
        super.onCreate(icicle);
        setContentView(R.layout.ergebnis);
        final Bundle extras = getIntent().getExtras();

        if (extras != null){
            final Ergebnis ergebnis = new Ergebnis();
            ergebnis.betrag = extras.getFloat(FormularActivity.BETRAG_KEY);
            ergebnis.isNetto = extras.getBoolean(FormularActivity.BETRAG_ART, true);
            ergebnis.ustProzent = extras.getInt(FormularActivity.UST_PROZENT);

            zeigeErgebnis(ergebnis);
        }
    }

    private void zeigeErgebnis(Ergebnis ergebnis) {
        setTitle("Ergebnis");
        ergebnis.berechneErgebnis();
        final TextView txtNettobetrag = (TextView) findViewById(R.id.txt_nettobetrag);
        txtNettobetrag.setText(String.valueOf(ergebnis.betragNetto));
        final TextView txtBruttobetrag = (TextView) findViewById(R.id.txt_bruttobetrag);
        txtBruttobetrag.setText(String.valueOf(ergebnis.betragBrutto));

    }
}
