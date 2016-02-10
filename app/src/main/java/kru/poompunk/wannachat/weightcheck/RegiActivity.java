package kru.poompunk.wannachat.weightcheck;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class RegiActivity extends AppCompatActivity {

    // Ex
    private EditText userEditText, passEditText,nameEditText,telEditText;
    private String userString, passString, nameString, telString;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regi);

        //bind widget
        bindwidget();



    } //method

    private void bindwidget() {

        userEditText = (EditText) findViewById(R.id.editText);
        passEditText = (EditText) findViewById(R.id.editText2);
        nameEditText = (EditText) findViewById(R.id.editText3);
        telEditText = (EditText) findViewById(R.id.editText4);

    }

    public void clickRegis(View view) {

        userString = userEditText.getText().toString().trim();
        passString = passEditText.getText().toString().trim();
        nameString = nameEditText.getText().toString().trim();
        telString = telEditText.getText().toString().trim();

        if (userString.equals("") || passString.equals("") || nameString.equals("") || telString.equals("")) {
            //have
            Toast.makeText(RegiActivity.this, getResources().getString(R.string.have_spare),
                    Toast.LENGTH_SHORT).show();
        } else {
            //no
            MyManage objMyManage = new MyManage(this);
            objMyManage.addUserTable(userString, passString, nameString, telString);
            Toast.makeText(RegiActivity.this,getResources().getString(R.string.success_regis),
                    Toast.LENGTH_SHORT).show();
            finish();
        }

    }//click

}// class
