package com.tacticalsandwitchstudios.ultimateslugfest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by user on 04/09/2016.
 */
public class GameActivity extends AppCompatActivity {

    Button mLightAttackButton;
    TextView mPlayerOutputText;
    TextView mEnemyOutPutText;
    TextView mPlayerHealth;
    TextView mEnemyHealth;
    Game mGame;
    int mWhosTurn;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        mGame = new Game();
        mWhosTurn = 0;

        mLightAttackButton = (Button)findViewById(R.id.light_attack);
        mPlayerOutputText = (TextView)findViewById(R.id.player_output);
        mEnemyOutPutText = (TextView)findViewById(R.id.enemy_output);


        playerAttack();
        }

    public void playerAttack() {
        mGame.setupFight(0);

                mLightAttackButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        String attack = "Light Attack";
                        String playerAttack = mGame.playerAttacksEnemy(attack);
                        mPlayerOutputText.setText(playerAttack);
                        String enemyAttack = mGame.enemyattacksPlayer();
                        mEnemyOutPutText.setText(enemyAttack);
                    }
                });
        }





}
