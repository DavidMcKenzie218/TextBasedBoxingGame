package com.tacticalsandwitchstudios.ultimateslugfest;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by user on 05/09/2016.
 */
public class HomeActivity extends AppCompatActivity{

    Button mStartGame;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_FULLSCREEN);

        mStartGame = (Button)findViewById(R.id.start_game);

        options();
    }

    public void options(){
        mStartGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SavedTextPrefrences.removeStoredText(HomeActivity.this, "roundNumber");
                SavedTextPrefrences.removeStoredText(HomeActivity.this, "powerUpCount");
                Intent intent = new Intent(HomeActivity.this, GameActivity.class);
                startActivity(intent);
            }
        });
    }



}
