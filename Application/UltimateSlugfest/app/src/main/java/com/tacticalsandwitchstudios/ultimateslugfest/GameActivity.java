package com.tacticalsandwitchstudios.ultimateslugfest;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

/**
 * Created by user on 04/09/2016.
 */
public class GameActivity extends AppCompatActivity {

    Button mLightAttackButton;
    Button mHeavyAttackButton;
    Button mSpecialAttackButton;
    Button mPowerUpButton;

    TextView mPlayerOutputText;
    TextView mEnemyOutPutText;
    TextView mPlayerHealth;
    TextView mEnemyHealth;
    TextView mPlayerName;
    TextView mEnemyname;
    TextView mRoundNumber;

    ImageView mPlayerSprite;
    ImageView mEnemySprite;

    Game mGame;
    int mRound;
    int mBalancingCounter;
    boolean mSpecialAttackUsed;
    boolean mHeavyAttackUsed;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_FULLSCREEN);


        mGame = new Game();

        whatRound();

        mLightAttackButton = (Button)findViewById(R.id.light_attack);
        mHeavyAttackButton = (Button)findViewById(R.id.heavy_attack);
        mSpecialAttackButton = (Button)findViewById(R.id.special_attack);
        mPowerUpButton = (Button)findViewById(R.id.powerUp);

        mPlayerOutputText = (TextView)findViewById(R.id.player_output);
        mEnemyOutPutText = (TextView)findViewById(R.id.enemy_output);
        mPlayerHealth = (TextView)findViewById(R.id.player_health);
        mEnemyHealth = (TextView)findViewById(R.id.enemy_health);
        mPlayerName = (TextView)findViewById(R.id.player_name);
        mEnemyname = (TextView)findViewById(R.id.enemy_name);
        mRoundNumber = (TextView)findViewById(R.id.round_number);
        mPlayerSprite = (ImageView)findViewById(R.id.player_sprite);
        mEnemySprite = (ImageView)findViewById(R.id.enemy_sprite);

        String round = Integer.toString(mRound+1);
        mRoundNumber.setText(round);

        mGame.setupFight(mRound);
        mBalancingCounter = 0;
        mSpecialAttackUsed = false;
        mHeavyAttackUsed = false;


        mPlayerHealth.setText(mGame.getPlayerHealth());
        mEnemyHealth.setText(mGame.getEnemyHealth());
        mPlayerName.setText(mGame.getPlayerName());
        mEnemyname.setText(mGame.getEnemyName());
        mPlayerSprite.setImageResource(R.drawable.boxer_player);
        if (mRound == 0) {
            mEnemySprite.setImageResource(R.drawable.boxer_bone_crusher);
        }else{
            mEnemySprite.setImageResource(R.drawable.it);
        }



        playerAttack();
        }

    public void playerAttack() {

        mLightAttackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String attack = "Light Attack";
                String playerAttack = mGame.playerAttacksEnemy(attack);
                mPlayerOutputText.setText(playerAttack);
                enemyAttack();
                endGame();
                mBalancingCounter++;
                mHeavyAttackUsed =false;
            }
        });

        mHeavyAttackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mBalancingCounter > 4 && mHeavyAttackUsed == false){
                    playerHeavyAttack();
                    mBalancingCounter++;
                    mHeavyAttackUsed = true;
                }else{
                    Toast.makeText(GameActivity.this, R.string.unavalible, Toast.LENGTH_SHORT).show();
                }
            }
        });

        mSpecialAttackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mBalancingCounter > 4 && mSpecialAttackUsed == false){
                    playerSpecialAttack();
                    mBalancingCounter++;
                    mSpecialAttackUsed = true;
                }else{
                    Toast.makeText(GameActivity.this, R.string.unavalible, Toast.LENGTH_SHORT).show();
                }
            }
        });

        mPowerUpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            caughtCheating();
            }
        });

    }

    public void enemyAttack(){
        int enemyAttackRate = mGame.getEnemyAttackRate();
        int enemyMissRate = mGame.getEnemyMissRate();
        String enemyAttack = mGame.enemyattacksPlayer(enemyAttackRate, enemyMissRate);
        mEnemyOutPutText.setText(enemyAttack);
        mPlayerHealth.setText(mGame.getPlayerHealth());
        mEnemyHealth.setText(mGame.getEnemyHealth());
    }

    public void endGame(){
        if (mGame.endGame()){
            if(mGame.getPlayerHealth() == "0") {
                Intent intent = new Intent(GameActivity.this, GameActivity.class);
                startActivity(intent);
            }else {
                mRound++;
                nextRound();
            }
        }
    }

    public void whatRound(){
        if (SavedTextPrefrences.getStoredText(this, "roundNumber") == null){
            mRound = 0;
        }else {
            mRound = Integer.parseInt(SavedTextPrefrences.getStoredText(this, "roundNumber"));
        }
    }

    public void nextRound(){
        if (mRound == 2){       //HardCoded for the amount of enemies
            Intent intent = new Intent(GameActivity.this, CompletedActivity.class);
            startActivity(intent);
        }else{
            String roundToSave = Integer.toString(mRound);
            SavedTextPrefrences.setStoredText(GameActivity.this, "roundNumber", roundToSave);
            Intent intent = new Intent(GameActivity.this, IntermissionActivity.class);
            startActivity(intent);
        }
    }

    public void caughtCheating(){
        if(mRound > 0) {
            Intent intent = new Intent(GameActivity.this, CheatingActivity.class);
            startActivity(intent);
        }
    }

    public void playerHeavyAttack(){
        String attack = "Heavy Attack";
        String playerAttack = mGame.playerAttacksEnemy(attack);
        mPlayerOutputText.setText(playerAttack);
        enemyAttack();
        endGame();
    }

    public void playerSpecialAttack(){
        String attack = "Special Attack";
        String playerAttack = mGame.playerAttacksEnemy(attack);
        mPlayerOutputText.setText(playerAttack);
        enemyAttack();
        endGame();
    }


}
