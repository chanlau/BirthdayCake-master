package cs301.birthdaycake;

import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        setContentView(R.layout.activity_main);

        CakeView newCake = findViewById(R.id.cakeview);
        CakeController Controller = new CakeController(newCake);

        Button blowOutButton = findViewById(R.id.button);
        blowOutButton.setOnClickListener(Controller);

        Switch candles = findViewById(R.id.Candles);
        candles.setOnCheckedChangeListener(Controller);

        SeekBar howManyCandles = findViewById(R.id.candleSeekBar) ;
        howManyCandles.setOnSeekBarChangeListener(Controller);
    }

    public void goodbye(View button) {

        Log.i("button","Goodbye");
    }


}
