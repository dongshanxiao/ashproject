package com.ash.ashfirst;

import android.app.Activity;
import android.app.admin.DevicePolicyManager;
import android.content.Context;
import android.content.Intent;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TableLayout;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import java.lang.reflect.Method;
import java.util.ArrayList;

/**
 * Created by liuwei on 17-3-10.
 */
public class HomePage extends FragmentActivity {

    private String SH = "http://hq.sinajs.cn/list=sh600621";
    private RequestQueue queue;


    private ViewPager viewPager;
    private Fragment home, analysis, details;
    private ArrayList<Fragment> fragmentList;

    private ArrayList<StockAsh> stockList;


    private ArrayList<StockAsh> stocks;
    private ListAdapter stockListAdapter;
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_page);

        init();

        queue = Volley.newRequestQueue(HomePage.this);
        stocks = new ArrayList<StockAsh>();

    }

    private void init(){

        fragmentList = new ArrayList<Fragment>();
        analysis = new Analysis();
        home = new Home();
        details = new Details();
        fragmentList.add(analysis);
        fragmentList.add(home);
        fragmentList.add(details);

        viewPager = (ViewPager)findViewById(R.id.viewpager);
        viewPager.setAdapter(new FragmentStatePagerAdapter(getSupportFragmentManager()) {
            @Override
            public Fragment getItem(int position) {
                return fragmentList.get(position);
            }

            @Override
            public int getCount() {
                return fragmentList.size();
            }

            @Override
            public void notifyDataSetChanged() {
                //在这里做下fragment的更新
                super.notifyDataSetChanged();
            }
        });

        viewPager.setCurrentItem(1);

    }

   /* private void updateDataFromSina(String urls){

        queue.cancelAll(HomePage.this);
        StringRequest strequest = new StringRequest(Request.Method.GET,
                urls, new Response.Listener<String>() {
            @Override
            public void onResponse(String s) {
                //tv.setText(s);
                stockAsh = new StockAsh(s);
                stocks.add(stockAsh);

            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError volleyError) {
                tv.setText("Error");
            }
        });
        queue.add(strequest);

        *//*String url = "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1488533051859&di=2cac4e623971dea762a40ea60aa9b404&imgtype=0&src=http%3A%2F%2Fe.hiphotos.baidu.com%2Fzhidao%2Fwh%253D450%252C600%2Fsign%3D37d28cfbfe1986184112e7807fdd0245%2Fd000baa1cd11728bc3d985b8cefcc3cec2fd2cb7.jpg";
        ImageRequest imageRequest = new ImageRequest(url,new Response.Listener<Bitmap>(){
            @Override
            public void onResponse(Bitmap response) {
                imageView.setImageBitmap(response);
            }
        },50,50,Bitmap.Config.RGB_565,new Response.ErrorListener(){
            @Override
            public void onErrorResponse(VolleyError error) {
                //imageView.setImageResource(R.drawable.default_image);
            }
        });
        queue.add(imageRequest);*//*

    }*/

}
