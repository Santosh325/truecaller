package com.example.truecaller;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static final int REQUEST_CALL = 1;
    ImageView imageDel;
    Button buttonOne,buttonTwo,buttonThree,buttonFour,buttonFive,buttonSix;
    Button buttonSeven,buttonEight,buttonNine,buttonZero;
    Button buttonAesterik,buttonHash;
    ImageView imageText,imageCall,imageWhatsApp;
    EditText out;
    LinearLayout visible;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageDel = findViewById(R.id.del);
        buttonOne = findViewById(R.id.one);
        buttonTwo = findViewById(R.id.two);
        buttonThree = findViewById(R.id.three);
        buttonFour = findViewById(R.id.four);
        buttonFive = findViewById(R.id.five);
        buttonSix = findViewById(R.id.six);
        buttonSeven = findViewById(R.id.seven);
        buttonEight = findViewById(R.id.eight);
        buttonNine = findViewById(R.id.nine);
        buttonZero = findViewById(R.id.zero);
        buttonAesterik = findViewById(R.id.aesterik);
        buttonHash = findViewById(R.id.hash);
        imageText = findViewById(R.id.text);
        imageCall = findViewById(R.id.call);
        imageWhatsApp = findViewById(R.id.whatsapp);
        out = findViewById(R.id.output);
        visible = findViewById(R.id.visible);
        buttonOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               if(out.getText().toString().equals(""))  {
                   out.setText("1");
                   visible.setVisibility(View.VISIBLE);
               } else {
                   out.append("1");
                   visible.setVisibility(View.VISIBLE);

               }
            }
        });
        buttonTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(out.getText().equals("")) {
                    out.setText("2");
                    visible.setVisibility(View.VISIBLE);
                } else {
                    visible.setVisibility(View.VISIBLE);
                    out.append("2");
                }
            }
        });
        buttonThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(out.getText().toString().equals("")) {
                    out.setText("3");
                    visible.setVisibility(View.VISIBLE);
                } else {
                    out.append("3");
                    visible.setVisibility(View.VISIBLE);
                }
            }
        });
        buttonFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(out.getText().equals("")) {
                    out.setText("4");
                    visible.setVisibility(View.VISIBLE);
                } else {
                    out.append("4");
                    visible.setVisibility(View.VISIBLE);
                }
            }
        });
        buttonFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(out.getText().toString().equals("")) {
                    out.setText("5");
                    visible.setVisibility(View.VISIBLE);
                } else {
                    out.append("5");
                    visible.setVisibility(View.VISIBLE);
                }
            }
        });
        buttonSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(out.getText().equals("")) {
                    out.setText("6");
                    visible.setVisibility(View.VISIBLE);
                } else {
                    out.append("6");
                    visible.setVisibility(View.VISIBLE);
                }
            }
        });
        buttonSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(out.getText().toString().equals("")) {
                    out.setText("7");
                    visible.setVisibility(View.VISIBLE);
                } else {
                    out.append("7");
                    visible.setVisibility(View.VISIBLE);
                }
            }
        });
        buttonEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(out.getText().equals("")) {
                    out.setText("8");
                    visible.setVisibility(View.VISIBLE);
                } else {
                    out.append("8");
                    visible.setVisibility(View.VISIBLE);
                }
            }
        });
        buttonNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(out.getText().toString().equals("")) {
                    out.setText("9");
                    visible.setVisibility(View.VISIBLE);
                } else {
                    out.append("9");
                    visible.setVisibility(View.VISIBLE);
                }
            }
        });
        buttonZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(out.getText().equals("")) {
                    out.setText("0");
                    visible.setVisibility(View.VISIBLE);
                } else {
                    out.append("0");
                    visible.setVisibility(View.VISIBLE);
                }
            }
        });
        buttonAesterik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(out.getText().equals("")) {
                    out.setText("*");
                    visible.setVisibility(View.VISIBLE);
                } else {
                    out.append("*");
                    visible.setVisibility(View.VISIBLE);
                }
            }
        });
        buttonHash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(out.getText().equals("")) {
                    out.setText("#");
                    visible.setVisibility(View.VISIBLE);
                } else {
                    out.append("#");
                    visible.setVisibility(View.VISIBLE);
                }
            }
        });
        imageDel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = out.getText().toString();
                if(str.length() >= 1) {
                    str = str.substring(0,str.length() - 1);
                    out.setText(str);
                } else{
                    visible.setVisibility(View.INVISIBLE);
                }
            }
        });
        imageText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               String str = out.getText().toString();
                Intent sendIntent = new Intent();
                sendIntent.setAction(Intent.ACTION_SEND);
                sendIntent.putExtra(Intent.EXTRA_TEXT," ");
                sendIntent.setType("text/plain");
                startActivity(sendIntent);
            }
        });
        imageWhatsApp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sendIntent = new Intent();
                sendIntent.setAction(Intent.ACTION_SEND);
                sendIntent.putExtra(Intent.EXTRA_TEXT,"Assignment Completed");
                sendIntent.setType("text/plain");
                sendIntent.setPackage("com.whatsapp");
                startActivity(sendIntent);
            }
        });
        imageCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                makePhoneCall();


            }
        });
    }
    void makePhoneCall() {
        String number = out.getText().toString();
        if(number.trim().length() > 0) {
            if(ContextCompat.checkSelfPermission(MainActivity.this,
                    Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                ActivityCompat.requestPermissions(MainActivity.this,
                        new String[] {Manifest.permission.CALL_PHONE},REQUEST_CALL);
            } else {
                String dial = "tel: " + number;
                startActivity(new Intent(Intent.ACTION_CALL,Uri.parse(dial)));
            }
        } else {
            Toast.makeText(MainActivity.this,"Please Enter phone Number", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        if(requestCode == REQUEST_CALL) {
            if(grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                makePhoneCall();
            } else {
                Toast.makeText(this, "permission Denided", Toast.LENGTH_SHORT).show();
            }
        }
    }
}
