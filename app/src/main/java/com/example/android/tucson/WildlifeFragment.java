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
public class WildlifeFragment extends Fragment {


    public WildlifeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.topic_list, container, false);

        final ArrayList<Topic> topics = new ArrayList<Topic>();

        topics.add(new Topic(R.string.wildlife_saguaro, R.drawable.wildlife_saguaro, R.string.wildlife_saguaro_desc));
        topics.add(new Topic(R.string.wildlife_rattle_snake, R.drawable.wildlife_rattlesnake, R.string.wildlife_rattle_snake_desc));
        topics.add(new Topic(R.string.wildlife_mt_lion, R.drawable.wildlife_mtlion, R.string.wildlife_mt_lion_desc));

        TopicAdapter adapter = new TopicAdapter(getActivity(), topics);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }

}
