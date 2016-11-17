package temirbekia.ru.it_schedule.structure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.RelativeLayout;


import temirbekia.ru.it_schedule.R;

public class ChooseActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {


        CardView teacherCard;
        RelativeLayout teacherClick;
        RelativeLayout studentClick;

        super.onCreate(savedInstanceState);
        //View v;
        setContentView(R.layout.activity_choose);
        //CardView card = v.findViewById(R.id.cardview_choose)

        teacherClick = (RelativeLayout) findViewById(R.id.teacherclick);
        studentClick = (RelativeLayout) findViewById(R.id.studentclick);


        // Change Activity to Teachers activity
        teacherClick.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View view)
            {
                Intent intent = new Intent(ChooseActivity.this, Students.class);
                startActivity(intent);
            }

        });


        // Change Activity to Students activity
        studentClick.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View view)
            {
                Intent intent = new Intent(ChooseActivity.this, Teachers.class);
                startActivity(intent);
            }
        });
    }

}
