package id.ac.polinema.miniproject;

import androidx.appcompat.app.AppCompatActivity;

import id.ac.polinema.miniproject.model.AdminRequest;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class AdminActivity extends AppCompatActivity {
    TextView Admin;
    EditText User, Pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_admin);

        Admin = findViewById(R.id.tvAdmin);
        User = findViewById(R.id.txtUsername);
        Pass = findViewById(R.id.txtPassword);
    }
    public void SubmitAdmin(View view) {
        if(validateInput()){
            AdminRequest request = new AdminRequest(User.getText().toString(), Pass.getText().toString());
            Intent data = new Intent(this, DataActivity.class);
            startActivity(data);
        }
    }
    private boolean validateInput(){
        if (TextUtils.isEmpty(User.getText())){
            Toast.makeText(this, "Masukkan Username", Toast.LENGTH_SHORT).show();
            return false;
        } else if (TextUtils.isEmpty(Pass.getText())){
            Toast.makeText(this, "Masukkan password", Toast.LENGTH_SHORT).show();
            return false;
        } else {
            return true;
        }
    }
}
