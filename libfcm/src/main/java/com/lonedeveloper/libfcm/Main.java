package com.lonedeveloper.libfcm;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

/**
 * Created by m.golfam on 5/11/2017.
 */
public class Main extends Activity {

      private final String _FCM = "_FCM";

      @Override
      protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
      }

      public void logError(String text){
            Log.e(_FCM, text);
      }

      public void log(String text){
            Log.d(_FCM, text);
      }
}
