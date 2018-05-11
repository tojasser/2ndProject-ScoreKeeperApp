package a2ndproject.example.talal.a2ndproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ac_one);
        Fragment fragment= new Fragment();
        getSupportFragmentManager().beginTransaction().add(R.id.fram_container,fragment).commit();

    }
}
