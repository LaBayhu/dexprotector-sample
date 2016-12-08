package ru.busylee.dexprotectorsample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import ru.busylee.dexsubmodule.ClassVisibleToClient;
import ru.busylee.dexsubmodule.Init;

public class MainActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    new Init().init(this);
    new ClassVisibleToClient().doJob();
  }
}
