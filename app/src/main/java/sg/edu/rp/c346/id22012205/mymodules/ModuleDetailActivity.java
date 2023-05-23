package sg.edu.rp.c346.id22012205.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ModuleDetailActivity extends AppCompatActivity {
TextView TvModCode;
TextView TvModName;
TextView TvAcaYear;
TextView TvSem;
TextView TvModCredit;
TextView TvVenue;

Button btnRTM;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module_detail);
        TvModCode=findViewById(R.id.textViewMC);
        TvModName=findViewById(R.id.textViewMN);
        TvAcaYear=findViewById(R.id.textViewAY);
        TvSem=findViewById(R.id.textViewS);
        TvModCredit=findViewById(R.id.textViewModCred);
        TvVenue=findViewById(R.id.textViewV);
        btnRTM=findViewById(R.id.RTM);
        Intent intentReceived=getIntent();
        String questionsSelected=intentReceived.getStringExtra("modules");
        if(questionsSelected.equals("C346")){
            TvModCode.setText("Module Code: C346");
            TvModName.setText("Module Name: Android Programming ");
            TvAcaYear.setText("Academic Year: 2023");
            TvSem.setText("Semester: 1");
            TvModCredit.setText("Module Credit: 4");
            TvVenue.setText("Venue: E63A");
        } else if(questionsSelected.equals("C203")){
            TvModCode.setText("Module Code: C203");
            TvModName.setText("Module Name: Web Appln Development in php ");
            TvAcaYear.setText("Academic Year: 2023");
            TvSem.setText("Semester: 1");
            TvModCredit.setText("Module Credit: 4");
            TvVenue.setText("Venue: W64P");
        } else if(questionsSelected.equals("C206")){
        TvModCode.setText("Module Code: C206");
        TvModName.setText("Module Name: Software Development Process");
        TvAcaYear.setText("Academic Year: 2023");
        TvSem.setText("Semester: 1");
        TvModCredit.setText("Module Credit: 4");
        TvVenue.setText("Venue: W64P");
    }else if(questionsSelected.equals("C218")){
            TvModCode.setText("Module Code: C218");
            TvModName.setText("Module Name: UI/UX Design For Apps");
            TvAcaYear.setText("Academic Year: 2023");
            TvSem.setText("Semester: 1");
            TvModCredit.setText("Module Credit: 4");
            TvVenue.setText("Venue: W64P");
        }else if(questionsSelected.equals("C235")){
            TvModCode.setText("Module Code: C235");
            TvModName.setText("Module Name: IT Security And Management");
            TvAcaYear.setText("Academic Year: 2023");
            TvSem.setText("Semester: 1");
            TvModCredit.setText("Module Credit: 4");
            TvVenue.setText("Venue: W64P");
        }
        btnRTM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(ModuleDetailActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}