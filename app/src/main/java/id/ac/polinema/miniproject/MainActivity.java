package id.ac.polinema.miniproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import id.ac.polinema.miniproject.model.LoginRequest;

public class MainActivity extends AppCompatActivity {
    TextView Login;
    ImageView Logo;
    EditText Username;
    EditText Password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Logo = findViewById(R.id.imageView);
        Login = findViewById(R.id.tvLogin);
        Username = findViewById(R.id.text_user);
        Password = findViewById(R.id.text_pass);

    }

    public void login(View view) {
        if(validasiInput()) {
            LoginRequest request = new LoginRequest(Username.getText().toString(), Password.getText().toString());
            Intent guru = new Intent(this, GuruActivity.class);
            startActivity(guru);
        }
    }

    private boolean validasiInput() {
        if (TextUtils.isEmpty(Username.getText())){
            Toast.makeText(this, "Masukkan Username", Toast.LENGTH_SHORT).show();
            return false;
        } else if (TextUtils.isEmpty(Password.getText())) {
            Toast.makeText(this, "Masukkan password", Toast.LENGTH_SHORT).show();
            return false;
        }else {
            return true;
        }
    }
    public void admin(View view) {
        Intent admin = new Intent(this, AdminActivity.class);
        startActivity(admin);
    }
}
