package temirbekia.ru.it_schedule.adapters;



import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.List;
import temirbekia.ru.it_schedule.R;


/**
 *
 * Created by Kas on 20.10.2016.
 */

public class ScheduleAdapter extends BaseAdapter {



    private List<ListViewScheduleModel> listSchedule;

    private LayoutInflater layoutInflater;
    public ScheduleAdapter (Context context, List<ListViewScheduleModel> listSchedule) {
        this.listSchedule = listSchedule;
        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return listSchedule.size();
    }

    @Override
    public Object getItem(int position) {
        return listSchedule.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    public View getView(int position, View convertView, ViewGroup parent)
    {
        View view = convertView;
        if (view == null)
        {
            view = layoutInflater.inflate(R.layout.listview_day, parent, false);
        }

        ListViewScheduleModel groupList = getListViewScheduleModel(position);

        // get Image of the group
        ImageView scheduleImage = (ImageView) view.findViewById(R.id.day_image);
        scheduleImage.setImageResource(groupList.getScheduleImage());


        // get name of the Group
        TextView nameDay = (TextView) view.findViewById(R.id.day_name);
        nameDay.setText(groupList.getDay());
        return view;
    }

    // reurn num of group list
    private ListViewScheduleModel getListViewScheduleModel(int position)
    {
        return (ListViewScheduleModel) getItem(position);
    }

}
