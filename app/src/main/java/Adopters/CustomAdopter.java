package Adopters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.syedzainulhasan.quicknote.R;
import com.example.syedzainulhasan.quicknote.swipeLisner;

import java.util.List;

import Models.Note;

/**
 * Created by Syed Zain UL Hasan on 09/07/2016.
 */
public class CustomAdopter extends RecyclerView.Adapter<CustomViewHolder> implements swipeLisner {

    protected Context mContext;

    protected List<Note> notes;

    public CustomAdopter(Context context,List<Note> n)

    {
        mContext=context;
        notes=n;
    }
    @Override
    public CustomViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item,parent,false);
        CustomViewHolder holder=new CustomViewHolder(view);

        return holder;
    }

    @Override
    public void onBindViewHolder(CustomViewHolder holder, int position) {


        Note n=notes.get(position);
        holder.tv.setText(n.getTask());
    }

    @Override
    public int getItemCount() {
        return notes.size();
    }



    @Override
    public void OnSwipe(int pos) {


        Note n=notes.get(pos);

        notes.remove(pos);
        Note.deleteAll(Note.class, "task = ?",n.getTask() );
        notifyDataSetChanged();
    }
}
