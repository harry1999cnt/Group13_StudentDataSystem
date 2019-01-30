package e.sds.studentdatasystem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        Button scheduleBtn= (Button) findViewById(R.id.button_schedule);
        scheduleBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                Intent scheduleIntent= new Intent(getApplicationContext(),Schedule.class);

                startActivity(scheduleIntent);
            }
        });

        Button gradesBtn= (Button) findViewById(R.id.button_grades);
        gradesBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                Intent gradesIntent= new Intent(getApplicationContext(),Grades.class);

                startActivity(gradesIntent);
            }
        });

        Button attendanceBtn= (Button) findViewById(R.id.button_attendance);
        attendanceBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                Intent attendanceIntent= new Intent(getApplicationContext(),Attendance.class);

                startActivity(attendanceIntent);
            }
        });

        Button accommodationBtn= (Button) findViewById(R.id.button_accommodation);
        accommodationBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                Intent accommodationIntent= new Intent(getApplicationContext(),Accommodation.class);

                startActivity(accommodationIntent);
            }
        });
    }
}
