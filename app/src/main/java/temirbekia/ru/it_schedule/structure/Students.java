package temirbekia.ru.it_schedule.structure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.List;
import temirbekia.ru.it_schedule.R;
import temirbekia.ru.it_schedule.adapters.ListViewAdapter;
import temirbekia.ru.it_schedule.adapters.ListViewModel;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

/**
 * Created by Kas on 18.10.2016.
 */



public class Students extends AppCompatActivity {



    ListView students;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_students);

        students = (ListView) findViewById(R.id.student_list);

        ListViewAdapter lvAdapterTeach = new ListViewAdapter(getApplicationContext(), initData());
        students.setAdapter(lvAdapterTeach);

        students.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position,
                                    long id) {
                Intent intent = new Intent(Students.this, Schedule.class);
                String message = "ПЖ получись";
                intent.putExtra(EXTRA_MESSAGE, message);
                startActivity(intent);
            }
        });

    }


    private List<ListViewModel> initData()
    {

        List<ListViewModel> listTeacher = new ArrayList<ListViewModel>();

            listTeacher.add(new ListViewModel(1, R.drawable.is, "IS-1501", "2-stream"));
            listTeacher.add(new ListViewModel(2, R.drawable.is, "IS-141", "2-stream"));
            listTeacher.add(new ListViewModel(3, R.drawable.is, "IS-143", "2-stream"));
            listTeacher.add(new ListViewModel(4, R.drawable.is, "IS-145", "2-stream"));
            listTeacher.add(new ListViewModel(5, R.drawable.is, "IS-1502", "2-stream"));
            listTeacher.add(new ListViewModel(6, R.drawable.is, "IS-144", "2-stream"));
            listTeacher.add(new ListViewModel(7, R.drawable.is, "IS-1503", "2-stream"));
            listTeacher.add(new ListViewModel(8, R.drawable.is, "IS-131", "2-stream"));
            listTeacher.add(new ListViewModel(9, R.drawable.is, "IS-132", "2-stream"));
            listTeacher.add(new ListViewModel(10, R.drawable.is, "IS-145", "2-stream"));

        return listTeacher;
    }



}
