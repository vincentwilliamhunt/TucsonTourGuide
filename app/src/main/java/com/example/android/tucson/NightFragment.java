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
public class NightFragment extends Fragment {


    public NightFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.topic_list, container, false);

        final ArrayList<Topic> topics = new ArrayList<Topic>();

        topics.add(new Topic(R.string.night_downtown, R.drawable.night_downtown, R.string.night_downtown_desc));
        topics.add(new Topic(R.string.night_la_cocina, R.drawable.night_la_cocina, R.string.night_la_cocina_desc));
        topics.add(new Topic(R.string.night_the_loft, R.drawable.night_the_loft, R.string.night_the_loft_desc));

        TopicAdapter adapter = new TopicAdapter(getActivity(), topics);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }

}
