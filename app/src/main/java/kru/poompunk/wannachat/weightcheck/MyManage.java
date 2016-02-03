package kru.poompunk.wannachat.weightcheck;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by icakeeeeeee on 3/2/2559.
 */
public class MyManage {
    //ex
    private MyOpenHelper myOpenHelper;
    private SQLiteDatabase writeSqLiteDatabase, readSqLiteDatabase;


    public MyManage(Context context) {

        //cre and con
        myOpenHelper = new MyOpenHelper(context);
        writeSqLiteDatabase = myOpenHelper.getWritableDatabase();
        readSqLiteDatabase = myOpenHelper.getReadableDatabase();

    }//con

}//main
