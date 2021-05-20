package org.moe.benchmark;

import android.os.AsyncTask;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

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
            System.out.println("Starting");
            double[] res = commandline.createRes();
            commandline.printValues("Primitives", res);
            //String l = myActivity.getFilesDir().getPath();
            commandline.writeCSV(res, param[0], getFilesDir().getPath());

            res = commandline.createObjRes();
            commandline.printValues("Objects", res);

            return null;
        }

        @Override
        protected void onPostExecute(Void aVoid) {
            super.onPostExecute(aVoid);
            myActivity.finish();
        }
    }
}
