package ru.busylee.dexsubmodule;

/**
 * Created by busylee on 08.12.16.
 */

public class ClassVisibleToClient {
  public void doJob() {
    new ClassIWantToHide().doJob();
  }
}
