package example.com.recyclerviewlab;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView mRecyclerView;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mRecyclerView= (RecyclerView) findViewById(R.id.recycler_view1);

        mRecyclerView.setHasFixedSize(true);

        LinearLayoutManager mLinearLayoutManager =
                new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        mRecyclerView.setLayoutManager(mLinearLayoutManager);

        ArrayList<CustomObject1> customObjects1 = new ArrayList<>();
        customObjects1.add(new CustomObject1("Title 1", "Description 1", "#FF0000"));
        customObjects1.add(new CustomObject1("Title 2", "Description 2", "#FF0000"));
        customObjects1.add(new CustomObject1("Title 3", "Description 3", "#FF0000"));
        customObjects1.add(new CustomObject1("Title 4", "Description 4", "#FF0000"));
        customObjects1.add(new CustomObject1("Title 5", "Description 5", "#FF0000"));
        customObjects1.add(new CustomObject1("Title 6", "Description 6", "#FF0000"));
        customObjects1.add(new CustomObject1("Title 7", "Description 7", "#FF0000"));
        customObjects1.add(new CustomObject1("Title 8", "Description 8", "#FF0000"));
        customObjects1.add(new CustomObject1("Title 9", "Description 9", "#FF0000"));
        customObjects1.add(new CustomObject1("Title 10", "Description 10", "#FF0000"));

        CustomRecyclerViewAdapter1 adapter1 = new CustomRecyclerViewAdapter1(customObjects1);

        mRecyclerView.setAdapter(adapter1);

    }
}
