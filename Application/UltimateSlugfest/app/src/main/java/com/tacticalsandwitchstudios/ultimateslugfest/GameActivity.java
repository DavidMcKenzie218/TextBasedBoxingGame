package com.tacticalsandwitchstudios.ultimateslugfest;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by user on 04/09/2016.
 */
public class GameActivity extends AppCompatActivity {

    Button mLightAttackButton;
    Button mHeavyAttackButton;
    Button mSpecialAttackButton;

    TextView mPlayerOutputText;
    TextView mEnemyOutPutText;
    TextView mPlayerHealth;
    TextView mEnemyHealth;
    TextView mPlayerName;
    TextView mEnemyname;

    Game mGame;
    int mWhosTurn;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        mGame = new Game();
        mWhosTurn = 0;

        mLightAttackButton = (Button)findViewById(R.id.light_attack);
        mHeavyAttackButton = (Button)findViewById(R.id.heavy_attack);
        mSpecialAttackButton = (Button)findViewById(R.id.special_attack);

        mPlayerOutputText = (TextView)findViewById(R.id.player_output);
        mEnemyOutPutText = (TextView)findViewById(R.id.enemy_output);
        mPlayerHealth = (TextView)findViewById(R.id.player_health);
        mEnemyHealth = (TextView)findViewById(R.id.enemy_health);
        mPlayerName = (TextView)findViewById(R.id.player_name);
        mEnemyname = (TextView)findViewById(R.id.enemy_name);

        mGame.setupFight(0);

        mPlayerHealth.setText(mGame.getPlayerHealth());
        mEnemyHealth.setText(mGame.getEnemyHealth());
        mPlayerName.setText(mGame.getPlayerName());
        mEnemyname.setText(mGame.getEnemyName());


        playerAttack();
        }

    public void playerAttack() {



        mLightAttackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String attack = "Light Attack";
                String playerAttack = mGame.playerAttacksEnemy(attack);
                mPlayerOutputText.setText(playerAttack);
                String enemyAttack = mGame.enemyattacksPlayer();
                mEnemyOutPutText.setText(enemyAttack);
                mPlayerHealth.setText(mGame.getPlayerHealth());
                mEnemyHealth.setText(mGame.getEnemyHealth());
                endGame();
            }
        });

        mHeavyAttackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String attack = "Heavy Attack";
                String playerAttack = mGame.playerAttacksEnemy(attack);
                mPlayerOutputText.setText(playerAttack);
                String enemyAttack = mGame.enemyattacksPlayer();
                mEnemyOutPutText.setText(enemyAttack);
                mPlayerHealth.setText(mGame.getPlayerHealth());
                mEnemyHealth.setText(mGame.getEnemyHealth());
                endGame();
            }
        });

        mSpecialAttackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String attack = "Special Attack";
                String playerAttack = mGame.playerAttacksEnemy(attack);
                mPlayerOutputText.setText(playerAttack);
                String enemyAttack = mGame.enemyattacksPlayer();
                mEnemyOutPutText.setText(enemyAttack);
                mPlayerHealth.setText(mGame.getPlayerHealth());
                mEnemyHealth.setText(mGame.getEnemyHealth());
                endGame();
            }
        });


    }

    public void endGame(){
        if (mGame.endGame()){
            Intent intent = new Intent(GameActivity.this, IntermissionActivity.class);
            startActivity(intent);
        }
    }





}
