package com.example.quantum.college_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class login_activity extends AppCompatActivity {
    private EditText email,rollno;
    private String Email,Rollno;
    private Button login;
    private boolean result;
    private int a;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_activity);
        email=(EditText)findViewById(R.id.editText);
        rollno=(EditText)findViewById(R.id.editText2);
        login=(Button)findViewById(R.id.button);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (validate())
                {
                    Email=email.getText().toString();
                    a=Email.length();
                    if(Email.substring(a-13,a).equals("@iitbbs.ac.in")){
                        Toast.makeText(login_activity.this,"login successful",Toast.LENGTH_SHORT).show();
                        email.setText("");
                        rollno.setText("");
                        //startActivity(new Intent(login_activity.this,));
                    }
                    else
                    {
                        Toast.makeText(login_activity.this,"Please Enter correct details",Toast.LENGTH_SHORT).show();
                        email.setText("");
                        rollno.setText("");
                    }
                    
                }
            }
        });


    }
    private boolean validate(){
        result=false;
        if(email.getText().toString().isEmpty()||rollno.getText().toString().isEmpty()){
            Toast.makeText(login_activity.this,"Please fill all the details",Toast.LENGTH_SHORT).show();
        }
        else {
            result = true;
        }
        return result;

    }
}
