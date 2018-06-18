package com.infomuslims;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;



public class ContactActivity extends AppCompatActivity implements View.OnClickListener {

    ImageView img_contact_back;
    Button btn_submit_mail;
    EditText et_contactname, et_contactsummary;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);

        // refer id's
        initializeId();

        // on click listener
        clicLkListener();
    }

    // id's
    private void initializeId() {
        img_contact_back = (ImageView) findViewById(R.id.img_contact_back);
        btn_submit_mail = (Button)findViewById(R.id.btn_submit_mail);
        et_contactname = (EditText)findViewById(R.id.et_contactname);
        et_contactsummary = (EditText)findViewById(R.id.et_contactsummary);

    }

    private void clicLkListener() {
        img_contact_back.setOnClickListener(this);
        btn_submit_mail.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.img_contact_back:
                Intent intent = new Intent(ContactActivity.this, HomeScreen.class);
                startActivity(intent);

                break;

            case R.id.btn_submit_mail:
                String name = et_contactname.getText().toString();
                String summary = et_contactsummary.getText().toString();

                if(name.equalsIgnoreCase("")){

                    et_contactname.setError("Name required");
                    et_contactname.requestFocus();
                }

                else if(summary.equalsIgnoreCase("")){
                    et_contactsummary.setError("Summary required");
                    et_contactsummary.requestFocus();
                }
                else {

                    Intent intent_mail = new Intent(Intent.ACTION_SEND);
                    intent_mail.putExtra(Intent.EXTRA_EMAIL,new String[]{"infomuslimsapp@gmail.com"} );
                    intent_mail.putExtra(Intent.EXTRA_TEXT, name);
                    intent_mail.putExtra(Intent.EXTRA_SUBJECT,summary );
                    intent_mail.setType("message/rfc822");
                    startActivity(intent_mail);
                }
                break;
        }
    }
}
