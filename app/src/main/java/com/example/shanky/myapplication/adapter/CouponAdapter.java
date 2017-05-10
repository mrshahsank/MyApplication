package com.example.shanky.myapplication.adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.shanky.myapplication.R;
import com.example.shanky.myapplication.model.Coupon;

import java.util.ArrayList;

/**
 * Created by shanky on 10/5/17.
 */


/**
 * ContactsAdapter
 * Created by shanky on 21/10/16.
 */

public class CouponAdapter extends RecyclerView.Adapter<CouponAdapter.ViewHolder> {
    private Context context;
    private ArrayList<Coupon> coupons;

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public LinearLayout section;
        public TextView sectionName;
        public ImageView brandImg;
        public TextView brandName;
        public TextView brandDesc;

        public ViewHolder(View v) {
            super(v);
            section = (LinearLayout) v.findViewById(R.id.section);
            sectionName = (TextView) v.findViewById(R.id.sectionName);
            brandImg = (ImageView) v.findViewById(R.id.brandImg);
            brandName = (TextView) v.findViewById(R.id.brandName);
            brandDesc = (TextView) v.findViewById(R.id.brandDesc);
        }

    }

    // Provide a suitable constructor (depends on the kind of dataset)
    public CouponAdapter(Context context, ArrayList<Coupon> coupons) {
        this.context = context;
        this.coupons = coupons;
    }


    // Create new views (invoked by the layout manager)
    @Override
    public CouponAdapter.ViewHolder onCreateViewHolder(ViewGroup parent,
                                                       int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.coupon_item_layout, parent, false);
        return new ViewHolder(v);
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(final ViewHolder holder, @SuppressLint("RecyclerView") final int position) {
        Coupon coupon = coupons.get(position);
        if (coupon.FLAG) {
            holder.section.setVisibility(View.VISIBLE);
            holder.sectionName.setText(coupon.DATE);
            holder.brandName.setText(coupon.BRAND_NAME);
            holder.brandDesc.setText(coupon.COUPON_CODE);
        } else {
            holder.section.setVisibility(View.GONE);
            holder.brandName.setText(coupon.BRAND_NAME);
            holder.brandDesc.setText(coupon.COUPON_CODE);
        }
    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return coupons.size();
    }
}

