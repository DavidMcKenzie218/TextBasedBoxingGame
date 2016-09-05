package com.tacticalsandwitchstudios.ultimateslugfest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by user on 04/09/2016.
 */
public class IntermissionActivity extends AppCompatActivity{

    Button mPlayerHasPurchesedPowerUp;
    Button mPlayerHasRefusedPowerUp;

    TextView mPlayerOutput;
    TextView mSalesPitch;

    Player mPlayer;
    Intermission mIntermission;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.intermission_activity);

        mPlayerHasPurchesedPowerUp =
                (Button)findViewById(R.id.bought_power_up);
        mPlayerHasRefusedPowerUp =
                (Button)findViewById(R.id.refused_power_up);
        mSalesPitch = (TextView)findViewById(R.id.want_to_power_up);
        mPlayerOutput = (TextView)findViewById(R.id.player_choice_output);

        mIntermission = new Intermission();
        mPlayer = new Player("David");

        intermission();
    }

    public void intermission(){
        mSalesPitch.setText(mIntermission.salesOutput());

        mPlayerHasPurchesedPowerUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int powerUpValue = mIntermission.getPowerUpRoidsValue();
                mPlayer.playerHasPurchasedPowerUp(powerUpValue);
                String boughtOutput = mIntermission.boughtOutput();
                mPlayerOutput.setText(boughtOutput);
            }
        });

        mPlayerHasRefusedPowerUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String refusedOutput = mIntermission.refusedOutput();
                mPlayerOutput.setText(refusedOutput);
            }
        });
    }
}
