package fr.ensisa.minimaths;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import fr.ensisa.minimaths.R;
import fr.ensisa.minimaths.lazerbattle.LazerBattle;
import fr.ensisa.minimaths.lazerbattle.LazerBattleMenu;

public class DefeatActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gameoverscreen);
    }

    public void RetryLazer(View v){
        Intent activityLazer = new Intent(this, LazerBattle.class);
        startActivity(activityLazer);
        this.finish();
    }
}
