package cs301.birthdaycake;

import android.util.Log;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.SeekBar;

public class CakeController implements View.OnClickListener, CompoundButton.OnCheckedChangeListener, SeekBar.OnSeekBarChangeListener {
    private CakeView cakeView;
    CakeModel newCakeModel;

    public CakeController(CakeView Cake){
        this.cakeView = Cake;
        this.newCakeModel = cakeView.getCake();
    }

    @Override
    public void onClick(View view){
        Log.d("click", "Blow Out Button clicked");
        cakeView.getCake().candlesLit = false;
        cakeView.invalidate();
    }

    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        cakeView.getCake().hasCandles = !(cakeView.getCake().hasCandles);
        cakeView.invalidate();
    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
        cakeView.getCake().candleCount = seekBar.getProgress();
        cakeView.invalidate();
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }
}
