package guitheodoro.gmail.com.iwork_project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.view.MenuItem;
import android.widget.TextView;

public class My_Work_Main extends AppCompatActivity {

    private TextView lblTextPrin;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.nav_main:
                    lblTextPrin.setText("Main");
                    return true;
                case R.id.nav_chat:
                    lblTextPrin.setText("Chat");
                    return true;
                case R.id.nav_notf:
                    lblTextPrin.setText("Notifications");
                    return true;
                case R.id.nav_perf:
                    lblTextPrin.setText("Perfil");
                    return true;
            }
            return false;

        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my__work__main);

        lblTextPrin = findViewById(R.id.lblMenu);
        BottomNavigationView navigation = findViewById(R.id.nav_menu);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }
}
