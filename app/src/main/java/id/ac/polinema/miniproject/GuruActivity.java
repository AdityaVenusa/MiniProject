package id.ac.polinema.miniproject;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class GuruActivity extends AppCompatActivity {
    private TextView Guru, Klik;
    private Button Absen;
    private ImageView View;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guru);

        Guru = findViewById(R.id.tvGuru);
        Klik = findViewById(R.id.tvKlik);
        Absen = findViewById(R.id.btnAbsen);
        View = findViewById(R.id.imageView);
    }
}
