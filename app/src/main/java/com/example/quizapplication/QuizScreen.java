package com.example.quizapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
        import android.os.Bundle;
        import android.app.Activity;
        import android.view.Menu;
        import android.widget.ArrayAdapter;
        import android.widget.ListView;

public class QuizScreen extends Activity {
    // Array of strings...
    String[] mobileArray = {"What is the capital of Pakistan?","Who was the first female Prime Minister of Australia? ","What is the largest country in the world?","What is the longest river in the world? ","What is the smallest country in the world?","What are the five colours of the Olympic rings?", "How many Members of Parliament (MPs) are there?","What does CNN stand for? - ",
            };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayAdapter adapter = new ArrayAdapter<String>(this,
                R.layout.activity_quiz_screen, mobileArray);

        ListView listView = (ListView) findViewById(R.id.mobile_list);
        listView.setAdapter(adapter);
    }
}