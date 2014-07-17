package com.example.harinezumi.app;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;


public class MainActivity extends ActionBarActivity {//動物選ぶの

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_amimal);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.container, new PlaceholderFragment())
                    .commit();
        }


    }

    public void Animal1(View v){
        Intent intent = new Intent(MainActivity.this,BearAction.class);
        startActivity(intent);
    }

    public void Animal2(View v){
        Intent intent = new Intent(MainActivity.this,MonkeyAction.class);
        startActivity(intent);
    }

    public void Animal3(View v){
        Intent intent = new Intent(MainActivity.this,MouseAction.class);
        startActivity(intent);
    }

    public void Animal4(View v){
        Intent intent = new Intent(MainActivity.this,PigAction.class);
        startActivity(intent);
    }

    public void Animal5(View v){
        Intent intent = new Intent(MainActivity.this,TigerAction.class);
        startActivity(intent);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.select_amimal, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            moveTaskToBack(true);
        }
        return super.onOptionsItemSelected(item);
    }

    /**
     * A placeholder fragment containing a simple view.
     */
    public static class PlaceholderFragment extends Fragment {

        public PlaceholderFragment() {
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_select_amimal, container, false);
            return rootView;
        }
    }
}

