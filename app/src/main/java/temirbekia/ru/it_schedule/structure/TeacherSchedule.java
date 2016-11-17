package temirbekia.ru.it_schedule.structure;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import temirbekia.ru.it_schedule.R;
import temirbekia.ru.it_schedule.adapters.ScheduleAdapter;

/**
 * Created by Kas on 21.10.2016.
 */

//class of timetable teachers

public class TeacherSchedule extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.timetable_teachers);
    }

}
