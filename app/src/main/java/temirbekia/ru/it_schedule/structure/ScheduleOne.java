package temirbekia.ru.it_schedule.structure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import temirbekia.ru.it_schedule.R;
import temirbekia.ru.it_schedule.adapters.ListViewScheduleModel;
import temirbekia.ru.it_schedule.adapters.ScheduleAdapter;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

/**
 * Created by Kas on 21.10.2016.
 */

public class ScheduleOne extends AppCompatActivity {



    ListView teachersTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teachers_schedule);

        teachersTime = (ListView) findViewById(R.id.schedule_list_teacher);

        ScheduleAdapter schedule = new ScheduleAdapter(getApplicationContext(), initData());
        teachersTime.setAdapter(schedule);

        teachersTime.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position,
                                    long id) {
                Intent intent = new Intent(ScheduleOne.this, TeacherSchedule.class);
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
