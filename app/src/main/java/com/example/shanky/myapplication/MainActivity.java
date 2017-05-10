package com.example.shanky.myapplication;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.shanky.myapplication.adapter.CouponAdapter;
import com.example.shanky.myapplication.model.Coupon;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView couponRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        couponRecyclerView = (RecyclerView) findViewById(R.id.couponRecyclerView);
        couponRecyclerView.setHasFixedSize(true);
        RecyclerView.LayoutManager contactsLayoutManager = new LinearLayoutManager(MainActivity.this);
        couponRecyclerView.setLayoutManager(contactsLayoutManager);

        CouponAdapter couponAdapter = new CouponAdapter(MainActivity.this, getDummyData());
        couponRecyclerView.setAdapter(couponAdapter);
    }

    private ArrayList<Coupon> getDummyData() {
        ArrayList<Coupon> coupons = new ArrayList<>();

        Coupon coupon1 = new Coupon();
        coupon1.ID = 1;
        coupon1.BRAND_NAME = "A";
        coupon1.COUPON_CODE = "ABC";
        coupon1.EXP_DATE = "1/2/3";
        coupon1.DATE = "Today";
        coupon1.FLAG = true;

        Coupon coupon2 = new Coupon();
        coupon2.ID = 2;
        coupon2.BRAND_NAME = "B";
        coupon2.COUPON_CODE = "BCD";
        coupon2.EXP_DATE = "1/2/3";
        coupon2.DATE = "tommorow";
        coupon2.FLAG = true;

        Coupon coupon3 = new Coupon();
        coupon3.ID = 3;
        coupon3.BRAND_NAME = "C";
        coupon3.COUPON_CODE = "CDE";
        coupon3.EXP_DATE = "1/2/3";
        coupon3.DATE = "tommorow";

        Coupon coupon4 = new Coupon();
        coupon4.ID = 4;
        coupon4.BRAND_NAME = "D";
        coupon4.COUPON_CODE = "DEF";
        coupon4.EXP_DATE = "1/2/3";
        coupon4.DATE = "3rd,May";
        coupon4.FLAG = true;

        Coupon coupon5 = new Coupon();
        coupon5.ID = 5;
        coupon5.BRAND_NAME = "E";
        coupon5.COUPON_CODE = "EFG";
        coupon5.EXP_DATE = "1/2/3";
        coupon5.DATE = "3rd,May";

        Coupon coupon6 = new Coupon();
        coupon6.ID = 6;
        coupon6.BRAND_NAME = "F";
        coupon6.COUPON_CODE = "FGH";
        coupon6.EXP_DATE = "1/2/3";
        coupon6.DATE = "3rd,May";

        Coupon coupon7 = new Coupon();
        coupon7.ID = 7;
        coupon7.BRAND_NAME = "G";
        coupon7.COUPON_CODE = "GHI";
        coupon7.EXP_DATE = "1/2/3";
        coupon7.DATE = "4th,May";
        coupon7.FLAG = true;

        Coupon coupon8 = new Coupon();
        coupon8.ID = 8;
        coupon8.BRAND_NAME = "H";
        coupon8.COUPON_CODE = "HIJ";
        coupon8.EXP_DATE = "1/2/3";
        coupon8.DATE = "4th, May";

        coupons.add(coupon1);
        coupons.add(coupon2);
        coupons.add(coupon3);
        coupons.add(coupon4);
        coupons.add(coupon5);
        coupons.add(coupon6);
        coupons.add(coupon7);
        coupons.add(coupon8);

        return coupons;
    }
}
