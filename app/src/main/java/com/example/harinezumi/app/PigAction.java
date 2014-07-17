package com.example.harinezumi.app;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class PigAction extends ActionBarActivity {//座標取得
    private TextView touchInfoText=null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pig);
        /*
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.container, new PlaceholderFragment())
                    .commit();
        }
        */
        ImageView iv=new ImageView(this);
        iv.setImageResource(R.drawable.pig1);
        setContentView(iv);

    }




    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id=item.getItemId();
        if(id==R.id.action_settings){
            moveTaskToBack(true);
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event){
        String action="";
        switch(event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                action = "ACTION_DOWN";
                ImageView iv=new ImageView(this);
                iv.setImageResource(R.drawable.pig4);
                setContentView(iv);

                break;
            case MotionEvent.ACTION_UP:
                action = "ACTION_UP";
                ImageView img=new ImageView(this);
                img.setImageResource(R.drawable.pig1);
                setContentView(img);

                break;
            case MotionEvent.ACTION_MOVE:
                action = "ACTION_MOVE";
                ImageView im=new ImageView(this);
                im.setImageResource(R.drawable.pig4);
                setContentView(im);

                break;
            case MotionEvent.ACTION_CANCEL:
                action = "ACTION_CANCEL";
                break;
        }
        Log.v("MotionEvent","action="+action+","+"x="+String.valueOf(event.getX())+","+"y="+String.valueOf(event.getY()));
        ImageView im=new ImageView(this);
        Random rand =new Random();
        int n=rand.nextInt();
        if(event.getY()>1000){
            if(n%2==0)im.setImageResource(R.drawable.pig2);
            else im.setImageResource(R.drawable.pig3);
        }
        else {
            if (n % 3 != 0) im.setImageResource(R.drawable.pig1);
            else im.setImageResource(R.drawable.pig4);
        }
        setContentView(im);
        return super.onTouchEvent(event);
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
            View rootView = inflater.inflate(R.layout.fragment_monkey, container, false);
            return rootView;
        }
    }
}
