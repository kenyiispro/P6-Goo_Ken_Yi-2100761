package my.edu.utar.individualassignment;

import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class InputName extends AppCompatActivity {

    private int level;
    private int score;
    private EditText usernameEditText;
    private DatabaseHelper databaseHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input_name);

        Intent intent = getIntent();
        level = intent.getIntExtra("Level", 0);
        score = intent.getIntExtra("score_level5", 0);


        TextView scoreTextView = findViewById(R.id.scoreTextView);
        scoreTextView.setText("Score: " + score);
        usernameEditText = findViewById(R.id.usernameEditText);
        Button submitButton = findViewById(R.id.submitButton);
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Get username and pass it back to MainActivity
                String username = usernameEditText.getText().toString();
                saveData(username, score);
                Intent intent = new Intent(InputName.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });


        databaseHelper = new DatabaseHelper(this);
    }

    private void saveData(String username, int score) {

        SQLiteDatabase db = databaseHelper.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put("username", username);
        values.put("score", score);
        db.insert("scores", null, values);
        db.close();

    }
}