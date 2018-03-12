package id.sch.smktelkom_mlg.httpwww.fragment_julian;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import id.sch.smktelkom_mlg.httpwww.fragment_julian.Fragment.MultipleFragment;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void multiple(View view) {
        Intent intent = new Intent(getApplicationContext(), MultipleFragment.class);
        startActivity(intent);
    }
}
