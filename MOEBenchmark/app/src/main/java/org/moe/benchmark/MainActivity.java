package org.moe.benchmark;

import android.content.Context;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @Override
    protected void onResume() {
        super.onResume();
        new MyAsyncTask(this).execute("csvfile");

    }


    class MyAsyncTask extends AsyncTask<String, Void, Void> {
       MainActivity myActivity;

        MyAsyncTask(MainActivity activity) {
            myActivity=activity;
        }

        @Override
        protected Void doInBackground(String... param) {
            double[] res = commandline.createRes();
            //String l = myActivity.getFilesDir().getPath();
            commandline.writeCSV(res, param[0], "/data/data/org.moe.benchmark");
            return null;
        }

        @Override
        protected void onPostExecute(Void aVoid) {
            super.onPostExecute(aVoid);
            myActivity.finish();
        }
    }
}
