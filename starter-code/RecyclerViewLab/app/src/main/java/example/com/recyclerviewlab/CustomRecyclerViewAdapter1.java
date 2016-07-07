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
public class CustomRecyclerViewAdapter1 extends RecyclerView.Adapter<CustomViewHolder1> {

    ArrayList<CustomObject1> customObjectList1;

    public CustomRecyclerViewAdapter1(ArrayList<CustomObject1> customObjects1){
        customObjectList1 = customObjects1;
    }

    @Override
    public CustomViewHolder1 onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View parentView = inflater.inflate(R.layout.custom_view1, parent, false);

        CustomViewHolder1 viewHolder1 = new CustomViewHolder1(parentView);

        return viewHolder1;
    }

    @Override
    public void onBindViewHolder(CustomViewHolder1 holder, int position) {
        final CustomObject1 customObject1 = customObjectList1.get(position);
        holder.mTextView1.setText(customObject1.getTitle1());
        holder.mTextView2.setText(customObject1.getDescription1());
        holder.mView.setBackgroundColor(Color.parseColor(customObject1.getColor1()));

        holder.mRelativeLayout1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(), customObject1.getTitle1(), Toast.LENGTH_SHORT).show();

            }
        });
        {

        }




    }

    @Override
    public int getItemCount() {
        return customObjectList1.size();
    }
}
