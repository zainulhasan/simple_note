package com.example.syedzainulhasan.quicknote;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import Models.Note;

public class NoteActivity extends AppCompatActivity {


    EditText ed;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_note);

        ed = (EditText) findViewById(R.id.newnote);
        btn = (Button) findViewById(R.id.addbtn);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String n = ed.getText().toString();
                if (n.length() > 0) {
                    Note tmp = new Note(n);
                    tmp.save();
                    Intent intent = new Intent(NoteActivity.this, MainActivity.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                    startActivity(intent);
                } else {
                    Toast.makeText(NoteActivity.this, "Note can not be Empty", Toast.LENGTH_LONG).show();
                }


            }
        });
    }
}
