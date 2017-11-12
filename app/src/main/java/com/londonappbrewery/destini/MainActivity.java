package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    Button btnTop;
    Button btnBottom;
    TextView storyTextView;
    int mStoryIndex = 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        btnTop = (Button) findViewById(R.id.buttonTop);
        btnBottom = (Button) findViewById(R.id.buttonBottom);
        storyTextView = (TextView) findViewById(R.id.storyTextView);



        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:

        btnTop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mStoryIndex==1) {
                    storyTextView.setText(R.string.T3_Story);
                    btnTop.setText(R.string.T3_Ans1);
                    btnBottom.setText(R.string.T3_Ans2);
                    mStoryIndex = 3;
                }
                else if (mStoryIndex==3){
                    btnBottom.setVisibility(View.GONE);
                    btnTop.setVisibility(View.GONE);
                    storyTextView.setText(R.string.T6_End);
                }else if(mStoryIndex==2){
                    storyTextView.setText(R.string.T3_Story);
                    btnTop.setText(R.string.T3_Ans1);
                    btnBottom.setText(R.string.T3_Ans2);
                    mStoryIndex=3;
                }
            }
        });


        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        btnBottom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mStoryIndex==1) {
                    storyTextView.setText(R.string.T2_Story);
                    btnTop.setText(R.string.T2_Ans1);
                    btnBottom.setText(R.string.T2_Ans2);
                    mStoryIndex = 2;
                }else if (mStoryIndex==2){
                    btnBottom.setVisibility(View.GONE);
                    btnTop.setVisibility(View.GONE);
                    storyTextView.setText(R.string.T4_End);
                }else if(mStoryIndex==3){
                    btnBottom.setVisibility(View.GONE);
                    btnTop.setVisibility(View.GONE);
                    storyTextView.setText(R.string.T5_End);
                    mStoryIndex=3;
                }
            }
        });


    }
}
