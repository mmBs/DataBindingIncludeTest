package io.github.mmbs.databindingincludetest;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import io.github.mmbs.databindingincludetest.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);

    ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

    setSupportActionBar(binding.toolbar);

    binding.contentMain.documentId.setText("Check this out"); //FIXME ( ͡° ͜ʖ ͡°)
  }

}
