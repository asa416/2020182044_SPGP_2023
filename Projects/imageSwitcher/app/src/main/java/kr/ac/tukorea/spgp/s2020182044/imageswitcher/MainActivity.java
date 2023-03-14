package kr.ac.tukorea.spgp.s2020182044.imageswitcher;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    public static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onBtnPrev(View view) {
        Log.d(TAG, "Prev pressed");
    }
    public void onBtnNext(View view) {
        Log.d(TAG, "Next pressed");
    }
}