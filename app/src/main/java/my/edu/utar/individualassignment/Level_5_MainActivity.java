package my.edu.utar.individualassignment;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;


public class Level_5_MainActivity extends Activity {
    private Button box1, box2, box3, box4, box5, box6, box7, box8, box9, box10, box11,
            box12, box13, box14, box15, box16,box17,box18,box19,box20,box21,box22,box23,
            box24,box25,box26,box27,box28,box29,box30,box31,box32,box33,box34,box35,box36;
    private TextView messageText, scoreText;
    private int highlightedBoxId, score;
    private CountDownTimer timer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.level_5);

        // Get references to the views
        box1 = findViewById(R.id.button1);
        box2 = findViewById(R.id.button2);
        box3 = findViewById(R.id.button3);
        box4 = findViewById(R.id.button4);
        box5 = findViewById(R.id.button5);
        box6 = findViewById(R.id.button6);
        box7 = findViewById(R.id.button7);
        box8 = findViewById(R.id.button8);
        box9 = findViewById(R.id.button9);
        box10 = findViewById(R.id.button10);
        box11 = findViewById(R.id.button11);
        box12 = findViewById(R.id.button12);
        box13 = findViewById(R.id.button13);
        box14 = findViewById(R.id.button14);
        box15 = findViewById(R.id.button15);
        box16 = findViewById(R.id.button16);
        box17 = findViewById(R.id.button17);
        box18 = findViewById(R.id.button18);
        box19 = findViewById(R.id.button19);
        box20 = findViewById(R.id.button20);
        box21 = findViewById(R.id.button21);
        box22 = findViewById(R.id.button22);
        box23 = findViewById(R.id.button23);
        box24 = findViewById(R.id.button24);
        box25 = findViewById(R.id.button25);
        box26 = findViewById(R.id.button26);
        box27 = findViewById(R.id.button27);
        box28 = findViewById(R.id.button28);
        box29 = findViewById(R.id.button29);
        box30 = findViewById(R.id.button30);
        box31 = findViewById(R.id.button31);
        box32 = findViewById(R.id.button32);
        box33 = findViewById(R.id.button33);
        box34 = findViewById(R.id.button34);
        box35 = findViewById(R.id.button35);
        box36 = findViewById(R.id.button36);

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

        box5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkBoxPress(view);
            }
        });

        box6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkBoxPress(view);
            }
        });

        box7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkBoxPress(view);
            }
        });

        box8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkBoxPress(view);
            }
        });

        box9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkBoxPress(view);
            }
        });

        box10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkBoxPress(view);
            }
        });

        box11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkBoxPress(view);
            }
        });

        box12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkBoxPress(view);
            }
        });

        box13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkBoxPress(view);
            }
        });

        box14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkBoxPress(view);
            }
        });

        box15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkBoxPress(view);
            }
        });

        box16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkBoxPress(view);
            }
        });

        box17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkBoxPress(view);
            }
        });
        box18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkBoxPress(view);
            }
        });
        box19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkBoxPress(view);
            }
        });
        box20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkBoxPress(view);
            }
        });
        box21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkBoxPress(view);
            }
        });

        box22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkBoxPress(view);
            }
        });

        box23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkBoxPress(view);
            }
        });

        box24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkBoxPress(view);
            }
        });

        box25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkBoxPress(view);
            }
        });
        box26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkBoxPress(view);
            }
        });

        box27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkBoxPress(view);
            }
        });

        box28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkBoxPress(view);
            }
        });

        box29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkBoxPress(view);
            }
        });

        box30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkBoxPress(view);
            }
        });
        box31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkBoxPress(view);
            }
        });

        box32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkBoxPress(view);
            }
        });

        box33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkBoxPress(view);
            }
        });

        box34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkBoxPress(view);
            }
        });

        box35.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkBoxPress(view);
            }
        });

        box36.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkBoxPress(view);
            }
        });
        score = getIntent().getIntExtra("Indicator",0);
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
        AlertDialog.Builder builder = new AlertDialog.Builder(Level_5_MainActivity.this);
        builder.setTitle("Game Over");
        builder.setMessage("Time's up! Your score is " + score + ". Do you want to play again?");
        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                //Let the user to key in name in the leaderboard
                Intent i = new Intent(Level_5_MainActivity.this,InputName.class);
                i.putExtra("Level", 5);
                i.putExtra("score_level5", score);
                startActivity(i);
                finish();
            }
        });
        builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                //Let the user to key in name in the leaderboard
                Intent i = new Intent(Level_5_MainActivity.this,InputName.class);
                i.putExtra("Level", 5);
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
        if (view.getId() == highlightedBoxId ) {
            score++;
            scoreText.setText("Score: " + score);
        }
        else{
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
        box5.setBackgroundColor(Color.BLUE);
        box6.setBackgroundColor(Color.BLUE);
        box7.setBackgroundColor(Color.BLUE);
        box8.setBackgroundColor(Color.BLUE);
        box9.setBackgroundColor(Color.BLUE);
        box10.setBackgroundColor(Color.BLUE);
        box11.setBackgroundColor(Color.BLUE);
        box12.setBackgroundColor(Color.BLUE);
        box13.setBackgroundColor(Color.BLUE);
        box14.setBackgroundColor(Color.BLUE);
        box15.setBackgroundColor(Color.BLUE);
        box16.setBackgroundColor(Color.BLUE);
        box17.setBackgroundColor(Color.BLUE);
        box18.setBackgroundColor(Color.BLUE);
        box19.setBackgroundColor(Color.BLUE);
        box20.setBackgroundColor(Color.BLUE);
        box21.setBackgroundColor(Color.BLUE);
        box22.setBackgroundColor(Color.BLUE);
        box23.setBackgroundColor(Color.BLUE);
        box24.setBackgroundColor(Color.BLUE);
        box25.setBackgroundColor(Color.BLUE);
        box26.setBackgroundColor(Color.BLUE);
        box27.setBackgroundColor(Color.BLUE);
        box28.setBackgroundColor(Color.BLUE);
        box29.setBackgroundColor(Color.BLUE);
        box30.setBackgroundColor(Color.BLUE);
        box31.setBackgroundColor(Color.BLUE);
        box32.setBackgroundColor(Color.BLUE);
        box33.setBackgroundColor(Color.BLUE);
        box34.setBackgroundColor(Color.BLUE);
        box35.setBackgroundColor(Color.BLUE);
        box36.setBackgroundColor(Color.BLUE);

        // Generate a random box to highlight
        Random random = new Random();
        int highlightedBox = random.nextInt(36) + 1;

        // Highlight the box with a yellow background color
        highlightedBoxId = getResources().getIdentifier("button" + highlightedBox, "id", getPackageName());
        findViewById(highlightedBoxId).setBackgroundColor(Color.YELLOW);
    }
}