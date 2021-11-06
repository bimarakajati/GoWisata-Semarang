package udinus.ac.id.bimarakajati;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class ResetPassword_13088 extends AppCompatActivity {

    // Deklarasi EditText
    EditText editResetCode;
    EditText editNewPassword;
    EditText editConfirmPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reset_password_13088);

        // Binding EditText
        editResetCode = findViewById(R.id.edt_txt_code);
        editNewPassword = findViewById(R.id.edt_new_password);
        editConfirmPassword = findViewById(R.id.edt_confirm_password);
    }

    public void postChangePassword (View view) {
        // Validasi kosong
        if (TextUtils.isEmpty(editResetCode.getText().toString().trim())) {
            Toast.makeText(view.getContext(), "Reset Code tidak boleh kosong!", Toast.LENGTH_LONG).show();
        }
        else if (TextUtils.isEmpty(editNewPassword.getText().toString().trim())) {
            Toast.makeText(view.getContext(), "New password tidak boleh kosong!", Toast.LENGTH_LONG).show();
        }
        else if (TextUtils.isEmpty(editConfirmPassword.getText().toString().trim())) {
            Toast.makeText(view.getContext(), "Confirm password tidak boleh kosong!", Toast.LENGTH_LONG).show();
        }
        // Cek inputan new dan confirm
        else {
            if (!editNewPassword.getText().toString().equals(editConfirmPassword.getText().toString())) {
                Toast.makeText(view.getContext(), "Password tidak sama!", Toast.LENGTH_LONG).show();
            }
            else {
                Intent i = new Intent(ResetPassword_13088.this, SuccessActivity_13088.class);
                startActivity(i);
            }
        }
    }
}