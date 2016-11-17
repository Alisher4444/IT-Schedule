package temirbekia.ru.it_schedule.structure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import temirbekia.ru.it_schedule.R;
import temirbekia.ru.it_schedule.adapters.ListViewScheduleModel;
import temirbekia.ru.it_schedule.adapters.ScheduleAdapter;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

/**
 * Created by Kas on 20.10.2016.
 */

public class Schedule extends AppCompatActivity {




    ListView students;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_students_schedule);

        students = (ListView) findViewById(R.id.schedule_list_student);

        ScheduleAdapter schedule = new ScheduleAdapter(getApplicationContext(), initData());
        students.setAdapter(schedule);

        students.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position,
                                    long id) {
                Intent intent = new Intent(Schedule.this, StudentSchedule.class);
                String message = "ПЖ получись";
                intent.putExtra(EXTRA_MESSAGE, message);
                startActivity(intent);
            }
        });






    }


    private List<ListViewScheduleModel> initData()
    {

        List<ListViewScheduleModel> days = new ArrayList<ListViewScheduleModel>();

        days.add(new ListViewScheduleModel(1, R.drawable.m, "Monday"));
        days.add(new ListViewScheduleModel(1, R.drawable.t, "Tuesday"));
        days.add(new ListViewScheduleModel(1, R.drawable.w, "Wednesday"));
        days.add(new ListViewScheduleModel(1, R.drawable.t, "Thursday"));
        days.add(new ListViewScheduleModel(1, R.drawable.f, "Friday"));

        return days;
    }





}
