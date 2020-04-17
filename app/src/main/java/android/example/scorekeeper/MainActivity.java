package android.example.scorekeeper;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int score1 = 0;
    int score2 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private void Displaymesasage1(String text) {
        TextView quantityTextView = (TextView) findViewById(
                R.id.TeamA);
        quantityTextView.setText("" + text);
    }
    private void Displaymesasage2(String text) {
        TextView quantityTextView = (TextView) findViewById(
                R.id.TeamB);
        quantityTextView.setText("" + text);
    }


      public void add1(View view) {
          score1=score1+1;
          Displaymesasage1("score:" + score1);
      }
      public void add2(View view){
        score2=score2+1;
          Displaymesasage2("score:" + score2);
      }
}



