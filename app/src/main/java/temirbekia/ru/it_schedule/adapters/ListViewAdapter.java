package temirbekia.ru.it_schedule.adapters;

import android.content.Context;
import android.media.Image;
import android.widget.BaseAdapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.List;

import temirbekia.ru.it_schedule.R;

import static android.R.id.list;


/**
 * Created by Kas on 18.10.2016.
 */

public class ListViewAdapter extends BaseAdapter {


    private List<ListViewModel> listGroup;

    private LayoutInflater layoutInflater;
    public ListViewAdapter (Context context, List<ListViewModel> listGroup) {
        this.listGroup = listGroup;
        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return listGroup.size();
    }

    @Override
    public Object getItem(int position) {
        return listGroup.get(position);
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
            view = layoutInflater.inflate(R.layout.listview_items, parent, false);
        }

        ListViewModel groupList = getListViewModel(position);

        // get Image of the group
        ImageView groupImage = (ImageView) view.findViewById(R.id.list_image);
        groupImage.setImageResource(groupList.getIdImage());


        // get name of the Group
        TextView groupName = (TextView) view.findViewById(R.id.list_name);
        groupName.setText(groupList.getGroupName());

        // get name of the stream
        TextView streamName = (TextView) view.findViewById(R.id.list_sub);
        streamName.setText(groupList.getGroupStream());

        return view;
    }

    // reurn num of group list
    private ListViewModel getListViewModel(int position)
    {
        return (ListViewModel) getItem(position);
    }
}
