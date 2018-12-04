package com.niteroomcreation.exampletest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.niteroomcreation.exampletest.service.UserService;

import javax.inject.Inject;

import dagger.android.AndroidInjection;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private EditText userNameField;
    private TextView displayUsername;

    @Inject
    UserService userService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AndroidInjection.inject(this);

        setContentView(R.layout.activity_main);
        initViews();
    }

    private void initViews() {
        button = (Button) findViewById(R.id.set_user_name);
        userNameField = (EditText) findViewById(R.id.name_field);
        displayUsername = (TextView) findViewById(R.id.display_user_name);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayUsername.setText(userService.displayUserName(userNameField.getText().toString()));
            }
        });
    }
}
