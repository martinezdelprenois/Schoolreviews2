package com.example.marto.schoolreviews2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * Created by marto on 31-Jan-17.
 */

public class Signup extends Activity {

    @Override
    protected void onCreate(Bundle state){
        super.onCreate(state);
        setContentView(R.layout.choice);
    }

    public void clicker(View v){
        if(v.getId()== R.id.institute){
            Intent i = new Intent(Signup.this,Sign_up_institute.class);
            startActivity(i);
        }

        else if(v.getId()==R.id.viewer){
            Intent i = new Intent(Signup.this,Sign_up_viewer.class);
            startActivity(i);
        }
    }
}
