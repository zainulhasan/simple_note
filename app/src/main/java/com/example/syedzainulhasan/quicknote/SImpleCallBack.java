package com.example.syedzainulhasan.quicknote;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.helper.ItemTouchHelper;

/**
 * Created by Syed Zain UL Hasan on 07/07/2016.
 */
public class SImpleCallBack extends ItemTouchHelper.Callback {

    private swipeLisner swipeLisner;
    public SImpleCallBack(swipeLisner swipeLisner)
    {
        this.swipeLisner=swipeLisner;

    }

    @Override
    public int getMovementFlags(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
        return makeMovementFlags(0,ItemTouchHelper.END);
    }


    @Override
    public boolean isLongPressDragEnabled() {
        return false;
    }

    @Override
    public boolean isItemViewSwipeEnabled() {
        return true;
    }

    @Override
    public boolean onMove(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder target) {
        return false;
    }

    @Override
    public void onSwiped(RecyclerView.ViewHolder viewHolder, int direction) {

        swipeLisner.OnSwipe(viewHolder.getAdapterPosition());
    }
}
