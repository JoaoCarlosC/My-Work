package guitheodoro.gmail.com.iwork_project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import java.sql.*;

public class IWork_Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iwork__login);

        Loging();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.login_nav, menu);
        return true;
    }

    public void Loging(){
        Button login = findViewById(R.id.btnLogin);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent logged = new Intent(IWork_Login.this, My_Work_Main.class);
                startActivity(logged);
            }
        });
    }

    public void verif(){
        
    }

    public void Click(View v){
        Intent reg = null;
        switch(v.getId()) {
            case R.id.lblRegister:
                reg = new Intent(this, IWork_Register.class);
                break;
            case R.id.lblLogin:
                reg = new Intent(this, IWork_Login.class);
                break;
            case R.id.lblESenha:
                reg = new Intent(this, IWork_ESenha.class);
        }
        startActivity(reg);
    }
}
