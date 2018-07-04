package com.example.android.tucson;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class TopicAdapter extends ArrayAdapter<Topic> {

    public TopicAdapter(Context context, ArrayList<Topic> words) {
        super(context, 0, words);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link Word} object located at this position in the list
        Topic currentTopic = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID miwok_text_view.
        TextView topicTextView = (TextView) listItemView.findViewById(R.id.topic_text);
        // Get the Miwok translation from the currentWord object and set this text on
        // the Miwok TextView.
        topicTextView.setText(currentTopic.getTopicResourceId());

        // Find the TextView in the list_item.xml layout with the ID default_text_view.
        TextView descTextView = (TextView) listItemView.findViewById(R.id.topic_desc);
        // Get the default translation from the currentWord object and set this text on
        // the default TextView.
        descTextView.setText(currentTopic.getDescResourceId());

        // Find the ImageView in the list_item.xml layout with the ID image.
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.topic_image);
        imageView.setImageResource(currentTopic.getImageResourceId());

        // Return the whole list item layout (containing 2 TextViews) so that it can be shown in
        // the ListView.
        return listItemView;
    }
}
