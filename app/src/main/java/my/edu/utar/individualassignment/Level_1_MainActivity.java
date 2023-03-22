package my.edu.utar.individualassignment;

import static java.lang.System.exit;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Color;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;

public class Level_1_MainActivity extends AppCompatActivity {
    private Button box1, box2, box3, box4;
    private TextView messageText, scoreText;
    private int highlightedBoxId, score;
    private CountDownTimer timer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.level_1);

        // Get references to the views
        box1 = findViewById(R.id.box1);
        box2 = findViewById(R.id.box2);
        box3 = findViewById(R.id.box3);
        box4 = findViewById(R.id.box4);
        messageText = findViewById(R.id.message_text);
        scoreText = findViewById(R.id.score_text);


        // Set up click listeners for the boxes
        box1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkBoxPress(view);
            }
        });

        box2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkBoxPress(view);
            }
        });

        box3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkBoxPress(view);
            }
        });

        box4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkBoxPress(view);
            }
        });

        scoreText.setText("Score: " + score);
        startTimer();
        // Generate a random box to highlight
        highlightRandomBox();
    }

    /**
     * Starts the timer for highlighting a random box.
     */
    private void startTimer() {

        // Start the timer for 5 seconds
        timer = new CountDownTimer(5000, 1000) {
            public void onTick(long millisUntilFinished) {}

            public void onFinish() {
                // Stop the timer and prompt the user to continue or exit
                stopTimer();
                promptContinueOrExit();
            }
        }.start();
    }


    private void promptContinueOrExit(){
        // Prompt user to continue or exit
        AlertDialog.Builder builder = new AlertDialog.Builder(Level_1_MainActivity.this);
        builder.setTitle("Game Over");
        builder.setMessage("Time's up! Your score is " + score + ". Do you want to play again?");
        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
            //bring to next level, bring over the score as well
                Intent i = new Intent(Level_1_MainActivity.this,Level_2_MainActivity.class);
                i.putExtra("Indicator", score);
                startActivity(i);
            }
        });
        builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                //Let the user to key in name in the leaderboard
                Intent i = new Intent(Level_1_MainActivity.this,InputName.class);
                i.putExtra("Level", 1);
                i.putExtra("score_level5", score);
                startActivity(i);
                finish();

                }
        });
       builder.show();
    }


    /**
     * Restarts the timer for highlighting a random box.
     */
    private void restartTimer() {
        // Cancel the current timer
        timer.cancel();

        // Start a new timer
        startTimer();
    }

    /**
     * Stops the timer for highlighting a random box.
     */
    private void stopTimer() {
        timer.cancel();
    }
    /**
     * Handles a box press event.
     */
    private void checkBoxPress(View view) {
        if (view.getId() == highlightedBoxId) {
            // If the highlighted box was pressed, increment the score
            score++;
            scoreText.setText("Score: " + score);
        }

        // Highlight a new random box
        highlightRandomBox();
    }



    /**
     * Highlights a random box with a yellow background color.
     */
    private void highlightRandomBox() {
        // Reset the background colors of all the boxes
        box1.setBackgroundColor(Color.BLUE);
        box2.setBackgroundColor(Color.BLUE);
        box3.setBackgroundColor(Color.BLUE);
        box4.setBackgroundColor(Color.BLUE);

        // Generate a random box to highlight
        Random random = new Random();
        int highlightedBox = random.nextInt(4) + 1;

        // Highlight the box with a yellow background color
        highlightedBoxId = getResources().getIdentifier("box" + highlightedBox, "id", getPackageName());
        findViewById(highlightedBoxId).setBackgroundColor(Color.YELLOW);
    }


}