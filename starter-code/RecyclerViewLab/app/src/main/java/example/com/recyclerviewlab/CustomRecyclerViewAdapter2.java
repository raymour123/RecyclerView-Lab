package example.com.recyclerviewlab;

import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.ArrayList;


/**
 * Created by raymour on 7/6/16.
 */
public class CustomRecyclerViewAdapter2 extends RecyclerView.Adapter<CustomViewHolder2>{

    ArrayList<CustomObject2> customObjectList2;

    public CustomRecyclerViewAdapter2(ArrayList<CustomObject2> customObjects2){

        customObjectList2 = customObjects2;
    }

    @Override
    public CustomViewHolder2 onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View parentView = inflater.inflate(R.layout.custom_view2, parent, false);

        CustomViewHolder2 viewHolder2 = new CustomViewHolder2(parentView);

        return viewHolder2;
    }

    @Override
    public void onBindViewHolder(final CustomViewHolder2 holder, final int position) {
        final CustomObject2 customObject2 = customObjectList2.get(position);
        holder.mTextView3.setText(customObject2.getTitle2());
        holder.mTextView4.setText(customObject2.getDescription2());
        holder.mView2.setBackgroundColor(Color.parseColor(customObject2.getColor2()));
        holder.mCheckBox.setChecked(customObject2.isCheckBox1());

        holder.mRelativeLayout2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (holder.mCheckBox.isChecked()) {
                    Toast.makeText(view.getContext(), "Check cleared from Box",
                            Toast.LENGTH_SHORT).show();
                    holder.mCheckBox.setChecked(false);
                    customObjectList2.get(position).setCheckBox1(false);
                }
                else {
                    Toast.makeText(view.getContext(), "Box Checked!",
                            Toast.LENGTH_SHORT).show();
                    holder.mCheckBox.setChecked(true);
                    customObjectList2.get(position).setCheckBox1(true);

                }
            }
        });

    }

    @Override
    public int getItemCount() {
        return customObjectList2.size();
    }
}
