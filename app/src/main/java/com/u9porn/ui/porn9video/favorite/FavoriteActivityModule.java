package com.u9porn.ui.porn9video.favorite;

import android.arch.lifecycle.Lifecycle;
import android.support.v7.app.AppCompatActivity;

import com.trello.lifecycle2.android.lifecycle.AndroidLifecycle;
import com.trello.rxlifecycle2.LifecycleProvider;
import com.u9porn.ui.about.AboutActivity;

import dagger.Module;
import dagger.Provides;

@Module
public class FavoriteActivityModule {
    @Provides
    AppCompatActivity provideAppCompatActivity(FavoriteActivity favoriteActivity){
        return favoriteActivity;
    }

    @Provides
    static LifecycleProvider<Lifecycle.Event> providerLifecycleProvider(AppCompatActivity mAppCompatActivity) {
        return AndroidLifecycle.createLifecycleProvider(mAppCompatActivity);
    }
}
