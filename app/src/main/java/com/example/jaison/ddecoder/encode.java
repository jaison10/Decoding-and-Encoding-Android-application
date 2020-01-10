package com.example.jaison.ddecoder;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class encode extends AppCompatActivity implements View.OnClickListener {

        private Button convert_button;
        private EditText input_code;
        private TextView answer_display;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_encode);


            Button convert_button = (Button) findViewById(R.id.convert_button);
            convert_button.setOnClickListener(this);

        }
        @Override
        public void onClick(View view) {
            encode_fun ();
        }
        public void  encode_fun() {
        EditText input_codee = (EditText) findViewById(R.id.encode);
        TextView answer_display = (TextView) findViewById(R.id.answer_textview);

            StringBuilder answer = new StringBuilder();
            StringBuilder b = new StringBuilder();
            String a = input_codee.getText().toString();
            b.append(a);

            int i;
            for (i = 0; i < b.length(); i++) {

                if (b.charAt(i) == '.') {

                    answer.append("1");
                }
                if (b.charAt(i) == ',') {

                    answer.append("11");

                }

                if (b.charAt(i) == '?') {

                    answer.append("111");

                }

                if (b.charAt(i) == '!') {

                    answer.append("1111");

                }
                if (b.charAt(i) == 'a') {

                    answer.append("2");

                }
                if (a.charAt(i) == 'b') {

                    answer.append("22");
                }
                if (a.charAt(i) == 'c')

                {


                    answer.append("222");

                }

                if (a.charAt(i) == 'd') {

                    answer.append("3");

                }

                if (a.charAt(i) == 'e') {
                    answer.append("33");
                }
                if (a.charAt(i) == 'f') {
                    answer.append("333");

                }

                if (a.charAt(i) == 'g') {


                    answer.append("4");

                }

                if (a.charAt(i) == 'h') {
                    answer.append("44");
                }

                if (a.charAt(i) == 'i') {
                    answer.append("444");
                }

                if (a.charAt(i) == 'j') {
                    answer.append("5");
                }

                if (a.charAt(i) == 'k') {


                    answer.append("55");

                }
                if (a.charAt(i) == 'l') {

                    answer.append("555");
                }

                if (a.charAt(i) == 'm') {
                    answer.append("6");
                }

                if (a.charAt(i) == 'n') {

                    answer.append("66");

                }

                if (a.charAt(i) == 'o') {
                    answer.append("666");
                }

                if (a.charAt(i) == 'p') {


                    answer.append("7");
                }


                if (a.charAt(i) == 'q')

                {
                    answer.append("77");

                }

                if (a.charAt(i) == 'r') {
                    answer.append("777");

                }


                if (a.charAt(i) == 's') {

                    answer.append("7777");
                }

                if (a.charAt(i) == 't') {
                    answer.append("8");
                }


                if (a.charAt(i) == 'u') {
                    answer.append("88");
                }

                if (a.charAt(i) == 'v') {
                    answer.append("888");
                }


                if (a.charAt(i) == 'w') {
                    answer.append("9");
                }

                if (a.charAt(i) == 'x') {
                    answer.append("99");
                }

                if (a.charAt(i) == 'y') {
                    answer.append("999");
                }

                if (a.charAt(i) == 'z') {
                    answer.append("9999");
                }
            }
            answer_display.setText(answer);
        }

}