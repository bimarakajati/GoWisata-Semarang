package udinus.ac.id.bimarakajati;

import android.content.Intent;
import android.os.Handler;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new Handler().postDelayed(() -> {
            Intent i = new Intent(MainActivity.this, GoWisata_13088.class);
            startActivity(i);
            finish();
        }, 5000);
    }
}
