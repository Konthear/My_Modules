package sg.edu.rp.c346.id20003116.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class moduleDetails extends AppCompatActivity {

    TextView tvDisplay;
    Button backBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module_details);

        tvDisplay = findViewById(R.id.textView);
        backBtn = findViewById(R.id.backBtn);

        Intent intentReceived = getIntent();
        String moduleSelected = intentReceived.getStringExtra("module");
        tvDisplay.setText("Module Code: " + moduleSelected);

        if (moduleSelected.equals("C203")) {
            tvDisplay.append("\nModule Name: Web App In Development in PHP");
            tvDisplay.append("\nAcademic Year: 2021");
            tvDisplay.append("\nSemester: 1");
            tvDisplay.append("\nModule Credit: ");
            tvDisplay.append("\nVenue: W67L");
        }

        else if (moduleSelected.equals("C228")) {
            tvDisplay.append("\nModule Name: Operating Systems Security");
            tvDisplay.append("\nAcademic Year: 2021");
            tvDisplay.append("\nSemester: 1");
            tvDisplay.append("\nModule Credit: 4");
            tvDisplay.append("\nVenue: E62L");
        }

        else if (moduleSelected.equals("C328")) {
            tvDisplay.append("\nModule Name: Intelligent Networks");
            tvDisplay.append("\nAcademic Year: 2021");
            tvDisplay.append("\nSemester: 1");
            tvDisplay.append("\nModule Credit: 4");
            tvDisplay.append("\nVenue: E62C");
        }

        else if (moduleSelected.equals("C331")) {
            tvDisplay.append("\nModule Name: Digital Security and Forensics");
            tvDisplay.append("\nAcademic Year: 2021");
            tvDisplay.append("\nSemester: 1");
            tvDisplay.append("\nModule Credit: 4");
            tvDisplay.append("\nVenue: E61J");
        }

        else if (moduleSelected.equals("C346")) {
            tvDisplay.append("\nModule Name: Mobile App Development");
            tvDisplay.append("\nAcademic Year: 2021");
            tvDisplay.append("\nSemester: 1");
            tvDisplay.append("\nModule Credit: 4");
            tvDisplay.append("\nVenue: E62E");
        }

         backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(moduleDetails.this, MainActivity.class);
                startActivity(intent);
            }
         });
    }
}