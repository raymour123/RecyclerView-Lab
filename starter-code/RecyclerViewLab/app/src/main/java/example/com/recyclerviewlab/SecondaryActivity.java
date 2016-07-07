package example.com.recyclerviewlab;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class SecondaryActivity extends AppCompatActivity {
    RecyclerView mRecyclerView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondary);
        mRecyclerView2= (RecyclerView) findViewById(R.id.recycler_view2);

        mRecyclerView2.setHasFixedSize(true);

        RecyclerView.LayoutManager mLayoutManager2;
        mLayoutManager2 = new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);

        mRecyclerView2.setLayoutManager(mLayoutManager2);

        ArrayList<CustomObject2> customObjects2 = new ArrayList<>();
        customObjects2.add(new CustomObject2("Title 1", "Description 1", "FF0000", false));
        customObjects2.add(new CustomObject2("Title 2", "Description 2", "FF0000", false));
        customObjects2.add(new CustomObject2("Title 3", "Description 3", "FF0000", true));
        customObjects2.add(new CustomObject2("Title 4", "Description 4", "FF0000", false));
        customObjects2.add(new CustomObject2("Title 5", "Description 5", "FF0000", false));
        customObjects2.add(new CustomObject2("Title 6", "Description 6", "FF0000", false));
        customObjects2.add(new CustomObject2("Title 7", "Description 7", "FF0000", true));
        customObjects2.add(new CustomObject2("Title 8", "Description 8", "FF0000", false));
        customObjects2.add(new CustomObject2("Title 9", "Description 9", "FF0000", true));
        customObjects2.add(new CustomObject2("Title 10", "Description 10", "FF0000", false));

        CustomRecyclerViewAdapter2 adapter2 = new CustomRecyclerViewAdapter2(customObjects2);

        mRecyclerView2.setAdapter(adapter2);


    }
}
