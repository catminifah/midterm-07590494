package th.ac.su.speedcalculator;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = (Button) findViewById(R.id.button);
        Button button2 = (Button) findViewById(R.id.button2);
        final TextView resultTextView = findViewById(R.id.textView7);
        final EditText m = (EditText) findViewById(R.id.Entermeter);
        final EditText s =(EditText) findViewById(R.id.Entersecond);
        String mmm = m.getText().toString();
        String sss = s.getText().toString();
        if(mmm.equals("")||sss.equals("")){
        Toast t = Toast.makeText(MainActivity.this, "Time must be greater than zero.",Toast.LENGTH_LONG);
        t.show();}
        final double mm = Double.parseDouble(mmm);
        final double ss = Double.parseDouble(sss);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                m.clearAnimation();
                s.clearAnimation();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double Speed=(mm*60*6)/(ss*100);
                String str = String.format(
                        Locale.getDefault(), "%.2f", Speed
                );
                resultTextView.setText(str);
            }
        });
    }
}