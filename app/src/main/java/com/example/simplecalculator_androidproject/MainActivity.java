package com.example.simplecalculator_androidproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,badd,bsub,bmul,bdiv,bdot,bequal,bac,bmod,bsr,bp;
    double var1,var2;
    boolean add,sub,mul,div,mod;
    TextView input,ans;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = (Button) findViewById(R.id.one_button);
        b2 = (Button) findViewById(R.id.two_button);
        b3=(Button) findViewById(R.id.three_button);
        b4=(Button) findViewById(R.id.four_button);
        b5=(Button) findViewById(R.id.five_button);
        b6=(Button) findViewById(R.id.six_button);
        b7=(Button) findViewById(R.id.seven_button);
        b8=(Button) findViewById(R.id.eight_button);
        b9=(Button) findViewById(R.id.nine_button);
        b0=(Button) findViewById(R.id.zero_button);
        badd=(Button) findViewById(R.id.plus_button);
        bsub=(Button) findViewById(R.id.minus_button);
        bmul=(Button) findViewById(R.id.mul_button);
        bdiv=(Button) findViewById(R.id.div_button);
        bequal=(Button) findViewById(R.id.equal_button);
        bdot=(Button) findViewById(R.id.dot_button);
        bac=(Button) findViewById(R.id.claer_button);
        bmod=(Button) findViewById(R.id.modulus_button);
        bsr=(Button) findViewById(R.id.sqrt_button);
        bp=(Button) findViewById(R.id.power_button);
        input=(TextView) findViewById(R.id.input);
        ans=(TextView) findViewById(R.id.result);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText()+"1");
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText()+"2");
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText()+"3");
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText()+"4");
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText()+"5");
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText()+"6");
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText()+"7");
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText()+"8");
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText()+"9");
            }
        });
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText()+"0");
            }
        });
        bdot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText()+".");
            }
        });
        bac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(null);
            }
        });

        bsr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans.setText(ans.getText()+"√");
            }
        });

        bp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans.setText(ans.getText()+"^");
            }
        });

        badd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ans==null){
                    input.setText("");
                }
                else{
                    var1=Double.parseDouble(input.getText()+"");
                    add=true;
                    input.setText(null);
                }
            }
        });

        bsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ans==null){
                    input.setText("");
                }
                else{
                    var1=Double.parseDouble(input.getText()+"");
                    sub=true;
                    input.setText(null);
                }
            }
        });

        bmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ans==null){
                    input.setText("");
                }
                else{
                    var1=Double.parseDouble(input.getText()+"");
                    mul=true;
                    input.setText(null);
                }
            }
        });

        bdiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ans==null){
                    input.setText("");
                }
                else{
                    var1=Double.parseDouble(input.getText()+"");
                    div=true;
                    input.setText(null);
                }
            }
        });

        bmod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ans==null){
                    input.setText("");
                }
                else{
                    var1=Double.parseDouble(input.getText()+"");
                    mod=true;
                    input.setText(null);
                }
            }
        });

        bequal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                var2=Double.parseDouble(input.getText()+"");
                if(add==true){
                    ans.setText(var1+var2+"");
                    add=false;
                }
                if(sub==true){
                    ans.setText(var1-var2+"");
                    sub=false;
                }
                if(mul==true){
                    ans.setText(var1*var2+"");
                    mul=false;
                }
                if(div==true){
                    ans.setText(var1/var2+"");
                    div=false;
                }
                if(mod==true){
                    if(var2==0){
                        ans.setText("NaN");
                    }
                    else{
                        ans.setText(var1%var2+"");
                        mod=false;
                    }
                }

            }
        });
    }
}
