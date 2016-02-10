package kru.poompunk.wannachat.weightcheck;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by icakeeeeeee on 3/2/2559.
 */
public class MyManage {

    //ex
    private MyOpenHelper myOpenHelper;
    private SQLiteDatabase writeSqLiteDatabase, readSqLiteDatabase;

    public static final String table_customer = "customerTABLE";
    public static final String table_weight = "weightTABLE";
    public static final String column_id = "_id";
    public static final String column_user = "User";
    public static final String column_pass = "Pass";
    public static final String column_Name = "Name";
    public static final String column_tel = "Tel";
    public static final String column_date = "Date";
    public static final String column_weight = "Weight";


    public MyManage(Context context) {

        //cre and con
        myOpenHelper = new MyOpenHelper(context);
        writeSqLiteDatabase = myOpenHelper.getWritableDatabase();
        readSqLiteDatabase = myOpenHelper.getReadableDatabase();

    }//con

    //Add new value to user table
    public long addUserTable(String strUser, String strPass, String strName, String strTel) {
        ContentValues objContentValues = new ContentValues();
        objContentValues.put(column_user,strUser);
        objContentValues.put(column_pass,strPass);
        objContentValues.put(column_Name,strName);
        objContentValues.put(column_tel,strTel);
        return writeSqLiteDatabase.insert(table_customer,null,objContentValues);
    }

}//main
