package udinus.ac.id.bimarakajati;

import android.content.Intent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Patterns;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class WelcomeBack_13088 extends AppCompatActivity {

    // Deklarasi variabel editTextEmail dengan tipe EditText
    EditText editTextEmail;

    // Deklarasi variabel editTextPassword dengan tipe EditText
    EditText editTextPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_back_13088);

        // Binding edt_txt_email ke variabel editTextEmail
        editTextEmail = findViewById(R.id.edt_txt_email);

        // Binding edt_txt_password ke variabel editTextPassword
        editTextPassword = findViewById(R.id.edt_txt_password);
    }

    public void clickForgot(View view) {
        Intent i = new Intent(WelcomeBack_13088.this, ForgotPassword_13088.class);
        startActivity(i);
    }

    public void postLogin(View view) {
        // Validasi input email dan password kosong
        if (TextUtils.isEmpty(editTextEmail.getText().toString().trim()) && TextUtils.isEmpty(editTextPassword.getText().toString().trim())) {
            Toast.makeText(view.getContext(), "Email dan password tidak boleh kosong!", Toast.LENGTH_LONG).show();
        }
        // Validasi input email kosong
        if (TextUtils.isEmpty(editTextEmail.getText().toString().trim())) {
            Toast.makeText(view.getContext(), "Email tidak boleh kosong!", Toast.LENGTH_LONG).show();
        }
        // Validasi inputan tipe email
        else {
            if (!isValidEmail(editTextEmail.getText().toString().trim())) {
                Toast.makeText(view.getContext(), "Email tidak valid!", Toast.LENGTH_LONG).show();
            }
            // Validasi password kosong
            else if (TextUtils.isEmpty(editTextPassword.getText().toString().trim())) {
                Toast.makeText(view.getContext(), "Password tidak boleh kosong!", Toast.LENGTH_LONG).show();
            } else {
                if (editTextPassword.getText().length() < 6) {
                    Toast.makeText(view.getContext(), "Password minimal 6!", Toast.LENGTH_LONG).show();
                } else {
                    Intent i = new Intent(WelcomeBack_13088.this, WisataTempat_13088.class);
                    startActivity(i);
                }
            }
        }
    }

    public static boolean isValidEmail(CharSequence email) {
        return (Patterns.EMAIL_ADDRESS.matcher(email).matches());
    }
}