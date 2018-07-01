package com.example.android.miwok;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.support.annotation.ColorInt;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {

    private static final String LOG_TAG = WordAdapter.class.getSimpleName();

    private int mColor;

    public WordAdapter(Activity context, ArrayList<Word> words, int activityColor) {
        super(context, 0, words);
        mColor = activityColor;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;

        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent,
                    false);
        }

        Word currentWord = getItem(position);

        TextView miwokTranslation = (TextView) listItemView.findViewById(R.id.miwok_text_view);

        miwokTranslation.setText(currentWord.getMiwok());

        TextView defaultTranslation = (TextView) listItemView.findViewById(R.id.default_text_view);

        defaultTranslation.setText(currentWord.getDefault());

        ImageView image = (ImageView) listItemView.findViewById(R.id.word_image);

        if (currentWord.hasImage()) {
            image.setImageResource(currentWord.getImageResourceId());
            image.setVisibility(View.VISIBLE);

        } else {
            image.setVisibility(View.GONE);
        }

        View linearLayout = listItemView.findViewById(R.id.linear_layout);

        linearLayout.setBackgroundColor(listItemView.getResources().getColor(mColor));

        return listItemView;
    }
}


//        char firstLetterOfCategory = getContext().toString().charAt(getContext().toString().lastIndexOf("miwok") + 6);
//
//        switch(firstLetterOfCategory){
//            case 'P': linearLayout.setBackgroundColor(listItemView.getResources().getColor(R.color.category_phrases));
//            break;
//            case 'N': linearLayout.setBackgroundColor(listItemView.getResources().getColor(R.color.category_numbers));
//            break;
//            case 'C': linearLayout.setBackgroundColor(listItemView.getResources().getColor(R.color.category_colors));
//            break;
//            case 'F': linearLayout.setBackgroundColor(listItemView.getResources().getColor(R.color.category_family));
//            break;
//        }
//
//        int color = ContextCompat.getColor(getContext(), mColor);
//
//        linearLayout.setBackgroundColor(color);