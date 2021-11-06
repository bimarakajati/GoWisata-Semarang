package udinus.ac.id.bimarakajati;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Patterns;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class ForgotPassword_13088 extends AppCompatActivity {

    // Deklarasi EditText
    EditText editTextEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password_13088);

        // Binding EditText
        editTextEmail = findViewById(R.id.edt_txt_email);
    }

    public void postSendRequest (View view) {
        // Validasi email kosong
        if (TextUtils.isEmpty(editTextEmail.getText().toString().trim())) {
            Toast.makeText(view.getContext(), "Email tidak boleh kosong!", Toast.LENGTH_LONG).show();
        }
        // Validasi format email
        else {
            if (!isValidEmail(editTextEmail.getText().toString().trim())) {
                Toast.makeText(view.getContext(), "Email tidak valid!", Toast.LENGTH_LONG).show();
            } else {
                Intent i = new Intent(ForgotPassword_13088.this, ResetPassword_13088.class);
                startActivity(i);
            }
        }
    }

    // Email validation
    public static boolean isValidEmail (CharSequence email) {
        return (Patterns.EMAIL_ADDRESS.matcher(email).matches());
    }
}