package kru.poompunk.wannachat.weightcheck;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by icakeeeeeee on 3/2/2559.
 */
public class MyOpenHelper extends SQLiteOpenHelper{

    // Explicit
    public static final String database_name = "Weight.db";//ประกาศค่าคงที่
    private static final int database_version = 1;
    private static final String create_table_weight = "create table weightTABLE (" +
            "_id integer primary key," +
            "Date text, " +
            "Weight text);";
    private static final String create_table_customer = "create table customerTABLE (" +
            "_id integer primary key," +
            "Name text, " +
            "LastName text," +
            "Email text," +
            "Tel text);";


    public MyOpenHelper(Context context) {
        super(context,database_name,null,database_version);
    } //constructor


    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(create_table_weight);
        sqLiteDatabase.execSQL(create_table_customer);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}// main class
