# AboutUs-Android
# Integration

### Step 1. Add it in your root build.gradle at the end of repositories:
```
allprojects {
	repositories {
		...
		maven { url 'https://jitpack.io' }
	}
}
```
### Step 2. Add the dependency
```
dependencies {
	 implementation 'com.github.SUMAR7:AboutUs-Android:Tag'
}
```
# Example Usage

### You can change this code accourding to your needs.
```
        AboutUsScreen.Builder builder = new AboutUsScreen.Builder(MainActivity.this);

        //setting up title
        
        builder.setTitle("SUMAR-TECH");
        builder.setTitleColor(ContextCompat.getColor(this, R.color.colorPrimaryDark));
        builder.setTitleSize(16);
        builder.setTitleEnabled(true);

        //setting up description
        
        builder.setDescriptionEnabled(true);
        builder.setDescription("This is where you can describe about you.");
        builder.setDescriptionColor(ContextCompat.getColor(this,R.color.colorAccent));
        builder.setDescriptionSize(16);

        //setting up logo
        
        builder.setLogoEnabled(true);
        builder.setLogoDrawable(R.drawable.clogo);
        builder.setLogoScaleType(ImageView.ScaleType.FIT_CENTER);

        //setting up version no
        
        builder.setVersionNoEnabled(true);
        builder.setVersionNo("2.0.1");
        builder.setVersionNoColor(ContextCompat.getColor(this, R.color.gray));
        builder.setVersionNoSize(12);

        //setting up link button
        
        builder.setLinkButtonEnabled(true);
        builder.setLinkButtonUrl("https://play.google.com/store/apps/developer?id=SUMAR_TECH");
        builder.setLinkButtonText("More Apps");
        builder.setLinkButtonBackgroundColor(ContextCompat.getColor(this, R.color.colorAccent));
        builder.setLinkButtonTextColor(ContextCompat.getColor(this, R.color.gray));
        builder.setLinkButtonTextSize(12);

        //setting up button heading
        
        builder.setLinkButtonHeadingText("Checkout more apps by SUMAR-TECH");
        builder.setLinkButtonHeadingColor(ContextCompat.getColor(this, R.color.black));
        builder.setLinkButtonHeadingSize(12);

        //setting up header background color
        
        builder.setHeaderBackgroundColor(ContextCompat.getColor(this, R.color.gray));

        //setting up body background color
        
        builder.setBodyBackgroundColor(Color.WHITE);

        //setting up toolbar
        
        builder.setToolbarTitle("About Us");
        builder.setToolbarBackButtonColor(ContextCompat.getColor(this, R.color.gray));
        builder.setToolbarBackgroundColor(ContextCompat.getColor(this, R.color.colorPrimary));
        builder.setToolbarTextColor(ContextCompat.getColor(this, R.color.gray));

        //show AboutUsScreen
        
        builder.showScreen();
```

