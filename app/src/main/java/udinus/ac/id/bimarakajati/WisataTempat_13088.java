package udinus.ac.id.bimarakajati;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class WisataTempat_13088 extends AppCompatActivity {

    RecyclerView recyclerView;

    String[] s1, s2, s3;
    int[] images = {
            R.drawable.wisata_kotalama,
            R.drawable.wisata_bentengpendem,
            R.drawable.wisata_klentengsampookong,
            R.drawable.wisata_browncanyon,
            R.drawable.wisata_tamanbungacelosia,
            R.drawable.wisata_dusunsemilir,
            R.drawable.wisata_museumkeretaapi,
            R.drawable.wisata_lawangsewu,
            R.drawable.wisata_umbulsidomukti,
            R.drawable.wisata_kampungpelangi,
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wisata_tempat_13088);

        recyclerView = findViewById(R.id.recyclerView);

        s1 = getResources().getStringArray(R.array.tempat_wisata);
        s2 = getResources().getStringArray(R.array.alamat);
        s3 = getResources().getStringArray(R.array.deskripsi);

        MyAdapter myAdapter = new MyAdapter(this, s1, s2, s3, images);
        recyclerView.setAdapter(myAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}