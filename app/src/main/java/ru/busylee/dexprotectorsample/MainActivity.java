package ru.busylee.dexprotectorsample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import ru.busylee.submodule.ClassIWantHide;

public class MainActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    new ClassIWantHide().doBlaBla();
  }
}
