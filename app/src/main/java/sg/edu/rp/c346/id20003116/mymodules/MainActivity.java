package sg.edu.rp.c346.id20003116.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvC203, tvC228, tvC328, tvC331, tvC346;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvC203 = findViewById(R.id.tv_203);
        tvC203.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, moduleDetails.class);
                intent.putExtra("module", "C203");
                startActivity(intent);
            }
        });

        tvC228 = findViewById(R.id.tv_228);
        tvC228.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, moduleDetails.class);
                intent.putExtra("module", "C228");
                startActivity(intent);
            }
        });


        tvC328 = findViewById(R.id.tv_328);
        tvC328.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, moduleDetails.class);
                intent.putExtra("module", "C328");
                startActivity(intent);
            }
        });


        tvC331 = findViewById(R.id.tv_331);
        tvC331.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, moduleDetails.class);
                intent.putExtra("module", "C331");
                startActivity(intent);
            }
        });


        tvC346 = findViewById(R.id.tv_346);
        tvC346.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, moduleDetails.class);
                intent.putExtra("module", "C346");
                startActivity(intent);
            }
        });

    }
}