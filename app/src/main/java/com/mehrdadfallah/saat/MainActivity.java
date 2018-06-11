package com.mehrdadfallah.saat;



        import android.content.Intent;
        import android.media.MediaPlayer;
        import android.os.Handler;
        import android.support.annotation.Nullable;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.util.Log;
        import android.view.View;
        import android.widget.Button;
        import android.widget.TextView;

        import java.util.Date;

public class MainActivity extends AppCompatActivity {


    TextView PMorAM;
    TextView hour;
    TextView min;
    TextView sec;
    Button call;


    int h ;
    int m ;
    int s ;
    Date date;

    Handler handler = new Handler();

    MediaPlayer mediaPlayer1 ;
    MediaPlayer mediaPlayer2 ;
    MediaPlayer mediaPlayer3 ;
    MediaPlayer mediaPlayer4 ;
    MediaPlayer mediaPlayer5 ;
    MediaPlayer mediaPlayer6 ;

    private Runnable updateTime = new Runnable(){
        @Override
        public void run() {
            date = new Date();
            h = date.getHours();
            m = date.getMinutes();
            s = date.getSeconds();
            hour.setText(h+"");
            min.setText(m+"");
            sec.setText(s+"");
            handler.postDelayed(this , 1000);
        }
    };

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        PMorAM = (TextView) findViewById(R.id.PMorAM);
        hour = (TextView) findViewById(R.id.hour);
        min = (TextView) findViewById(R.id.min);
        sec = (TextView) findViewById(R.id.sec);
        call = (Button) findViewById(R.id.call);

        handler.postDelayed(updateTime , 0);


        call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Log.d("TAG " , h+"");

                mediaPlayer1 = MediaPlayer.create(MainActivity.this, R.raw.saat);

