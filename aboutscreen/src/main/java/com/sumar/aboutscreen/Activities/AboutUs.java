package com.sumar.aboutscreen.Activities;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.net.Uri;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.sumar.aboutscreen.R;
import com.sumar.aboutscreen.Utils.AboutUsScreen;
import com.sumar.aboutscreen.Utils.Constants;

public class AboutUs extends AppCompatActivity {

    TextView tvTitle;
    ImageView ivLogo;
    TextView tvDescription;
    TextView tvVersionNumber;
    TextView tvLinkHeading;
    LinearLayout linkLayout;
    ConstraintLayout cHeaderLayout;
    ConstraintLayout clBackground;
    Button linkButton;
    AboutUsScreen.Builder builder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us);
        builder = (AboutUsScreen.Builder) getIntent().getSerializableExtra(Constants.BUILDER_NAME);
        if (builder == null) {
            finish();
        }
        setUpViews();
        populateView();
    }

    private void populateView() {
        setHeaderBackground();
        setBodyBackground();
        populateLogo();
        populateTitle();
        populateDescription();
        populateVersionNumber();
        populateLinkButton();
    }

    private void setBodyBackground() {
        if (builder.bodyBackgroundColor != 0) {
            clBackground.setBackgroundColor(builder.bodyBackgroundColor);
        } else {
            clBackground.setBackgroundColor(Color.WHITE);
        }
    }

    private void setHeaderBackground() {
        if (builder.headerBackgroundColor != 0) {
            cHeaderLayout.setBackgroundColor(builder.headerBackgroundColor);
        } else {
            cHeaderLayout.setBackgroundColor(ContextCompat.getColor(this, R.color.gray));
        }
    }

    private void populateLinkButton() {
        if (builder.isLinkButtonEnabled) {
            showLinkButton();
        } else {
            hideLinkButton();
        }
    }

    private void hideLinkButton() {
        linkLayout.setVisibility(View.GONE);
    }

    private void showLinkButton() {
        linkLayout.setVisibility(View.VISIBLE);

        int textColor = builder.linkButtonTextColor != 0 ? builder.linkButtonTextColor : ContextCompat.getColor(this, R.color.black);
        linkButton.setTextColor(textColor);

        String text = builder.linkButtonText != null ? builder.linkButtonText : "More Apps";
        linkButton.setText(text);

        int linkButtonTextSize = builder.linkButtonTextSize != 0 ? builder.linkButtonTextSize : 12;
        linkButton.setTextSize(linkButtonTextSize);

        int linkButtonBackgroundColor = builder.linkButtonBackgroundColor != 0 ? builder.linkButtonBackgroundColor : ContextCompat.getColor(this, R.color.gray);
        linkButton.setBackgroundColor(linkButtonBackgroundColor);

        final String url = builder.linkButtonUrl != null ? builder.linkButtonUrl : "https://play.google.com/store/apps/developer?id=SUMAR_TECH";
        linkButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse(url);
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        String buttonHeadingText = builder.linkButtonHeadingText != null ? builder.linkButtonHeadingText : "View more apps by SUMAR TECH.";
        tvLinkHeading.setText(buttonHeadingText);

        int linkButtonHeadingColor = builder.linkButtonHeadingColor != 0 ? builder.linkButtonHeadingColor : ContextCompat.getColor(this, R.color.black);
        tvLinkHeading.setTextColor(linkButtonHeadingColor);

        int linkButtonHeadingSize = builder.linkButtonHeadingSize != 0 ? builder.linkButtonHeadingSize : 16;
        tvVersionNumber.setTextSize(linkButtonHeadingSize);


    }

    private void populateVersionNumber() {
        if (builder.isVersionNoEnabled) {
            showVersionNo();
        } else {
            hideVersionNo();
        }
    }

    private void hideVersionNo() {
        tvVersionNumber.setVisibility(View.GONE);
    }

    private void showVersionNo() {
        tvVersionNumber.setVisibility(View.VISIBLE);

        int textColor = builder.versionNoColor != 0 ? builder.versionNoColor : ContextCompat.getColor(this, R.color.gray);
        tvVersionNumber.setTextColor(textColor);

        String text = builder.versionNo != null ? builder.versionNo : "1.0";
        tvVersionNumber.setText(this.getString(R.string.version_no, text));

        int textSize = builder.versionNoSize != 0 ? builder.versionNoSize : 16;
        tvVersionNumber.setTextSize(textSize);
    }

    private void populateDescription() {
        if (builder.isDescriptionEnabled) {
            showDescription();
        } else {
            hideDescription();
        }
    }

    private void hideDescription() {
        tvDescription.setVisibility(View.GONE);
    }

    private void showDescription() {
        tvDescription.setVisibility(View.VISIBLE);

        int textColor = builder.descriptionColor != 0 ? builder.descriptionColor : ContextCompat.getColor(this, R.color.black);
        tvDescription.setTextColor(textColor);

        String text = builder.description != null ? builder.description : "Description Text";
        tvDescription.setText(text);

        int textSize = builder.descriptionSize != 0 ? builder.descriptionSize : 16;
        tvDescription.setTextSize(textSize);
    }

    private void populateTitle() {
        if (builder.isTitleEnabled) {
            showTitle();
        } else {
            hideTitle();
        }
    }

    private void hideTitle() {
        tvTitle.setVisibility(View.GONE);
    }

    private void showTitle() {
        tvTitle.setVisibility(View.VISIBLE);

        int textColor = builder.titleColor != 0 ? builder.titleColor : ContextCompat.getColor(this, R.color.black);
        tvTitle.setTextColor(textColor);

        String text = builder.title != null ? builder.title : "Title";
        tvTitle.setText(text);

        int textSize = builder.titleSize != 0 ? builder.titleSize : 16;
        tvTitle.setTextSize(textSize);
    }

    private void populateLogo() {
        if (builder.isLogoEnabled) {
            showLogoLayout();
        } else {
            hideLogoLayout();
        }
    }

    private void hideLogoLayout() {
        ivLogo.setVisibility(View.GONE);
    }

    private void showLogoLayout() {
        ivLogo.setVisibility(View.VISIBLE);
        if (builder.logoDrawable != 0) {
            ivLogo.setImageDrawable(ContextCompat.getDrawable(this, builder.logoDrawable));
        } else {
            ivLogo.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.clogo));
        }
        ImageView.ScaleType scaleType = builder.logoScaleType != null ? builder.logoScaleType : ImageView.ScaleType.FIT_CENTER;
        ivLogo.setScaleType(scaleType);
    }

    private void setUpViews() {
        setUpToolbar();
        tvTitle = findViewById(R.id.tvTitle);
        ivLogo = findViewById(R.id.ivLogo);
        tvDescription = findViewById(R.id.tvDescription);
        tvVersionNumber = findViewById(R.id.tvVersionNo);
        tvLinkHeading = findViewById(R.id.tvLinkHeading);
        linkLayout = findViewById(R.id.lFacebookLayout);
        linkButton = findViewById(R.id.bLink);
        cHeaderLayout = findViewById(R.id.cHeaderLayout);
        clBackground = findViewById(R.id.clBackground);
    }

    private void setUpToolbar() {
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(builder.toolbarTitle);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        int toolbarBackgroundColor = builder.toolbarBackgroundColor != 0 ? builder.toolbarBackgroundColor : ContextCompat.getColor(this, R.color.colorPrimary);
        toolbar.setBackgroundColor(toolbarBackgroundColor);

        int titleTextColor = builder.toolbarTextColor != 0 ? builder.toolbarTextColor :  Color.WHITE;
        toolbar.setTitleTextColor(titleTextColor);

        int backIconColor = builder.toolbarBackButtonColor != 0 ? builder.toolbarBackButtonColor :  Color.WHITE;
        toolbar.getNavigationIcon().setColorFilter(backIconColor, PorterDuff.Mode.SRC_ATOP);
    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }
}
