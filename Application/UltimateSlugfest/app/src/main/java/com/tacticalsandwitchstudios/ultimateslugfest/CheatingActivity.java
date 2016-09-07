package com.tacticalsandwitchstudios.ultimateslugfest;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by user on 06/09/2016.
 */
public class CheatingActivity extends AppCompatActivity{

    Button mResartButton;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cheating);

        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_FULLSCREEN);

        mResartButton = (Button)findViewById(R.id.cheating_restart);

        restartGame();
    }

    public void restartGame(){
        mResartButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SavedTextPrefrences.removeStoredText(CheatingActivity.this, "roundNumber");
                Intent intent = new Intent(CheatingActivity.this, HomeActivity.class);
                startActivity(intent);
            }
        });
    }
}
