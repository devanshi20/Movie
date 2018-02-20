package com.example.atul_.movie;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by atul_ on 20/02/2018.
 */

public class SQLiteDBHelper extends SQLiteOpenHelper {


    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "OrderDetails";

    public static final String TABLE_NAME = "movies";
    public static final String ProductID = "pro_id";
    public static final String ProductNAME = "name";
    public static final String Price = "price";
    public static final String Quantity = "quantity";
    public static final String Discount = "discount";
    //Create Table Query
    private static final String SQL_CREATE_ORDERS =
            "CREATE TABLE order (" + ProductID + "  INTEGER PRIMARY KEY, "
                    + ProductNAME + " TEXT, " + Price + "  INTEGER, "
                    + Quantity + "  INTEGER, " + Discount + "  INTEGER );";

    private static final String SQL_DELETE_ORDERS =
            "DROP TABLE IF EXISTS " + TABLE_NAME;


    public SQLiteDBHelper(Context context) {
        super(context, DATABASE_NAME,null, DATABASE_VERSION);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(SQL_CREATE_ORDERS);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        this.onUpgrade(db, oldVersion, newVersion);

    }
}
