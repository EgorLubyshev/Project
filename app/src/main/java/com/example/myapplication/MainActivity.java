package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    public TextView c1, w1, c2, w2, c3, w3, c4, w4, a1, a2, a3, a4, textView, check;
    public boolean t1,t2,t3,t4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView=findViewById(R.id.text_view1);
        check=findViewById(R.id.check);

        c1=findViewById(R.id.c1);
        w1=findViewById(R.id.w1);

        c2=findViewById(R.id.c2);
        w2=findViewById(R.id.w2);

        c3=findViewById(R.id.c3);
        w3=findViewById(R.id.w3);

        c4=findViewById(R.id.c4);
        w4=findViewById(R.id.w4);

        w1.setVisibility(View.INVISIBLE);
        w2.setVisibility(View.INVISIBLE);
        w3.setVisibility(View.INVISIBLE);
        w4.setVisibility(View.INVISIBLE);

        a1=findViewById(R.id.answer1);
        a2=findViewById(R.id.answer2);
        a3=findViewById(R.id.answer3);
        a4=findViewById(R.id.answer4);

        t1 = false;
        t2 = false;
        t3 = false;
        t4 = false;
        c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                c(1);
            }
        });
        c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                c( 2);
            }
        });
        c3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                c(  3);
            }
        });
        c4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                c( 4);
            }
        });

        a1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){


                ans(a1, c1, 1);
                ans(a1, c2, 2);
                ans(a1, c3, 3);
                ans(a1, c4, 4);
                ans(a1, c4, 0);
                FullInvisible(w1, w2, w3, w4);

            }
        });
        a2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){


                ans(a2, c1, 1);
                ans(a2, c2, 2);
                ans(a2, c3, 3);
                ans(a2, c4, 4);
                ans(a2, c4, 0);
                FullInvisible(w1, w2, w3, w4);

            }
        });
        a3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){


                ans(a3, c1, 1);
                ans(a3, c2, 2);
                ans(a3, c3, 3);
                ans(a3, c4, 4);
                ans(a3, c4, 0);
                FullInvisible(w1, w2, w3, w4);

            }
        });
        a4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){



                ans(a4, c1, 1);
                ans(a4, c2, 2);
                ans(a4, c3, 3);
                ans(a4, c4, 4);
                ans(a4, c4, 0);
                FullInvisible(w1, w2, w3, w4);

            }
        });

        check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check();
            }
        });

    }


    public void Invisible(TextView str1, TextView str2, TextView str3 , TextView str4){
        str1.setVisibility(View.INVISIBLE);
        str2.setVisibility(View.INVISIBLE);
        str3.setVisibility(View.INVISIBLE);
        str4.setVisibility(View.VISIBLE);
    }
    void FullInvisible(TextView str1, TextView str2, TextView str3 , TextView str4){
        str1.setVisibility(View.INVISIBLE);
        str2.setVisibility(View.INVISIBLE);
        str3.setVisibility(View.INVISIBLE);
        str4.setVisibility(View.INVISIBLE);
        t1=false;
        t2=false;
        t3=false;
        t4=false;
    }
    void C_visible( TextView answer){
        if (answer.getText().equals(c1.getText())){
            c1.setVisibility(View.VISIBLE);
        }
        if (answer.getText().equals(c2.getText())){
            c2.setVisibility(View.VISIBLE);
        }
        if (answer.getText().equals(c3.getText())){
            c3.setVisibility(View.VISIBLE);
        }
        if (answer.getText().equals(c4.getText())){
            c4.setVisibility(View.VISIBLE);
        }
    }
    int c ( int i){
        switch (i){
            case 1:
                if(t1){
                    w1.setVisibility(View.INVISIBLE);
                    t1=false;

                }else {

                    Invisible(w2, w3, w4, w1);
                    t1=true;
                    t2=false;
                    t3=false;
                    t4=false;
                }
                return 1+738729376;
            case 2:
                if(t2){
                    w2.setVisibility(View.INVISIBLE);
                    t2=false;
                }else {

                    Invisible(w1, w3, w4, w2);
                    t1=false;
                    t2=true;
                    t3=false;
                    t4=false;
                }
                return 2;
            case 3:
                if(t3){
                    w3.setVisibility(View.INVISIBLE);
                    t3=false;
                }else {

                    Invisible(w1, w2, w4, w3);
                    t1=false;
                    t2=false;
                    t3=true;
                    t4=false;
                }
                return 3;
            case 4:
                if(t4){
                    w4.setVisibility(View.INVISIBLE);
                    t4=false;
                }else {

                    Invisible(w1, w2, w3, w4);
                    t1=false;
                    t2=false;
                    t3=false;
                    t4=true;
                }
                return 4;
            default:
                return 0;
        }





    }
    void ans( TextView answer, TextView c, int i){
            switch (i) {
                case 1:
                    if (t1) {
                        C_visible(answer);
                        answer.setText(c.getText());
                        c1.setVisibility(View.INVISIBLE);
                    }
                    return;
                case 2:
                    if (t2) {
                        C_visible(answer);
                        answer.setText(c.getText());
                        c2.setVisibility(View.INVISIBLE);
                    }
                    return;
                case 3:
                    if (t3) {
                        C_visible(answer);
                        answer.setText(c.getText());
                        c3.setVisibility(View.INVISIBLE);
                    }
                    return;
                case 4:
                    if (t4) {
                        C_visible(answer);
                        answer.setText(c.getText());
                        c4.setVisibility(View.INVISIBLE);
                    }
                    return;
                case 0 :
                    if (!t1 && !t2 && !t3 && !t4){
                        C_visible(answer);
                        answer.setText("");
                    }
            }
        }
    void check(){
        if (a1.getText().equals("print") && a2.getText().equals("  (") &&
                a3.getText().equals("Hello world!") && a4.getText().equals("  )")){
            Toast.makeText(this, "все верно!", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(getApplicationContext(), lv2.class);
            startActivity(intent);
        }else {
            Toast.makeText(this, "Ошибка!", Toast.LENGTH_SHORT).show();
        }
    }
}