/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.sunshine.data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.android.sunshine.data.WeatherContract.WeatherEntry;

/**
 * Manages a local database for weather data.
 */
public class WeatherDbHelper extends SQLiteOpenHelper {

    public static final String DATABASE_NAME = "weather.db";
    private static final int DATABASE_VERSION = 1;

    public WeatherDbHelper(Context context) {

        super(context, DATABASE_NAME, null, DATABASE_VERSION);

    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        final String CREATE_TABLE =
                "CREATE TABLE " + WeatherEntry.TABLE_NAME + " (" + WeatherEntry._ID +
                        " INTEGER PRIMARY KEY AUTOINCREMENT, " + WeatherEntry.COLUMN_DATE +
                        " INTEGER, " + WeatherEntry.COLUMN_WEATHER_ID + " INTEGER, " +
                        WeatherEntry.COLUMN_MIN_TEMP + " REAL, " + WeatherEntry.COLUMN_MAX_TEMP +
                        " REAL, " + WeatherEntry.COLUMN_HUMIDITY + " REAL, " +
                        WeatherEntry.COLUMN_PRESSURE + " REAL, " + WeatherEntry.COLUMN_WIND_SPEED +
                        " REAL, " + WeatherEntry.COLUMN_DEGREES + " REAL" + ");";
        db.execSQL(CREATE_TABLE);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

}