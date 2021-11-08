package udinus.ac.id.bimarakajati;

import android.content.Intent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class GoWisata_13088 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gowisata_13088);
    }

    public void clickLogin(View view) {
        Intent i = new Intent(GoWisata_13088.this, WelcomeBack_13088.class);
        startActivity(i);
    }

    public void clickGetStarted(View view) {
        Intent i = new Intent(GoWisata_13088.this, SignUp_13088.class);
        startActivity(i);
    }
}