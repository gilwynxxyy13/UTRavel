package com.example.johnabedeza.utravel;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class reg1 extends AppCompatActivity {


    public Button btnreg;
    public Button btnreg2;

    public void init(){
        btnreg = (Button)findViewById(R.id.btnback1);
        btnreg.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent layreg = new Intent(reg1.this,loginpage.class);

                startActivity(layreg);
            }
        });

    }

    public void init2(){
        btnreg2 = (Button)findViewById(R.id.btnreg2);
        btnreg2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent layreg = new Intent(reg1.this,reg2.class);

                startActivity(layreg);
            }
        });

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reg1);
        init();
        init2();

        ImageView myImageView = (ImageView) findViewById(R.id.imageView2);
        myImageView.setImageResource(R.drawable.utlogo);
    }
}
