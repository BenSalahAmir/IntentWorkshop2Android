package com.example.formulairesae;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {
Button valider;
EditText nom , prenom ;

CheckBox foot , musique , cinema ;

RadioButton Femme , Homme ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nom = findViewById(R.id.nom);
        prenom = findViewById(R.id.prenom);
        foot = findViewById(R.id.foot);
        musique = findViewById(R.id.musique);
        cinema = findViewById(R.id.cinema);
        Femme = findViewById(R.id.Femme);

        Homme = findViewById(R.id.Homme);

        valider = findViewById(R.id.Valider);






        valider.setOnClickListener(view -> {
            Intent intent = new Intent(this, MainActivity2.class);
            String Hobbies ="";
            String Genre ="";
            if(Homme.isChecked()){
                Genre+="Homme";
            }else {
                Genre+="Femme";

            }


            if (foot.isChecked()){
                Hobbies += "foot";
            }
            if (musique.isChecked()){
                Hobbies += "musique";
            }
            if (cinema.isChecked()){
                Hobbies += "cinema";
            }


            intent.putExtra("nom",nom.getText().toString());
            intent.putExtra("prenom",prenom.getText().toString());
            intent.putExtra("Hobbies",Hobbies);
            intent.putExtra("Genre",Genre);


            startActivity(intent);

        });


    }
}