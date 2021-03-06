package com.example.lc;

import android.Manifest;

public class Permissions {
    public static final String[] PERMISSIONS={
            Manifest.permission.WRITE_EXTERNAL_STORAGE,
            Manifest.permission.READ_EXTERNAL_STORAGE,
            Manifest.permission.CAMERA,
            Manifest.permission.CALL_PHONE,
            Manifest.permission.INTERNET
    };

    public static final String[] CAMERA_PERMISSION={
            Manifest.permission.CAMERA
    };
    public static final String[] INTERNET_PERMISSION={
               Manifest.permission.INTERNET
    };

    public static final String[] WRITE_STORAGE_PERMISSION={
            Manifest.permission.WRITE_EXTERNAL_STORAGE
    };

    public static final String[] READ_STORAGE_PERMISSION={
            Manifest.permission.READ_EXTERNAL_STORAGE
    };
    public static final String[] CALL_PHONE={
            Manifest.permission.CALL_PHONE
    };
}
