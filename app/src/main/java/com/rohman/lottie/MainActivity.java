package com.rohman.lottie;

import android.os.Bundle;
import android.view.animation.Animation;

import androidx.appcompat.app.AppCompatActivity;

import com.airbnb.lottie.LottieAnimationView;

public class MainActivity extends AppCompatActivity {

    LottieAnimationView coffe;
    LottieAnimationView loading;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        coffe = findViewById(R.id.coffe);
        loading = findViewById(R.id.loading);

        coffe.setRepeatCount(Animation.INFINITE);
        coffe.playAnimation();

        loading.setRepeatCount(Animation.INFINITE);
        loading.playAnimation();


    }
}
