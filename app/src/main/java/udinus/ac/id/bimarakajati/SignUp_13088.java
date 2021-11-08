package udinus.ac.id.bimarakajati;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Patterns;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class SignUp_13088 extends AppCompatActivity {

    // Deklarasi EditText
    EditText signUpEmail;
    EditText signUpPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up_13088);

        // Binding EditText
        signUpEmail = findViewById(R.id.edt_txt_email);
        signUpPassword = findViewById(R.id.edt_txt_password);
    }

    public void daftar(View view) {
        // Validasi input email dan password kosong
        if (TextUtils.isEmpty(signUpEmail.getText().toString().trim()) && TextUtils.isEmpty(signUpPassword.getText().toString().trim())) {
            Toast.makeText(view.getContext(), "Email dan password tidak boleh kosong!", Toast.LENGTH_LONG).show();
        }
        // Validasi input email kosong
        if (TextUtils.isEmpty(signUpEmail.getText().toString().trim())) {
            Toast.makeText(view.getContext(), "Email tidak boleh kosong!", Toast.LENGTH_LONG).show();
        }
        // Validasi inputan tipe email
        else {
            if (!isValidEmail(signUpEmail.getText().toString().trim())) {
                Toast.makeText(view.getContext(), "Email tidak valid!", Toast.LENGTH_LONG).show();
            }
            // Validasi password kosong
            else if (TextUtils.isEmpty(signUpPassword.getText().toString().trim())) {
                Toast.makeText(view.getContext(), "Password tidak boleh kosong!", Toast.LENGTH_LONG).show();
            } else {
                if (signUpPassword.getText().length() < 6) {
                    Toast.makeText(view.getContext(), "Password minimal 6!", Toast.LENGTH_LONG).show();
                } else {
                    Intent i = new Intent(SignUp_13088.this, SignUpSuccess_13088.class);
                    startActivity(i);
                }
            }
        }
    }

    public static boolean isValidEmail(CharSequence email) {
        return (Patterns.EMAIL_ADDRESS.matcher(email).matches());
    }
}