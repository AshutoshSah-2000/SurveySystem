package com.example.surveysystem;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import com.amazonaws.mobileconnectors.dynamodbv2.dynamodbmapper.DynamoDBMapper;
import com.amazonaws.mobile.client.AWSMobileClient;
import com.amazonaws.mobile.client.AWSStartupHandler;
import com.amazonaws.mobile.client.AWSStartupResult;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        AWSMobileClient.getInstance().initialize(this, new AWSStartupHandler() {
            @Override
            public void onComplete(AWSStartupResult awsStartupResult) {
                Log.d("YourMainActivity", "AWSMobileClient is instantiated and you are connected to AWS!");
                Log.d("YourMainActivity", "AWSMobileClient is instantiated and you are connected to AWS!");
                Log.d("YourMainActivity", "AWSMobileClient is instantiated and you are connected to AWS!");
                Log.d("YourMainActivity", "AWSMobileClient is instantiated and you are connected to AWS!");
                Log.d("YourMainActivity", "AWSMobileClient is instantiated and you are connected to AWS!");

            }
        }).execute();

        // More onCreate code ...
    }
}

//mvlfjnfkjbnfskjbvhkjsdvhnldvjladjhocjaslichnslajcnh
