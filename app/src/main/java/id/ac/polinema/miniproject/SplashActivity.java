package id.ac.polinema.miniproject;

import android.content.Intent;
import android.os.Handler;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {
    TextView Adven;
    ImageView viewLogo;

    private int loading=4000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Adven = findViewById(R.id.tvAdven);
        viewLogo = findViewById(R.id.viewLes);

        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {

                //setelah loading maka akan langsung berpindah ke home activity
                Intent MainActivity=new Intent(SplashActivity.this, MainActivity.class);
                startActivity(MainActivity);
                finish();

            }
        },loading);
    }

}
