package com.example.earthquake;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class EarthquakeAdapter extends ArrayAdapter<Earthquake> {
    public EarthquakeAdapter(Context context, List<Earthquake>earthquakes){
        super(context,0,earthquakes);
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.eathquake_list_item, parent, false);
        }
        Earthquake current = getItem(position);
        TextView magn=(TextView)listItemView.findViewById(R.id.magnitude);
        magn.setText(current.getmMagnitude());
        TextView location=(TextView)listItemView.findViewById(R.id.location);
        location.setText(current.getmLocation());
        TextView date=(TextView)listItemView.findViewById(R.id.date);
        date.setText(current.getmDate());
        return listItemView;
    }

}
