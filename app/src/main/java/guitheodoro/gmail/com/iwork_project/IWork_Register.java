package guitheodoro.gmail.com.iwork_project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class IWork_Register extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iwork__register);

        Register();
    }

    public void Register(){

        final EditText nome = findViewById(R.id.txtNome);
        final EditText usr = findViewById(R.id.txtUsr);
        final EditText senha = findViewById(R.id.txtSenha);
        final EditText csenha = findViewById(R.id.txtCSenha);
        final EditText Email = findViewById(R.id.txtEmail);
        final TextView Error = findViewById(R.id.lblError);

        Button register = findViewById(R.id.btnRegistrar);
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(senha.getText().toString().equals(csenha.getText().toString())) {
                    Error.setText("");
                }
                else {
                    Error.setText("As senhas não estão iguais!");
                    Error.setVisibility(View.VISIBLE);
                }
            }
        });
    }

    public void Click(View v) {
        Intent login = new Intent(this,IWork_Login.class);
        startActivity(login);
    }
}
