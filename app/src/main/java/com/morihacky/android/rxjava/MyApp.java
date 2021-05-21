package com.morihacky.android.rxjava;

import androidx.multidex.MultiDexApplication;

import com.morihacky.android.rxjava.volley.MyVolley;

import timber.log.Timber;

public class MyApp extends MultiDexApplication {

  private static MyApp _instance;

  public static MyApp get() {
    return _instance;
  }

  @Override
  public void onCreate() {
    super.onCreate();

    _instance = (MyApp) getApplicationContext();

    // for better RxJava debugging
    //RxJavaHooks.enableAssemblyTracking();

    // Initialize Volley
    MyVolley.init(this);

    Timber.plant(new Timber.DebugTree());
  }
}
