package example.com.recyclerviewlab;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by raymour on 7/6/16.
 */
public class CustomViewHolder1 extends RecyclerView.ViewHolder{

    TextView mTextView1;
    TextView mTextView2;
    TextView mTextView3;


    public CustomViewHolder1(View itemView) {
        super(itemView);

        mTextView1 = itemView.findViewById(R.id.textView1)
    }
}
