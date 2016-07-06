package example.com.recyclerviewlab;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class SecondaryActivity extends AppCompatActivity {
    RecyclerView mRecyclerView2;
    RecyclerView.Adapter mAdapter2;
    RecyclerView.LayoutManager mLayoutManager2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondary);

        mRecyclerView2= (RecyclerView) findViewById(R.id.recycler_view2);

        mRecyclerView2.setHasFixedSize(true);

        mLayoutManager2 = new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        mRecyclerView2.setLayoutManager(mLayoutManager2);
    }
}
