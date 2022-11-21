package com.missouristate.arnold.friendsdeadline;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


public class InsertActivity extends AppCompatActivity {
    private DatabaseManager dbManager;

    public void onCreate( Bundle savedInstanceState ) {
        super.onCreate( savedInstanceState );
        dbManager = new DatabaseManager(this);
        setContentView( R.layout.activity_insert );
    }

    public void insert( View v ) {
        // Retrieve name and email
        EditText firstNameEditText = findViewById( R.id.input_first_name );
        EditText lastNameEditText = findViewById( R.id.input_last_name );
        EditText emailEditText = findViewById( R.id.input_email );
        EditText taskEditText = findViewById( R.id.input_to_do );
        String firstNameString = firstNameEditText.getText( ).toString( );
        String lastNameString = lastNameEditText.getText( ).toString( );
        String emailString = emailEditText.getText().toString();
        String taskString = taskEditText.getText( ).toString( );


        // insert new friend in database
        try {
            Friend friend = new Friend( 0, firstNameString, lastNameString, emailString, taskString );
            dbManager.insert( friend );
            Toast.makeText( this, "Friend added", Toast.LENGTH_SHORT ).show( );
        } catch (Exception e) {
            Toast.makeText( this, "Error", Toast.LENGTH_LONG ).show( );
        }


        // clear data
        firstNameEditText.setText( "" );
        lastNameEditText.setText( "" );
        emailEditText.setText("");
        taskEditText.setText( "" );
    }

    public void goBack( View v ) {
        this.finish( );
    }
}