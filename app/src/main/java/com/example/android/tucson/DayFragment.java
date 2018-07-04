package com.example.android.tucson;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class DayFragment extends Fragment {

    public DayFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.topic_list, container, false);

        final ArrayList<Topic> topics = new ArrayList<Topic>();

        topics.add(new Topic(R.string.day_mt_lemmon, R.drawable.day_mt_lemmon, R.string.day_mt_lemmon_desc));
        topics.add(new Topic(R.string.day_sabino_canyon, R.drawable.wildlife_sabino, R.string.day_sabino_canyon_desc));
        topics.add(new Topic(R.string.day_desert_museum, R.drawable.day_desert_museum, R.string.day_desert_museum_desc));

        TopicAdapter adapter = new TopicAdapter(getActivity(), topics);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }
}
