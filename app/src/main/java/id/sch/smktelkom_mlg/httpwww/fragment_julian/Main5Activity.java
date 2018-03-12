package id.sch.smktelkom_mlg.httpwww.fragment_julian;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Main5Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
    }

    public void alarm(View view) {
        Intent intent = new Intent(Main5Activity.this, Main3Activity.class);
        startActivity(intent);
    }

    public void toast(View view) {
        Intent intent = new Intent(Main5Activity.this, MainActivity.class);
        startActivity(intent);
    }

    public void maps(View view) {
        Intent intent = new Intent(Main5Activity.this, Main4Activity.class);
        startActivity(intent);
    }

    public void picture(View view) {
        Intent intent = new Intent(Main5Activity.this, Main2Activity.class);
        startActivity(intent);
    }
}
