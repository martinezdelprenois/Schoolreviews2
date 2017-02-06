package com.example.marto.schoolreviews2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * Created by marto on 31-Jan-17.
 */

public class Home_one extends Activity {

    @Override
    protected void onCreate(Bundle state){
        super.onCreate(state);
        setContentView(R.layout.home_one);
    }

    public void click(View v){
        if(v.getId() == R.id.signing_up){

            Intent i = new Intent(Home_one.this, Signup.class );
            startActivity(i);
        }

        else if (v.getId() == R.id.signing_in){
        Intent i = new Intent(Home_one.this,Home_two.class );
            startActivity(i);
        }

    }

}
