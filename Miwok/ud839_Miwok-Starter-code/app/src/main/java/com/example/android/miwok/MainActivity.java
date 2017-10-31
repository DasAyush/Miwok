/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.miwok;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //TextView num,ph,fm,cs;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        // Find the view pager that will allow the user to swipe between fragments
        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);

        // Create an adapter that knows which fragment should be shown on each page
        CategoryAdapter adapter = new CategoryAdapter(getSupportFragmentManager(),this);

        // Set the adapter onto the view pager
        viewPager.setAdapter(adapter);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);

        /*
        num = (TextView) findViewById(R.id.numbers);
        ph = (TextView) findViewById(R.id.phrases);
        cs = (TextView) findViewById(R.id.colors);
        fm = (TextView) findViewById(R.id.family);

        num.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nintent = new Intent(MainActivity.this,NumbersActivity.class);
                startActivity(nintent);
                Toast.makeText(v.getContext(),"Open the numbers list",Toast.LENGTH_SHORT);
            }
        });

        ph.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pintent = new Intent(MainActivity.this,PhrasesActivity.class);
                startActivity(pintent);
                Toast.makeText(v.getContext(),"Open the phrases list",Toast.LENGTH_SHORT);
            }
        });
        cs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cintent = new Intent(MainActivity.this,ColorsActivity.class);
                startActivity(cintent);
                Toast.makeText(v.getContext(),"Open the colors list",Toast.LENGTH_SHORT);
            }
        });
        fm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent fintent = new Intent(MainActivity.this,FamilyActivity.class);
                startActivity(fintent);
                Toast.makeText(v.getContext(),"Open the family list",Toast.LENGTH_SHORT);
            }
        });
      */

    }

    //public void openNumbersList(View view){
      //  Intent intent = new Intent(MainActivity.this,NumbersActivity.class);
       //startActivity(intent);

    //}
}
