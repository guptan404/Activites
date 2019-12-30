package nikhil.guptan404.com.activities;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void doSomething(View view) {
        Intent intent = new Intent(this,Main2Activity.class);
        startActivity(intent);

    }

    public void web(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://developer.android.com/guide/components/activities/intro-activities"));
        startActivity(intent);
    }
    public void geo(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:28.7041,77.1025"));
        startActivity(intent);

    }
    public void tel(View view) {
        Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:+919393758394"));
        startActivity(intent);
    }

}
