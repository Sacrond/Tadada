package com.example.sacrond.fragmentmainactivitytest;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button showBtn = (Button) findViewById(R.id.show_button);
        Button hideBtn = (Button) findViewById(R.id.hide_button);

        final RelativeLayout mainFragmentLayout = (RelativeLayout) findViewById(R.id.main_fragment_relative_layout);
        final RelativeLayout anotherFragmentLayout = (RelativeLayout) findViewById(R.id.another_fragment_relative_layout);

        showBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LinearLayout.LayoutParams mainParams = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT);
                LinearLayout.LayoutParams anotherParams = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT);

                mainParams.weight = 2;
                anotherParams.weight = 1;

                mainFragmentLayout.setLayoutParams(mainParams);
                anotherFragmentLayout.setLayoutParams(anotherParams);
            }
        });

        hideBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                LinearLayout.LayoutParams mainParams = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT);

                mainParams.weight = 0;

                LinearLayout.LayoutParams anotherParams = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT);

                mainFragmentLayout.setLayoutParams(mainParams);
                anotherFragmentLayout.setLayoutParams(anotherParams);
            }
        });

    }
}
