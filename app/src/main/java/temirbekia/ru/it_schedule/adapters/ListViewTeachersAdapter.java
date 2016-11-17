package temirbekia.ru.it_schedule.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import temirbekia.ru.it_schedule.R;

/**
 * Created by Kas on 20.10.2016.
 */

public class ListViewTeachersAdapter extends BaseAdapter implements Filterable{


    private List<ListViewTeachersModel> listTeacher;

    private LayoutInflater layoutInflater;
    private List<String> searchList;
    private List<String> getListTeacher;
    CustomFilter filter;
    List<ListViewTeachersModel> filterlist;

    public ListViewTeachersAdapter (Context context, List<ListViewTeachersModel> listTeacher) {
        this.listTeacher = listTeacher;

        this.searchList = new ArrayList<>();
       // this.searchList.addAll(listTeacher)
        this.filterlist = this.listTeacher;
        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return listTeacher.size();
    }

    @Override
    public Object getItem(int position) {
        return listTeacher.get(position);
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

        ListViewTeachersModel teacherList = getListViewModelTeacher(position);

        // get Image of the group
        ImageView teacherImage = (ImageView) view.findViewById(R.id.list_image);
        teacherImage.setImageResource(teacherList.getTeacherImage());

        TextView teacherName = (TextView) view.findViewById(R.id.list_name);
        teacherName.setText(teacherList.getTeacherName());

        // get name of the stream
        TextView subjectName = (TextView) view.findViewById(R.id.list_sub);
        subjectName.setText(teacherList.getSubject());




        return view;
    }
    /*
    public void filter(String charText) {
        charText = charText.toLowerCase(Locale.getDefault());
        .clear();
        if (charText.length() == 0) {
            friendList.addAll(searchList);
        } else {
            for (String s : searchList.) {
                if (s.toLowerCase(Locale.getDefault()).contains(charText)) {
                    friendList.add(s);
                }
            }
        }
        notifyDataSetChanged();
    }*/

    // reurn num of group list
    private ListViewTeachersModel getListViewModelTeacher(int position)
    {
        return (ListViewTeachersModel) getItem(position);
    }


    @Override
    public Filter getFilter() {

        if (filter == null)
        {
            filter = new CustomFilter();
        }
        return filter;
    }

    class CustomFilter extends Filter
    {

        FilterResults results;

        @Override
        protected FilterResults performFiltering(CharSequence constraint) {

             results = new FilterResults();

            if(constraint != null && constraint.length() > 0)
            {
                constraint = constraint.toString().toUpperCase();

                List<ListViewTeachersModel> filters =  new ArrayList<ListViewTeachersModel>();
                for (int i = 0; i< filterlist.size(); i++)
                {
                    if(filterlist.get(i).getTeacherName().toUpperCase().contains(constraint))
                    {
                        ListViewTeachersModel l = new ListViewTeachersModel(filterlist.get(i).getId(), filterlist.get(i).getTeacherImage(), filterlist.get(i).getTeacherName(), filterlist.get(i).getSubject());

                        filters.add(l);
                    }
                }
                results.count = filters.size();
                results.values = filters;
            }
            else
            {
                results.count = filterlist.size();
                results.values = filterlist;
            }

            return null;
        }

        @Override
        protected void publishResults(CharSequence constraint, FilterResults results1) {
            //this.results = results;
            listTeacher = (List<ListViewTeachersModel>) results.values;
            notifyDataSetChanged();

        }
    }

}
