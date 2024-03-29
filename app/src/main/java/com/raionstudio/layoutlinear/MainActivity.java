package com.raionstudio.layoutlinear;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends Activity {

    private Button answerYesButton,answerNoButton;
    private EditText usersNameEditText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        answerNoButton=(Button) findViewById(R.id.answerNoButton);
        answerYesButton=(Button) findViewById(R.id.answerYesButton);
        usersNameEditText=(EditText)findViewById(R.id.editTextName);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void OnYesButtonClick(View view) {
        String usersName=String.valueOf(usersNameEditText.getText());
        String yourResponse="that's great "+usersName;
        Toast.makeText(this, yourResponse,Toast.LENGTH_SHORT).show();
    }

    public void OnNoButtonClick(View view) {
        String usersName=String.valueOf(usersNameEditText.getText());
        String yourResponse="Too Bad "+usersName;
        Toast.makeText(this, yourResponse,Toast.LENGTH_SHORT).show();
    }
}
