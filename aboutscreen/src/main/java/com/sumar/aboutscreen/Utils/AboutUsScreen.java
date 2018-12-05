package com.sumar.aboutscreen.Utils;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.widget.ImageView;
import com.sumar.aboutscreen.Activities.AboutUs;

import java.io.Serializable;

public class AboutUsScreen {
    public static class Builder implements Serializable {
        final transient Context context;
        public boolean isTitleEnabled = true;
        public int titleColor;
        public String title;
        public int titleSize;
        public boolean isDescriptionEnabled = true;
        public int descriptionColor;
        public String description;
        public int descriptionSize;
        public boolean isLogoEnabled = true;
        public int logoDrawable;
        public ImageView.ScaleType logoScaleType;
        public boolean isVersionNoEnabled = true;
        public int versionNoColor;
        public String versionNo;
        public int versionNoSize;
        public boolean isLinkButtonEnabled = true;
        public String linkButtonUrl;
        public String linkButtonText;
        public String linkButtonHeadingText;
        public int linkButtonHeadingColor;
        public int linkButtonHeadingSize;
        public int linkButtonTextColor;
        public int linkButtonBackgroundColor;
        public int linkButtonTextSize;
        public int headerBackgroundColor;
        public int bodyBackgroundColor;
        public int toolbarBackgroundColor;
        public int toolbarTextColor;
        public String toolbarTitle = "About Us";
        public int toolbarBackButtonColor;

        public Builder(@NonNull Activity activity) {
            this.context = activity;
        }

        public Builder(@NonNull Context context) {
            this.context = context;
        }

        public Builder setToolbarBackgroundColor(int toolbarBackgroundColor) {
            this.toolbarBackgroundColor = toolbarBackgroundColor;
            return this;
        }

        public Builder setToolbarTextColor(int toolbarTextColor) {
            this.toolbarTextColor = toolbarTextColor;
            return this;
        }

        public Builder setToolbarTitle(String toolbarTitle) {
            this.toolbarTitle = toolbarTitle;
            return this;
        }

        public Builder setToolbarBackButtonColor(int toolbarBackButtonColor) {
            this.toolbarBackButtonColor = toolbarBackButtonColor;
            return this;
        }

        public Builder setBodyBackgroundColor(int bodyBackgroundColor) {
            this.bodyBackgroundColor = bodyBackgroundColor;
            return this;
        }

        public Builder setHeaderBackgroundColor(int headerBackgroundColor) {
            this.headerBackgroundColor = headerBackgroundColor;
            return this;
        }

        public Builder setLinkButtonHeadingColor(int linkButtonHeadingColor) {
            this.linkButtonHeadingColor = linkButtonHeadingColor;
            return this;
        }

        public Builder setLinkButtonHeadingSize(int linkButtonHeadingSize) {
            this.linkButtonHeadingSize = linkButtonHeadingSize;
            return this;
        }

        public Builder setLinkButtonHeadingText(String linkButtonHeadingText) {
            this.linkButtonHeadingText = linkButtonHeadingText;
            return this;
        }

        public Builder setLinkButtonEnabled(boolean linkButtonEnabled) {
            isLinkButtonEnabled = linkButtonEnabled;
            return this;
        }

        public Builder setLinkButtonUrl(String linkButtonUrl) {
            this.linkButtonUrl = linkButtonUrl;
            return this;
        }

        public Builder setLinkButtonText(String linkButtonText) {
            this.linkButtonText = linkButtonText;
            return this;
        }

        public Builder setLinkButtonTextColor(int linkButtonTextColor) {
            this.linkButtonTextColor = linkButtonTextColor;
            return this;
        }

        public Builder setLinkButtonBackgroundColor(int linkButtonBackgroundColor) {
            this.linkButtonBackgroundColor = linkButtonBackgroundColor;
            return this;
        }

        public Builder setLinkButtonTextSize(int linkButtonTextSize) {
            this.linkButtonTextSize = linkButtonTextSize;
            return this;
        }

        public Builder setTitleEnabled(boolean isTitleEnabled) {
            this.isTitleEnabled = isTitleEnabled;
            return this;
        }

        public Builder setTitleColor(int titleColor) {
            this.titleColor = titleColor;
            return this;
        }

        public Builder setTitle(String title) {
            this.title = title;
            return this;
        }

        public Builder setTitleSize(int titleSize) {
            this.titleSize = titleSize;
            return this;
        }

        public Builder setDescriptionEnabled(boolean descriptionEnabled) {
            isDescriptionEnabled = descriptionEnabled;
            return this;
        }

        public Builder setDescriptionColor(int descriptionColor) {
            this.descriptionColor = descriptionColor;
            return this;
        }

        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        public Builder setDescriptionSize(int descriptionSize) {
            this.descriptionSize = descriptionSize;
            return this;
        }

        public Builder setLogoEnabled(boolean logoEnabled) {
            isLogoEnabled = logoEnabled;
            return this;
        }

        public Builder setLogoDrawable(int logoDrawable) {
            this.logoDrawable = logoDrawable;
            return this;
        }

        public Builder setLogoScaleType(ImageView.ScaleType logoScaleType) {
            this.logoScaleType = logoScaleType;
            return this;
        }

        public Builder setVersionNoEnabled(boolean versionNoEnabled) {
            isVersionNoEnabled = versionNoEnabled;
            return this;
        }

        public Builder setVersionNoColor(int versionNoColor) {
            this.versionNoColor = versionNoColor;
            return this;
        }

        public Builder setVersionNo(String versionNo) {
            this.versionNo = versionNo;
            return this;
        }

        public Builder setVersionNoSize(int versionNoSize) {
            this.versionNoSize = versionNoSize;
            return this;
        }

        public void showScreen() {
            startAboutUsActivity();
        }

        private void startAboutUsActivity() {
            Intent intent = new Intent(context, AboutUs.class);
            intent.putExtra(Constants.BUILDER_NAME, this);
            context.startActivity(intent);
        }
    }
}
