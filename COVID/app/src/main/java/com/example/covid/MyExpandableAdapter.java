package com.example.covid;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;

import java.util.List;
import java.util.Map;

public class MyExpandableAdapter extends BaseExpandableListAdapter {

    Context context;
    List<String> question;
    Map<String,List<String>> anser;

    public MyExpandableAdapter(Context context, List<String> question, Map<String, List<String>> anser) {
        this.context = context;
        this.question = question;
        this.anser = anser;
    }


    @Override
    public int getGroupCount() {
        return question.size();
    }

    @Override
    public int getChildrenCount(int groupPosition) {
        return anser.get(question.get(groupPosition)).size();
    }

    @Override
    public Object getGroup(int groupPosition) {
        return question.get(groupPosition);
    }

    @Override
    public Object getChild(int groupPosition, int childPosition) {
        return anser.get(question.get(groupPosition)).get(childPosition);
    }

    @Override
    public long getGroupId(int groupPosition) {
        return groupPosition;
    }

    @Override
    public long getChildId(int groupPosition, int childPosition) {
        return childPosition;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public View getGroupView(int groupPosition, boolean isExpanded, View view, ViewGroup parent) {
        String lang = (String)getGroup(groupPosition);
        if (view == null){
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.question_list,null);
        }
        TextView txtquestion = view.findViewById(R.id.questionlist);
        txtquestion.setText(lang);
        return view;
    }

    @Override
    public View getChildView(int groupPosition, int childPosition, boolean isLastChild, View view, ViewGroup parent) {
        String topic = (String)getChild(groupPosition,childPosition);
        if (view == null){
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.anser_list,null);
        }
        TextView txtanser = view.findViewById(R.id.anserlist);
        txtanser.setText(topic);
        return view;
    }

    @Override
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return true;
    }
}
