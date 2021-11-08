package udinus.ac.id.bimarakajati;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SignUpSuccess_13088 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up_success_13088);
    }

    public void postLogin(View view) {
        Intent i = new Intent(SignUpSuccess_13088.this, WelcomeBack_13088.class);
        startActivity(i);
    }
}