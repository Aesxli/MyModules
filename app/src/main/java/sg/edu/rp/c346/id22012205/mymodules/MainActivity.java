package sg.edu.rp.c346.id22012205.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
TextView TvC346;
TextView TvC203;
TextView TvC206;
TextView TvC218;
TextView TvC235;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TvC346=findViewById(R.id.textViewC346);
        TvC203=findViewById(R.id.textViewC203);
        TvC206=findViewById(R.id.textViewC206);
        TvC218=findViewById(R.id.textViewC218);
        TvC235=findViewById(R.id.textViewC235);

        TvC346.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("modules","C346");
                startActivity(intent);
            }
        });
        TvC203.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2=new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent2.putExtra("modules","C203");
                startActivity(intent2);
            }
        });
        TvC206.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3=new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent3.putExtra("modules","C206");
                startActivity(intent3);
            }
        });
        TvC218.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent4=new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent4.putExtra("modules","C218");
                startActivity(intent4);
            }
        });
        TvC235.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent5=new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent5.putExtra("modules","C235");
                startActivity(intent5);
            }
        });
    }
}