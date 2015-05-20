package com.example.jack.myapplication12fragmentlayouts;

import android.app.Activity;
import android.content.res.Configuration;
import android.os.Bundle;

/**
 * Created by jack on 5/20/15.
 */
public class DetailsActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (getResources().getConfiguration().orientation ==
                Configuration.ORIENTATION_LANDSCAPE){

            finish();// kill the activity
            return;
        }

        if (savedInstanceState == null){
            DetailsFragment details = new DetailsFragment();

            details.setArguments(getIntent().getExtras());

            getFragmentManager().beginTransaction().add(android.R.id.content,details).commit();

        }
    }
}
