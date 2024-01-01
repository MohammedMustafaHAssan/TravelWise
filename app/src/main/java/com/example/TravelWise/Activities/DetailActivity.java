package com.example.TravelWise.Activities;



import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.TravelWise.Domains.PopDomain;
import com.example.TravelWise.R;
public class DetailActivity extends AppCompatActivity {
    private TextView titleTxt, LocText, bedTxt, guideTxt,
            wifiTxt, DesText, scoreTxt;
    private PopDomain item;
    private ImageView picImg, backBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);


        titleTxt = findViewById(R.id.titleTxt);
        LocText = findViewById(R.id.locationTxt);
        bedTxt = findViewById(R.id.bedTxt);
        guideTxt = findViewById(R.id.guideTxt);
        wifiTxt = findViewById(R.id.wifiTxt);
        DesText = findViewById(R.id.descriptionTxt);
        scoreTxt = findViewById(R.id.scoreTxt);
        picImg = findViewById(R.id.picImg);
        scoreTxt = findViewById(R.id.scoreTxt);
        backBtn=findViewById(R.id.backBtn);
        fixVariable();
    }
    private void fixVariable() {
        item = (PopDomain) getIntent().getSerializableExtra("object");

        titleTxt.setText(item.getTitle());
        scoreTxt.setText(""+ item.getScore());
        LocText.setText(item.getLocation());
        bedTxt.setText(item.getBed() + " Bed");
        DesText.setText(item.getDescription());
        if (item.isGuide()) {
            guideTxt.setText("Guide");
        } else {
            guideTxt.setText("No-Guide");
        }
        if (item.isWifi()) {
            wifiTxt.setText("Wifi");
        } else {
            wifiTxt.setText("No-Wifi");
        }
        int drawableResId = getResources().getIdentifier(item.getPic(),
                "drawable", getPackageName());

        Glide.with(this)
                .load(drawableResId)
                .into(picImg);

        backBtn.setOnClickListener(v -> finish());

    }

}