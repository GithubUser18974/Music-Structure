package com.example.mohamed_araby.mediaplayer;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by mohamed_araby on 2/7/18.
 */

public class CustomeAdapterForOneTextView extends ArrayAdapter<MainListData> {
    private final Context context;
    private final List<MainListData> values;

    public CustomeAdapterForOneTextView(Context context, List<MainListData> values) {
        super(context, -1, values);
        this.context = context;
        this.values = values;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listview = convertView;
        if (listview == null) {
            listview = LayoutInflater.from(getContext()).inflate(R.layout.list_photo_text, parent, false);

        }
        MainListData songData = getItem(position);
        TextView songNameTextView = (TextView) listview.findViewById(R.id.songname2);
        songNameTextView.setText(songData.getSongName());

        return listview;
    }
}