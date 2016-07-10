package Adopters;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.syedzainulhasan.quicknote.R;

/**
 * Created by Syed Zain UL Hasan on 09/07/2016.
 */
public class CustomViewHolder extends RecyclerView.ViewHolder {




    protected TextView tv;
    public CustomViewHolder(View itemView) {
        super(itemView);

        tv= (TextView) itemView.findViewById(R.id.textView);
    }
}
