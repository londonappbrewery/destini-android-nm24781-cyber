package com.londonappbrewery.destini;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    TextView mStoryText;
    Button moptionFirst;
    Button moptionSecond;


    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        //Linking of views to java variables
        mStoryText = findViewById(R.id.storyTextView);
        moptionFirst =findViewById(R.id.buttonTop);
        moptionSecond =findViewById(R.id.buttonBottom);
        //Views linking done

        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        //Giving life to buttons by onclick listener

        moptionFirst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                storyThird();
                Toast.makeText(getApplicationContext(),"Third story",Toast.LENGTH_SHORT).show();

                moptionFirst.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(getApplicationContext(),"top button pressed",Toast.LENGTH_SHORT).show();
                        mStoryText.setText(R.string.T6_End);
                        makeButtonInvisible();
                        Toast.makeText(getApplicationContext(),"T6 End",Toast.LENGTH_SHORT).show();
                    }
                });
                //if second button is clicked
                moptionSecond.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(getApplicationContext(),"Bottom Button pressed",Toast.LENGTH_SHORT).show();
                        mStoryText.setText(R.string.T5_End);
                        makeButtonInvisible();
                        Toast.makeText(getApplicationContext(),"T5 end",Toast.LENGTH_SHORT).show();
                    }
                });

            }
        });

        moptionSecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mStoryText.setText(R.string.T2_Story);
                moptionFirst.setText(R.string.T2_Ans1);
                moptionSecond.setText(R.string.T2_Ans2);
                Toast.makeText(getApplicationContext(),"Bottom Button pressed",Toast.LENGTH_SHORT).show();

                moptionFirst.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        storyThird();
                        Toast.makeText(getApplicationContext(),"T3 showing",Toast.LENGTH_SHORT).show();
                        moptionFirst.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Toast.makeText(getApplicationContext(),"Top Button pressed",Toast.LENGTH_SHORT).show();
                                mStoryText.setText(R.string.T6_End);
                                makeButtonInvisible();
                                Toast.makeText(getApplicationContext(),"T6 end",Toast.LENGTH_SHORT).show();
                            }
                        });
                        moptionSecond.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Toast.makeText(getApplicationContext(),"Bottom Button pressed",Toast.LENGTH_SHORT).show();
                                mStoryText.setText(R.string.T5_End);
                                makeButtonInvisible();
                                Toast.makeText(getApplicationContext(),"T5 End",Toast.LENGTH_SHORT).show();
                            }
                        });
                    }
                });

                moptionSecond.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(getApplicationContext(),"Bottom Button Pressed",Toast.LENGTH_SHORT).show();
                        mStoryText.setText(R.string.T4_End);
                        makeButtonInvisible();
                        Toast.makeText(getApplicationContext(),"T4 end",Toast.LENGTH_SHORT).show();
                    }
                });
            }
        });


        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:

    }

    public void storyThird() {
        mStoryText.setText(R.string.T3_Story);
        moptionFirst.setText(R.string.T3_Ans1);
        moptionSecond.setText(R.string.T3_Ans2);
    }

    public void makeButtonInvisible() {
        moptionFirst.setVisibility(View.INVISIBLE);
        moptionSecond.setVisibility(View.INVISIBLE);
    }
}
