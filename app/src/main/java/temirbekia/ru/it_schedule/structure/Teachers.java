package temirbekia.ru.it_schedule.structure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.SearchView;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.List;
import temirbekia.ru.it_schedule.R;
import temirbekia.ru.it_schedule.adapters.ListViewTeachersAdapter;
import temirbekia.ru.it_schedule.adapters.ListViewTeachersModel;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

/**
 * Created by Kas on 18.10.2016.
 */



public class Teachers extends AppCompatActivity {

    SearchView searchView;
    ListView teachers;
    ListViewTeachersAdapter lvAdapterTeach;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teachers);
        teachers = (ListView) findViewById(R.id.teacher_list);
        searchView = (SearchView) findViewById(R.id.search_bar_teacher);

        lvAdapterTeach = new ListViewTeachersAdapter(getApplicationContext(), initData());
        teachers.setAdapter(lvAdapterTeach);

        teachers.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position,
                                    long id) {
                Intent intent = new Intent(Teachers.this, ScheduleOne.class);
                String message = "ПЖ получись";
                intent.putExtra(EXTRA_MESSAGE, message);
                startActivity(intent);
            }
        });


        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                lvAdapterTeach.getFilter().filter(newText);
                return false;
            }
        });

        // searchView setup
        //setupSearchView();

    }


    /*
    private void setupSearchView()
    {
        searchView.setIconifiedByDefault(false);
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener()
        {
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                if (TextUtils.isEmpty(newText)) {
                    lvAdapterTeach.filter(null);
                    teachers.clearTextFilter();
                } else {
                    lvAdapterTeach.filter(newText);
                }
                return true;
            }
        });
        searchView.setSubmitButtonEnabled(false);
        searchView.setQueryHint("Search Here");
    }
    */



    /*

    @Override
    public boolean onQueryTextChange(String newText)
    {

        if (TextUtils.isEmpty(newText)) {
            searchView.clearTextFilter();
        } else {
            searchView.setFilterText(newText);
        }
        return true;
    }

    @Override
    public boolean onQueryTextSubmit(String query)
    {
        return false;
    }
    */


    private List<ListViewTeachersModel> initData()
    {

        List<ListViewTeachersModel> listTeacher = new ArrayList<ListViewTeachersModel>();

        listTeacher.add(new ListViewTeachersModel(1, R.drawable.circle1, "Aidos Utegulov", "IOS"));
        listTeacher.add(new ListViewTeachersModel(2, R.drawable.circle1, "Dayneko Evgenia", "Physics"));
        listTeacher.add(new ListViewTeachersModel(3, R.drawable.circle1, "Korzhumbaev Azamat Beysenbaevich", "Cisco, Web-technologies"));
        listTeacher.add(new ListViewTeachersModel(4, R.drawable.circle1, "Bayzhikenov Bakhytzhan Maratovich", "IOS-mobile development"));
        listTeacher.add(new ListViewTeachersModel(5, R.drawable.circle1, "Mukazhanov Nurlan Kakenovich", "Web-technologies"));
        listTeacher.add(new ListViewTeachersModel(6, R.drawable.circle1, "Sariev Kairat Aydarbekuly", "Physics, Digital Circuits"));
        listTeacher.add(new ListViewTeachersModel(7, R.drawable.circle1, "Sundetov Rustem Nurlanovich", "Computer Graphics"));

        return listTeacher;
    }



}
