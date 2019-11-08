package com.cheise_proj.samplesqlitetestwork.ui.base;

import androidx.appcompat.app.AppCompatActivity;

import com.cheise_proj.presentation.factory.ViewModelFactory;

import javax.inject.Inject;

import dagger.android.support.DaggerAppCompatActivity;


public abstract  class BaseActivity extends DaggerAppCompatActivity {
    @Inject
    protected ViewModelFactory viewModelFactory;
}
