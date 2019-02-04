package android.itesm.edu.queen;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class RandomActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_random);

    }
    public void done(View view){
        Intent intent = new Intent();
        String value = ((int)(Math.random()* 6)) + "";
        switch (value){
            case "1":
                value="Another One Bites The Dust";
                break;
            case "2":
                value = "Bohemian Rhapsody";
                break;
            case "3":
                value = "Don't Stop Me Now";
                break;
            case "4":
                value = "I Want To Break Free";
                break;
            case "5":
                value = "Somebody To Love";
                break;
            case "6":
                value = "We Will Rock You";
                break;

        }

        ((TextView)findViewById(R.id.textView)).setText(value);
        intent.putExtra("random", value);
        setResult(Activity.RESULT_OK, intent);
        finish();
    }

}
