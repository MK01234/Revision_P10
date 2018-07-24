package sg.edu.rp.c346.revision_p10;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by 17045740 on 24/7/2018.
 */

class CustomAdapter extends ArrayAdapter {


    Context parent_context;
    int layout_id;
    ArrayList<contactList> contactLists;


    public CustomAdapter(@NonNull Context context, int resource, @NonNull ArrayList<contactList> objects) {
        super(context, resource, objects);

        parent_context = context;
        layout_id = resource;
        contactLists = objects;
    }



    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater
                = (LayoutInflater) parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(layout_id, parent, false);
        TextView tvname = rowView.findViewById(R.id.textViewName);
        TextView tvname2 = rowView.findViewById(R.id.textViewTitle);
        TextView tvname3 = rowView.findViewById(R.id.textViewSalary);

        contactList currentItem = contactLists.get(position);
        int salary = currentItem.getNumber();
        tvname.setText(currentItem.getName());
        tvname2.setText(currentItem.getInfo());
        tvname3.setText(String.valueOf(salary));
        return rowView;
    }
}

