package com.example.marto.schoolreviews2;


import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.ArrayAdapter;
import android.widget.Spinner;


/**
 * Created by marto on 31-Jan-17.
 */

public class Home_two extends Activity {

    Spinner category_spin, education_level_spin;
    ArrayAdapter<CharSequence> categories_list, education_level_list;
    Toolbar bar;


    @Override
    public void onCreate(Bundle state){
        super.onCreate(state);
        setContentView(R.layout.home_two);
categories();
        educations();

        bar = (Toolbar)findViewById(R.id.toolbar3);
        bar.inflateMenu(R.menu.menu_home_two);

    }

    public void categories(){
        // this method creates the drop down list for categories spinner
        category_spin = (Spinner)findViewById(R.id.spinner_categories);
        categories_list = ArrayAdapter.createFromResource(this,R.array.category,android.R.layout.simple_spinner_item);
        categories_list.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        category_spin.setAdapter(categories_list);

    }

    public void educations(){
        // this method manages the spinner drop down list for the education spinner
        education_level_spin = (Spinner)findViewById(R.id.spinner_education_level);
        education_level_list = ArrayAdapter.createFromResource(this,R.array.education,android.R.layout.simple_spinner_dropdown_item);
        education_level_list.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        education_level_spin.setAdapter(education_level_list);

    }

    //code below is one meant for creating and inflating the the menu



}
