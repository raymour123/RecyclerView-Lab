package example.com.recyclerviewlab;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RelativeLayout;
import android.widget.TextView;

/**
 * Created by raymour on 7/6/16.
 */
public class CustomViewHolder2 extends RecyclerView.ViewHolder {

    TextView mTextView3;
    TextView mTextView4;
    View mView2;
    CheckBox mCheckBox;
    RelativeLayout mRelativeLayout2;


    public CustomViewHolder2(View itemView) {
        super(itemView);

        mTextView3 = (TextView) itemView.findViewById(R.id.textView3);
        mTextView4 = (TextView) itemView.findViewById(R.id.textView4);
        mView2 = itemView.findViewById(R.id.square2);
        mCheckBox = (CheckBox) itemView.findViewById(R.id.checkBox);
        mRelativeLayout2 = (RelativeLayout) itemView.findViewById(R.id.relativeLayout2);


    }
}
