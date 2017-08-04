package com.example.liuyueyue.baseadapter;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import static android.R.id.list;
import static android.R.id.title;

public class MyAdapter extends BaseAdapter {
    private List<ItemBean> mList;
    private LayoutInflater mInflater;

    public MyAdapter(Context context, List<ItemBean> list) {
        mList = list;
        mInflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return mList.size();
    }

    @Override
    public Object getItem(int position) {
        return mList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //逗比式，效率低下》》》》》
       /* View view = mInflater.inflate(R.layout.item,null );
        ImageView imageView = (ImageView) view.findViewById(R.id.iv_image);
        TextView title = (TextView) view.findViewById(R.id.tv_title);
        TextView content = (TextView) view.findViewById(R.id.tv_content);
        ItemBean bean = mList.get(position);
        imageView.setImageResource(bean.ItemImageResid);
        title.setText(bean.ItemTitle);
        content.setText(bean.ItemContent);
        return view;*/
        //逗比式，效率低下》》》》》

        //普通式》》》》》》
        /*if(convertView == null){
            convertView = mInflater.inflate(R.layout.item,null);
        }
        ImageView imageView = (ImageView) convertView.findViewById(R.id.iv_image);
        TextView title = (TextView) convertView.findViewById(R.id.tv_title);
        TextView content = (TextView) convertView.findViewById(R.id.tv_content);
        ItemBean bean = mList.get(position);
        imageView.setImageResource(bean.ItemImageResid);
        title.setText(bean.ItemTitle);
        content.setText(bean.ItemContent);
        return convertView;*/
        //普通式》》》》》》

        //文艺式》》》》》》
        //申明ViewHolder对象
        ViewHolder viewHolder;
        if(convertView == null){
            viewHolder = new ViewHolder();
            convertView = mInflater.inflate(R.layout.item,null);
            viewHolder.imageView =(ImageView) convertView.findViewById(R.id.iv_image);
            viewHolder.title=(TextView) convertView.findViewById(R.id.tv_title);
            viewHolder.content=(TextView) convertView.findViewById(R.id.tv_content);
            convertView.setTag(viewHolder);
        }else {
            viewHolder = (ViewHolder) convertView.getTag();
        }
        ItemBean bean = mList.get(position);
        viewHolder.imageView.setImageResource(bean.ItemImageResid);
        viewHolder.title.setText(bean.ItemTitle);
        viewHolder.content.setText(bean.ItemContent);
        return convertView;
    }
    //创建ViewHolder对象
    class ViewHolder{
        public ImageView imageView;
        public TextView title;
        public TextView content;
    }
      //文艺式》》》》》》
}
