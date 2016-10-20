package com.suhaas.myportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.toolbar)
    Toolbar toolbar;
    @BindView(R.id.app_names)
    TextView appNames;
    @BindView(R.id.popularMovies)
    Button popularMovies;
    @BindView(R.id.stockHawk)
    Button stockHawk;
    @BindView(R.id.builditBigger)
    Button builditBigger;
    @BindView(R.id.appMaterial)
    Button appMaterial;
    @BindView(R.id.goUbiquitous)
    Button goUbiquitous;
    @BindView(R.id.capStone)
    Button capStone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @OnClick({R.id.popularMovies, R.id.stockHawk, R.id.builditBigger, R.id.appMaterial, R.id.goUbiquitous, R.id.capStone})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.popularMovies:
                showToast("popular movies");
                break;
            case R.id.stockHawk:
                showToast("stock hawk");
                break;
            case R.id.builditBigger:
                showToast("build it bigger");
                break;
            case R.id.appMaterial:
                showToast("make your app material");
                break;
            case R.id.goUbiquitous:
                showToast("go ubiquitous");
                break;
            case R.id.capStone:
                showToast("capstone");
                break;
        }
    }

    private void showToast(String projectName) {
        Toast.makeText(getApplicationContext(), "This button will launch my" + projectName + "app!", Toast.LENGTH_SHORT).show();
    }
}
