package com.tacticalsandwitchstudios.ultimateslugfest;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by user on 05/09/2016.
 */
public class CompletedActivity extends AppCompatActivity{

    Button mResartButton;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_completed);

        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_FULLSCREEN);

        mResartButton = (Button)findViewById(R.id.restart_game);

        restartGame();
    }

    public void restartGame(){
        mResartButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SavedTextPrefrences.removeStoredText(CompletedActivity.this, "roundNumber");
                SavedTextPrefrences.removeStoredText(CompletedActivity.this, "powerUpCount");
                Intent intent = new Intent(CompletedActivity.this, GameActivity.class);
                startActivity(intent);
            }
        });
    }

}
