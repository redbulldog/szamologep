package com.example.zoli.szamologep;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private Button egy, ketto, osszead, egyenlo, harom, negy, ot, hat, het, nyolc, kilenc, kivonas, osztas, szorzas;
    private int elso = 0, masodik,vegeredmeny;
    private int muvelet;
    private EditText kiiratas;
    private String szam ="";
    private Button c;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        egy = (Button) findViewById(R.id.button_egy);
        ketto = (Button) findViewById(R.id.button_ketto);
        osszead = (Button) findViewById(R.id.button_osszeadas);
        egyenlo = (Button) findViewById(R.id.button_egyenlo);
        kivonas = (Button) findViewById(R.id.button_kivonas);
        kiiratas = (EditText) findViewById(R.id.editText);
        c = (Button) findViewById(R.id.buttonC);
        harom = (Button) findViewById(R.id.button_harom);
        negy = (Button) findViewById(R.id.button_negy);
        ot = (Button) findViewById(R.id.button_ot);
        hat = (Button) findViewById(R.id.button_hat);
        het = (Button) findViewById(R.id.button_het);
        nyolc = (Button) findViewById(R.id.button_nyolc);
        kilenc = (Button) findViewById(R.id.button_kilenc);
        osztas = (Button) findViewById(R.id.button_osztas);
        szorzas = (Button) findViewById(R.id.button_szorzas);

        egy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                szam +="1";
                kiiratas.setText(szam);
            }
        });
        ketto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                szam +="2";
                kiiratas.setText(szam);
            }
        });
        harom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                szam +="3";
                kiiratas.setText(szam);
            }
        });
        negy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                szam += "4";
                kiiratas.setText(szam);
            }
        });
        ot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                szam += "5";
                kiiratas.setText(szam);
            }
        });
        hat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                szam +="6";
                kiiratas.setText(szam);
            }
        });
        het.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                szam += "7";
                kiiratas.setText(szam);
            }
        });
        nyolc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                szam +="8";
                kiiratas.setText(szam);
            }
        });
        kilenc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                szam += "9";
                kiiratas.setText(szam);
            }
        });
        osztas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (muvelet == 3)
                {kiiratas.setText("Egyszer már megnyomtad!");
                }
                else if (szam == "")
                {
                    kiiratas.setText("Adj hozzá számot!");
                }
                else if (!szam.equals(3)) {
                    elso = Integer.parseInt(szam);
                    muvelet = 3;
                    szam = "";
                    kiiratas.setText(szam);
                }
            }
        });
        osszead.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (muvelet == 1)
                {kiiratas.setText("Egyszer már megnyomtad!");
                }
                else if (szam == "")
                {
                    kiiratas.setText("Adj hozzá számot!");
                }
                else if (!szam.equals(1)) {
                    elso = Integer.parseInt(szam);
                    muvelet = 1;
                    szam = "";
                    kiiratas.setText(szam);
                }

            }
        });
        kivonas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (muvelet == 2)
                {kiiratas.setText("Egyszer már megnyomtad!");
                }
                else if (szam == "")
                {
                    kiiratas.setText("Adj hozzá számot!");
                }
                else if (!szam.equals(2)){
                    elso = Integer.parseInt(szam);
                    muvelet = 2;
                    szam = "";
                    kiiratas.setText(szam);
                }
            }
        });
        szorzas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (muvelet == 4)
                {kiiratas.setText("Egyszer már megnyomtad!");
                }
                else if (szam == "")
                {
                    kiiratas.setText("Adj hozzá számot!");
                }
                else if (!szam.equals(4) ){
                    elso = Integer.parseInt(szam);
                    muvelet = 4;
                    szam = "";
                    kiiratas.setText(szam);
                }
            }
        });
        egyenlo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (szam == "")
                {kiiratas.setText("Adj hozzá számot!");
                } else {
                    masodik = Integer.parseInt(szam);
                    switch (muvelet) {
                        case 1:
                            vegeredmeny = elso + masodik;
                            kiiratas.setText(elso + "+" + masodik + "=" + vegeredmeny);
                            break;
                        case 2:
                            vegeredmeny = elso - masodik;
                            kiiratas.setText(elso + "-" + masodik + "=" + vegeredmeny);
                            break;
                        case 3:
                            vegeredmeny = elso / masodik;
                            kiiratas.setText(elso + "/" + masodik + "=" + vegeredmeny);
                            break;
                        case 4:
                            vegeredmeny = elso * masodik;
                            kiiratas.setText(elso + "*" + masodik + "=" + vegeredmeny);
                    }
                }
            }
        });
        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                kiiratas.setText("");
                vegeredmeny = 0;
                elso = 0;
                masodik = 0;
                muvelet = 0;
                szam="";
            }
        });

    }
}
