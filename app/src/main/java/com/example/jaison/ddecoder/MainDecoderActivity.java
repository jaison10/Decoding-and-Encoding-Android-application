package com.example.jaison.ddecoder;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainDecoderActivity extends AppCompatActivity implements View.OnClickListener{
    private Button convert_button;
    private EditText input_code;
    private TextView answer_display;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_decoder);


        Button convert_button = (Button) findViewById(R.id.convert_button);
        convert_button.setOnClickListener(this);

    }
            @Override
            public void onClick(View view) {
                decode_fun();
            }


    public void decode_fun(){
        EditText input_codee = (EditText) findViewById(R.id.input_code);
        TextView answer_display = (TextView) findViewById(R.id.answer_textview);
        TextView test=(TextView) findViewById(R.id.textview);
        StringBuilder answer = new StringBuilder();
        StringBuilder b = new StringBuilder();
        String a = input_codee.getText().toString();
        b.append(a);
        if(b.charAt(b.length()-1)!='/'){
            b.append("/");
        }
        b.append(".");
        test.setText(b);

        int count = 0, i, z = 0;
        for (i = 0; i < b.length(); i++) {
            count = 0;
            if (b.charAt(i) == '0') {
                for (int j = i; b.charAt(j) != '.'; j++) {
                    if(b.charAt(j)!='/'){
                        count++;
                        i++;
                    }
                    else
                        break;
                }
                switch (count) {
                    case 1:
                        answer.append(" ");
                        break;
                }
                continue;
            }
            if (b.charAt(i) == '1') {
                for (int j = i; b.charAt(j) != '.'; j++) {
                    if(b.charAt(j)!='/'){
                        count++;
                        i++;
                    }
                    else
                        break;
                }
                switch (count) {
                    case 1:
                        answer.append(".");
                        break;
                        case 2:
                    answer.append(",");
                        break;
                    case 3:
                        answer.append("?");
                        break;
                    case 4:
                        answer.append("!");
                        break;
                }
                continue;
            }
            if (b.charAt(i) == '2') {
                for (int j = i; b.charAt(j) != '.'; j++) {
                    if(b.charAt(j)!='/'){
                        count++;
                        i++;
                    }
                    else
                        break;
                }
                switch (count) {
                    case 1:
                        answer.append("a");
                        break;
                    case 2:
                        answer.append("b");
                        break;
                    case 3:
                        answer.append("c");
                        break;

                }
                continue;
            }
            if (b.charAt(i) == '3') {
                for (int j = i; b.charAt(j) != '/'; j++) {
                    if(b.charAt(j)!='/'){
                        count++;
                        i++;
                    }
                    else
                        break;
                }
                switch (count) {
                    case 1:
                        answer.append("d");
                        break;
                    case 2:
                        answer.append("e");
                        break;
                    case 3:
                        answer.append("f");
                        break;
                }
                continue;
            }
            if (b.charAt(i) == '4') {
                for (int j = i; b.charAt(j) != '/'; j++) {
                    if(b.charAt(j)!='/'){
                        count++;
                        i++;
                    }
                    else
                        break;
                }

                switch (count) {
                    case 1:
                        answer.append("g");
                        break;
                    case 2:
                        answer.append("h");
                        break;
                    case 3:
                        answer.append("i");
                        break;
                }
                continue;
            }
            if (b.charAt(i) == '5') {
                for (int j = i; b.charAt(j) != '/'; j++) {
                    if(b.charAt(j)!='/'){
                        count++;
                        i++;
                    }
                    else
                        break;
                }
                switch (count) {
                    case 1:
                        answer.append("j");
                        break;
                    case 2:
                        answer.append("k");
                        break;
                    case 3:
                        answer.append("l");
                        break;
                }
                continue;
            }
            if (b.charAt(i) == '6') {
                for (int j = i; b.charAt(j) != '/'; j++) {
                    if(b.charAt(j)!='/'){
                        count++;
                        i++;
                    }
                    else
                        break;
                }
                switch (count) {
                    case 1:
                        answer.append("m");
                        break;
                    case 2:
                        answer.append("n");
                        break;
                    case 3:
                        answer.append("o");
                        break;
                }
                continue;
            }
            if (b.charAt(i) == '7') {
                for (int j = i; b.charAt(j) != '/'; j++) {
                    if(b.charAt(j)!='/'){
                        count++;
                        i++;
                    }
                    else
                        break;
                }
                switch (count) {
                    case 1:
                        answer.append("p");
                        break;
                    case 2:
                        answer.append("q");
                        break;
                    case 3:
                        answer.append("r");
                        break;
                    case 4:
                        answer.append("s");
                        break;
                }
                continue;
            }
            if (b.charAt(i) == '8') {
                for (int j = i; b.charAt(j) != '/'; j++) {
                    if(b.charAt(j)!='/'){
                        count++;
                        i++;
                    }
                    else
                        break;
                }
                switch (count) {
                    case 1:
                        answer.append("t");
                        break;
                    case 2:
                        answer.append("u");
                        break;
                    case 3:
                        answer.append("v");
                        break;
                }
                continue;
            }
            if (b.charAt(i) == '9') {
                for (int j = i; b.charAt(j) != '/'; j++) {
                    if(b.charAt(j)!='/'){
                        count++;
                        i++;
                    }
                    else
                        break;
                }
                switch (count) {
                    case 1:
                        answer.append("w");
                        break;
                    case 2:
                        answer.append("x");
                        break;
                    case 3:
                        answer.append("y");
                        break;
                    case 4:
                        answer.append("z");
                        break;
                }
                continue;

            }
            if(b.charAt(i)=='.'){
                break;
            }
        }
        answer_display.setText(answer);
    }
}