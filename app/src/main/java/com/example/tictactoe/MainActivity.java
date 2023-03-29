package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button clear,esc;
    Button btn1x,btn2x,btn3x,btn4x,btn5x,btn6x,btn7x,btn8x,btn9x;
    Button btn1y,btn2y,btn3y,btn4y,btn5y,btn6y,btn7y,btn8y,btn9y;
    TextView txt1,txt2,txt3,txt4,txt5,txt6,txt7,txt8,txt9,txt_turn;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        clear = findViewById(R.id.clear);
        //esc = findViewById(R.id.esc);

        btn1x = findViewById(R.id.btn1x);
        btn2x = findViewById(R.id.btn2x);
        btn3x = findViewById(R.id.btn3x);
        btn4x = findViewById(R.id.btn4x);
        btn5x = findViewById(R.id.btn5x);
        btn6x = findViewById(R.id.btn6x);
        btn7x = findViewById(R.id.btn7x);
        btn8x = findViewById(R.id.btn8x);
        btn9x = findViewById(R.id.btn9x);

        btn1y = findViewById(R.id.btn1y);
        btn2y = findViewById(R.id.btn2y);
        btn3y = findViewById(R.id.btn3y);
        btn4y = findViewById(R.id.btn4y);
        btn5y = findViewById(R.id.btn5y);
        btn6y = findViewById(R.id.btn6y);
        btn7y = findViewById(R.id.btn7y);
        btn8y = findViewById(R.id.btn8y);
        btn9y = findViewById(R.id.btn9y);

        txt1 = findViewById(R.id.txt1);
        txt2 = findViewById(R.id.txt2);
        txt3 = findViewById(R.id.txt3);
        txt4 = findViewById(R.id.txt4);
        txt5 = findViewById(R.id.txt5);
        txt6 = findViewById(R.id.txt6);
        txt7 = findViewById(R.id.txt7);
        txt8 = findViewById(R.id.txt8);
        txt9 = findViewById(R.id.txt9);
        txt_turn = findViewById(R.id.txt_turn);

        int count = 0;
        //final int[] game = {1};
        //final int[] end = {0};

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt1.setText("1");
                txt2.setText("2");
                txt3.setText("3");
                txt4.setText("4");
                txt5.setText("5");
                txt6.setText("6");
                txt7.setText("7");
                txt8.setText("8");
                txt9.setText("9");
            }
        });

        btn1x.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt1.setText("X");
                txt_turn.setText("Y");
            }
        });
        btn2x.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt2.setText("X");
                txt_turn.setText("Y");
            }
        });
        btn3x.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt3.setText("X");
                txt_turn.setText("Y");
            }
        });
        btn4x.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt4.setText("X");
                txt_turn.setText("Y");
            }
        });
        btn5x.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt5.setText("X");
                txt_turn.setText("Y");
            }
        });
        btn6x.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt6.setText("X");
                txt_turn.setText("Y");
            }
        });
        btn7x.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt7.setText("X");
                txt_turn.setText("Y");
            }
        });
        btn8x.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt8.setText("X");
                txt_turn.setText("Y");
            }
        });
        btn9x.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt9.setText("X");
                txt_turn.setText("Y");
            }
        });



        btn1y.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt1.setText("Y");
                txt_turn.setText("X");
            }
        });
        btn2y.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt2.setText("Y");
                txt_turn.setText("X");
            }
        });
        btn3y.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt3.setText("Y");
                txt_turn.setText("X");
            }
        });
        btn4y.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt4.setText("Y");
                txt_turn.setText("X");
            }
        });
        btn5y.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt5.setText("Y");
                txt_turn.setText("X");
            }
        });
        btn6y.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt6.setText("Y");
                txt_turn.setText("X");
            }
        });
        btn7y.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt7.setText("Y");
                txt_turn.setText("X");
            }
        });
        btn8y.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt8.setText("Y");
                txt_turn.setText("X");
            }
        });
        btn9y.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt9.setText("Y");
                txt_turn.setText("X");
            }
        });


        /*
        while (end[0] == 0) {

            while (game[0] == 1) {



            }

            while (game[0] == 0) {
                txt1.setText("1");
                txt2.setText("2");
                txt3.setText("3");
                txt4.setText("4");
                txt5.setText("5");
                txt6.setText("6");
                txt7.setText("7");
                txt8.setText("8");
                txt9.setText("9");
                game[0] = 1;
            }

            esc.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    end[0] = 1;
                }
            });

        }*/





    }


}