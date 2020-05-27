package com.example.javaquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Start extends AppCompatActivity {
EditText ed1;
String name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        ed1=findViewById(R.id.edname);
    }

    /**
     * @method gotomain is for starting main activity
     * @name is name of the user
     *
     *
     *
     * @param view
     */
    public void gotomain(View view)
    {
        name=ed1.getText().toString();
        if(name!=null){

            Toast.makeText(getApplicationContext(),"Starting Quiz !",Toast.LENGTH_SHORT);
        Intent intent=new Intent(Start.this,MainActivity.class);
        intent.putExtra("USER_NAME", name);

        startActivity(intent);}
        else
        {
            Toast.makeText(this,"please enter your name !",Toast.LENGTH_LONG);
        }


    }
}
