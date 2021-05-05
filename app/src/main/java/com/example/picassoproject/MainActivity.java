package com.example.picassoproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imageView = findViewById(R.id.iv_main);
        Picasso.get().load("https://www.google.com/search?q=wallpaper&sxsrf=ALeKk02Le5O_mHbOrGLZW0uMWWXqk8Ib5Q:1620214775762&tbm=isch&source=iu&ictx=1&fir=OHJowjYb9muRwM%252Cz_-Bdpg4srRlBM%252C_&vet=1&usg=AI4_-kQHt4ArweTiNiikHtX7hC4nMS19wQ&sa=X&ved=2ahUKEwjV1ayxurLwAhVSJBoKHWplAugQ9QF6BAgGEAE#imgrc=OHJowjYb9muRwM")
                .into(imageView);
    }
}