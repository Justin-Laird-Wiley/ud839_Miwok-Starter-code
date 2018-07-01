package com.example.android.miwok;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    private MediaPlayer mMediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        final ArrayList<Word> numberWords = new ArrayList<Word>();

        numberWords.add(new Word("one", "lutti", R.drawable.number_one, R.raw.number_one));
        numberWords.add(new Word("two", "otiiko", R.drawable.number_two, R.raw.number_two));
        numberWords.add(new Word("three", "tolookosu", R.drawable.number_three, R.raw.number_three));
        numberWords.add(new Word("four", "oyyisa", R.drawable.number_four, R.raw.number_four));
        numberWords.add(new Word("five", "massokka", R.drawable.number_five, R.raw.number_five));
        numberWords.add(new Word("six", "temmokka", R.drawable.number_six, R.raw.number_six));
        numberWords.add(new Word("seven", "kenekaku", R.drawable.number_seven, R.raw.number_seven));
        numberWords.add(new Word("eight", "kawinta", R.drawable.number_eight, R.raw.number_eight));
        numberWords.add(new Word("nine", "wo’e", R.drawable.number_nine, R.raw.number_nine));
        numberWords.add(new Word("ten", "na’aacha", R.drawable.number_ten, R.raw.number_ten));

        WordAdapter wordAdapter = new WordAdapter(this, numberWords, R.color.category_numbers);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(wordAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                mMediaPlayer = MediaPlayer.create(NumbersActivity.this, numberWords.get(position).getAudioResourceId());
                mMediaPlayer.start();
            }
        });


    }
}
