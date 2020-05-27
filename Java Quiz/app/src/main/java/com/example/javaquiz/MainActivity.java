package com.example.javaquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.util.Log;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
public int marks;
private RadioGroup q1,q2,q3,q4,q5;
private RadioButton rb1;
private String a1,user_name;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        q1=findViewById(R.id.rgq1);
        q2=findViewById(R.id.rgq2);
        q3=findViewById(R.id.rgq3);
        q4=findViewById(R.id.rgq4);
        q5=findViewById(R.id.rgq5);

        Intent intent=getIntent();
         user_name = intent.getStringExtra("USER_NAME");



    }
    public void goToResult(View view)
    {

        /**
         * @param selctedId is for getting the id of checked radio button
         * @param a1 is text of the radiobutton that is checked
         *
         *
         */
        int selectedId=q1.getCheckedRadioButtonId();
      a1=getStrings(selectedId,rb1);
      getMarks(a1, getString(R.string.q1rb2));


         selectedId=q2.getCheckedRadioButtonId();
        a1=getStrings(selectedId,rb1);
        getMarks(a1, getString(R.string.q2rb2));

        selectedId=q3.getCheckedRadioButtonId();
        a1=getStrings(selectedId,rb1);
        getMarks(a1, getString(R.string.q3rb1));

        selectedId=q4.getCheckedRadioButtonId();
        a1=getStrings(selectedId,rb1);
        getMarks(a1, getString(R.string.q4rb1));

        selectedId=q5.getCheckedRadioButtonId();
        a1=getStrings(selectedId,rb1);
        getMarks(a1, getString(R.string.q5rb1));


        Toast.makeText(getApplicationContext(),"Submitting your Quiz",Toast.LENGTH_SHORT);

        Intent intent=new Intent(this,result.class);
        intent.putExtra("USER_NAME", user_name);
        intent.putExtra("USER_ID",marks);

        startActivity(intent);
    }

    /**
     *
     * @param id is id of selected radio button by user
     * @param rb is radio button object that is answer
     * @return is string that is text of answer radio button that will be returned
     */
    private String getStrings(int id,RadioButton rb)
    {   String answer;
        rb=(RadioButton)findViewById(id);
        answer=(String)rb.getText();
        return answer;

    }

    /**
     *
     * @param a is text of the checked radio button
     * @param b is text of the correct answer radio button
     */
    private void getMarks(String a,String b)
    {
        if(a.equals(b))
        {
            marks+=2;


        }
    }

}
