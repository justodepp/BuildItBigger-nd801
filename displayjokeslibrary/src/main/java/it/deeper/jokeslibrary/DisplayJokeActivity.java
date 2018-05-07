package it.deeper.jokeslibrary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayJokeActivity extends AppCompatActivity {

    public static final String INTENT_EXTRAS_PARAM_JOKE = "JOKE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_joke);

        if (getIntent().hasExtra(INTENT_EXTRAS_PARAM_JOKE)) {
            String joke = getIntent().getStringExtra(INTENT_EXTRAS_PARAM_JOKE);

            ((TextView) findViewById(R.id.textView)).setText(joke);
        }
    }
}
