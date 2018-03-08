package guitheodoro.gmail.com.iwork_project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
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

    public boolean onOptionsItemSelected(MenuItem item) {
        Intent nav_set = null;
        switch (item.getItemId()) {
            case R.id.nav_settings:
                nav_set = new Intent(this, My_Work_Settings.class);
                break;
            case R.id.nav_autor:
                nav_set = new Intent(this, IWork_ESenha.class);
        }
        startActivity(nav_set);
        return super.onOptionsItemSelected(item);
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
        String sqlconn = "jdbc:sqlserver://localhost:1433;" +
                "databaseName=My-Work;";
        Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            // Establish the connection.
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            con = DriverManager.getConnection(sqlconn);
            String SQL = "select * from USUARIO";
            stmt = con.createStatement();
            rs = stmt.executeQuery(SQL);

            while (rs.next()) {
                System.out.println(rs.getString(4) + " " + rs.getString(6));
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            if (rs != null) try { rs.close(); } catch(Exception e) {}
            if (stmt != null) try { stmt.close(); } catch(Exception e) {}
            if (con != null) try { con.close(); } catch(Exception e) {}
        }
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