                if (h <= 20) {
                    mediaPlayer1 = MediaPlayer.create(MainActivity.this, R.raw.saat);
                    switch (h) {

                        case 1:
                            mediaPlayer2 = MediaPlayer.create(MainActivity.this, R.raw.m1);
                            break;

                        case 2:
                            mediaPlayer2 = MediaPlayer.create(MainActivity.this, R.raw.m2);
                            break;

                        case 3:
                            mediaPlayer2 = MediaPlayer.create(MainActivity.this, R.raw.m3);
                            break;

                        case 4:
                            mediaPlayer2 = MediaPlayer.create(MainActivity.this, R.raw.m4);
                            break;

                        case 5:
                            mediaPlayer2 = MediaPlayer.create(MainActivity.this, R.raw.m5);
                            break;

                        case 6:
                            mediaPlayer2 = MediaPlayer.create(MainActivity.this, R.raw.m6);
                            break;

                        case 7:
                            mediaPlayer2 = MediaPlayer.create(MainActivity.this, R.raw.m7);
                            break;

                        case 8:
                            mediaPlayer2 = MediaPlayer.create(MainActivity.this, R.raw.m8);
                            break;

                        case 9:
                            mediaPlayer2 = MediaPlayer.create(MainActivity.this, R.raw.m9);
                            break;

                        case 10:
                            mediaPlayer2 = MediaPlayer.create(MainActivity.this, R.raw.m10);
                            break;

                        case 11:
                            mediaPlayer2 = MediaPlayer.create(MainActivity.this, R.raw.m11);
                            break;

                        case 12:
                            mediaPlayer2 = MediaPlayer.create(MainActivity.this, R.raw.m12);
                            break;

                        case 13:
                            mediaPlayer2 = MediaPlayer.create(MainActivity.this, R.raw.m13);
                            break;

                        case 14:
                            mediaPlayer2 = MediaPlayer.create(MainActivity.this, R.raw.m14);
                            break;

                        case 15:
                            mediaPlayer2 = MediaPlayer.create(MainActivity.this, R.raw.m15);
                            break;

                        case 16:
                            mediaPlayer2 = MediaPlayer.create(MainActivity.this, R.raw.m16);
                            break;

                        case 17:
                            mediaPlayer2 = MediaPlayer.create(MainActivity.this, R.raw.m17);
                            break;

                        case 18:
                            mediaPlayer2 = MediaPlayer.create(MainActivity.this, R.raw.m18);
                            break;

                        case 19:
                            mediaPlayer2 = MediaPlayer.create(MainActivity.this, R.raw.m19);
                            break;

                        case 20:
                            mediaPlayer2 = MediaPlayer.create(MainActivity.this, R.raw.m20);
                            break;

                    }
                }
                if (h > 20 && h < 24) {

                    mediaPlayer6 = MediaPlayer.create(MainActivity.this, R.raw.m20o);
                    switch (h) {

                        case 21:

                            mediaPlayer2 = MediaPlayer.create(MainActivity.this, R.raw.m1);
                            break;

                        case 22:

                            mediaPlayer2 = MediaPlayer.create(MainActivity.this, R.raw.m2);
                            break;

                        case 23:

                            mediaPlayer2 = MediaPlayer.create(MainActivity.this, R.raw.m3);
                            break;


                    }
                }
                if (m <= 20) {
                    switch (m) {

                        case 1:
                            mediaPlayer4 = MediaPlayer.create(MainActivity.this, R.raw.m1);
                            break;

                        case 2:
                            mediaPlayer4 = MediaPlayer.create(MainActivity.this, R.raw.m2);
                            break;

                        case 3:
                            mediaPlayer4 = MediaPlayer.create(MainActivity.this, R.raw.m3);
                            break;

                        case 4:
                            mediaPlayer4 = MediaPlayer.create(MainActivity.this, R.raw.m4);
                            break;

                        case 5:
                            mediaPlayer4 = MediaPlayer.create(MainActivity.this, R.raw.m5);
                            break;

                        case 6:
                            mediaPlayer4 = MediaPlayer.create(MainActivity.this, R.raw.m6);
                            break;

                        case 7:
                            mediaPlayer4 = MediaPlayer.create(MainActivity.this, R.raw.m7);
                            break;

                        case 8:
                            mediaPlayer4 = MediaPlayer.create(MainActivity.this, R.raw.m8);
                            break;

                        case 9:
                            mediaPlayer4 = MediaPlayer.create(MainActivity.this, R.raw.m9);
                            break;

                        case 10:
                            mediaPlayer4 = MediaPlayer.create(MainActivity.this, R.raw.m10);
                            break;

                        case 11:
                            mediaPlayer4 = MediaPlayer.create(MainActivity.this, R.raw.m11);
                            break;

                        case 12:
                            mediaPlayer4 = MediaPlayer.create(MainActivity.this, R.raw.m12);
                            break;

                        case 13:
                            mediaPlayer4 = MediaPlayer.create(MainActivity.this, R.raw.m13);
                            break;

                        case 14:
                            mediaPlayer4 = MediaPlayer.create(MainActivity.this, R.raw.m14);
                            break;

                        case 15:
                            mediaPlayer4 = MediaPlayer.create(MainActivity.this, R.raw.m15);
                            break;

                        case 16:
                            mediaPlayer4 = MediaPlayer.create(MainActivity.this, R.raw.m16);
                            break;

                        case 17:
                            mediaPlayer4 = MediaPlayer.create(MainActivity.this, R.raw.m17);
                            break;

                        case 18:
                            mediaPlayer4 = MediaPlayer.create(MainActivity.this, R.raw.m18);
                            break;

                        case 19:
                            mediaPlayer4 = MediaPlayer.create(MainActivity.this, R.raw.m19);
                            break;

                        case 20:
                            mediaPlayer4 = MediaPlayer.create(MainActivity.this, R.raw.m20);
                            break;

                    }
                }
                if (m > 20 && m < 30) {
                    mediaPlayer3 = MediaPlayer.create(MainActivity.this, R.raw.m20);
                    switch (m) {

                        case 21:

                            mediaPlayer4 = MediaPlayer.create(MainActivity.this, R.raw.m1);
                            break;

                        case 22:

                            mediaPlayer4 = MediaPlayer.create(MainActivity.this, R.raw.m2);
                            break;

                        case 23:

                            mediaPlayer4 = MediaPlayer.create(MainActivity.this, R.raw.m3);
                            break;

                        case 24:

                            mediaPlayer4 = MediaPlayer.create(MainActivity.this, R.raw.m4);
                            break;

                        case 25:

                            mediaPlayer4 = MediaPlayer.create(MainActivity.this, R.raw.m5);
                            break;

                        case 26:

                            mediaPlayer4 = MediaPlayer.create(MainActivity.this, R.raw.m6);
                            break;

                        case 27:

                            mediaPlayer4 = MediaPlayer.create(MainActivity.this, R.raw.m7);
                            break;

                        case 28:

                            mediaPlayer4 = MediaPlayer.create(MainActivity.this, R.raw.m8);
                            break;

                        case 29:

                            mediaPlayer4 = MediaPlayer.create(MainActivity.this, R.raw.m9);
                            break;

                    }

                }
                if (m > 30 && m < 40) {
                    mediaPlayer3 = MediaPlayer.create(MainActivity.this, R.raw.m30);
                    switch (m) {
                        case 31:

                            mediaPlayer4 = MediaPlayer.create(MainActivity.this, R.raw.m1);
                            break;

                        case 32:

                            mediaPlayer4 = MediaPlayer.create(MainActivity.this, R.raw.m2);
                            break;

                        case 33:

                            mediaPlayer4 = MediaPlayer.create(MainActivity.this, R.raw.m3);
                            break;

                        case 34:

                            mediaPlayer4 = MediaPlayer.create(MainActivity.this, R.raw.m4);
                            break;

                        case 35:

                            mediaPlayer4 = MediaPlayer.create(MainActivity.this, R.raw.m5);
                            break;

                        case 36:

                            mediaPlayer4 = MediaPlayer.create(MainActivity.this, R.raw.m6);
                            break;

                        case 37:

                            mediaPlayer4 = MediaPlayer.create(MainActivity.this, R.raw.m7);
                            break;

                        case 38:

                            mediaPlayer4 = MediaPlayer.create(MainActivity.this, R.raw.m8);
                            break;

                        case 39:

                            mediaPlayer4 = MediaPlayer.create(MainActivity.this, R.raw.m9);
                            break;

                    }

                }
                if (m > 40 && m < 50) {
                    mediaPlayer3 = MediaPlayer.create(MainActivity.this, R.raw.m40o);
                    switch (m) {
                        case 41:

                            mediaPlayer4 = MediaPlayer.create(MainActivity.this, R.raw.m1);
                            break;

                        case 42:

                            mediaPlayer4 = MediaPlayer.create(MainActivity.this, R.raw.m2);
                            break;

                        case 43:

                            mediaPlayer4 = MediaPlayer.create(MainActivity.this, R.raw.m3);
                            break;

                        case 44:

                            mediaPlayer4 = MediaPlayer.create(MainActivity.this, R.raw.m4);
                            break;

                        case 45:

                            mediaPlayer4 = MediaPlayer.create(MainActivity.this, R.raw.m5);
                            break;

                        case 46:

                            mediaPlayer4 = MediaPlayer.create(MainActivity.this, R.raw.m6);
                            break;

                        case 47:

                            mediaPlayer4 = MediaPlayer.create(MainActivity.this, R.raw.m7);
                            break;

                        case 48:

                            mediaPlayer4 = MediaPlayer.create(MainActivity.this, R.raw.m8);
                            break;

                        case 49:

                            mediaPlayer4 = MediaPlayer.create(MainActivity.this, R.raw.m9);
                            break;

                    }

                }
                if (m > 50 && m < 60) {
                    mediaPlayer3 = MediaPlayer.create(MainActivity.this, R.raw.m50);
                    switch (m) {
                        case 51:

                            mediaPlayer4 = MediaPlayer.create(MainActivity.this, R.raw.m1);
                            break;

                        case 52:

                            mediaPlayer4 = MediaPlayer.create(MainActivity.this, R.raw.m2);
                            break;

                        case 53:

                            mediaPlayer4 = MediaPlayer.create(MainActivity.this, R.raw.m3);
                            break;

                        case 54:

                            mediaPlayer4 = MediaPlayer.create(MainActivity.this, R.raw.m4);
                            break;

                        case 55:

                            mediaPlayer4 = MediaPlayer.create(MainActivity.this, R.raw.m5);
                            break;

                        case 56:

                            mediaPlayer4 = MediaPlayer.create(MainActivity.this, R.raw.m6);
                            break;

                        case 57:

                            mediaPlayer4 = MediaPlayer.create(MainActivity.this, R.raw.m7);
                            break;

                        case 58:

                            mediaPlayer4 = MediaPlayer.create(MainActivity.this, R.raw.m8);
                            break;

                        case 59:

                            mediaPlayer4 = MediaPlayer.create(MainActivity.this, R.raw.m9);
                            break;

                    }
                    mediaPlayer5 = MediaPlayer.create(MainActivity.this, R.raw.daghigheh);

                }
                mediaPlayer5 = MediaPlayer.create(MainActivity.this, R.raw.daghigheh);

                //*****************************************
                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        mediaPlayer1.start();
                    }
                } , 0);


                if(h>20) {
                    Handler handler3 = new Handler();
                    handler3.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            mediaPlayer6.start();
                        }
                    }, 1000);
                }

                Handler handler2 = new Handler();
                handler2.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        mediaPlayer2.start();
                    }
                }, 2000);

                if(m>20) {
                    Handler handler4 = new Handler();
                    handler4.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            mediaPlayer3.start();
                        }
                    }, 3000);
                }
                Handler handler5 = new Handler();
                handler5.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        mediaPlayer4.start();
                    }
                }, 4000);

                Handler handler6 = new Handler();
                handler5.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        mediaPlayer5.start();
                    }
                }, 5000);

                //**********************************************

            }
        });


    }


}
