package de.j4velin.pedometer.Victor;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.widget.ImageView;

import de.j4velin.pedometer.R;
import de.j4velin.pedometer.ui.Fragment_Settings;

public class Activity_Settings extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.settings);
    }

    public void backToStart(View view) {

    }
}
