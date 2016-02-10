package kru.poompunk.wannachat.weightcheck;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    //ex
    private MyManage objMyManage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //request data
        objMyManage = new MyManage(this);

        //check regis
        checkRegister();

    }//main method
    private  void checkRegister(){
        SQLiteDatabase objSqLiteDatabase = openOrCreateDatabase(MyOpenHelper.database_name,
                MODE_PRIVATE, null);

        Cursor objCursor = objSqLiteDatabase.rawQuery("SELECT * FROM customerTABLE", null);

        if (objCursor.getCount() == 0) {
            Intent objIntent = new Intent(MainActivity.this, RegiActivity.class);
            startActivity(objIntent);

        }//if
        objCursor.close();
    }//chcekRegis

}//main
