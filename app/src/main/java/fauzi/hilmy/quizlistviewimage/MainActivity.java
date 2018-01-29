package fauzi.hilmy.quizlistviewimage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.ArrayAdapter;
import android.widget.AdapterView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    String[] menuItem = {
            "Google Plus", "Gmail", "Instagram", "Line", "Linkedin", "Wordpress", "Github"
    };

    Integer[] menuImage = {
            R.drawable.plus, R.drawable.gmail, R.drawable.instagram, R.drawable.line, R.drawable.linkedin, R.drawable.wordpress, R.drawable.github
    };

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SosmedAdapter adapter = new SosmedAdapter(this, menuItem, menuImage);
        listView = (ListView)findViewById(R.id.listView);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(), "Yang di klik adalah posisi ke : " + i, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
