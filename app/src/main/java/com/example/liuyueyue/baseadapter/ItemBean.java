package com.example.liuyueyue.baseadapter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class ItemBean {
    public int ItemImageResid;
    public String ItemTitle;
    public String ItemContent;
//初始化属性
    public ItemBean(int itemImageResid,String itemTitle,String itemContent){
        ItemImageResid = itemImageResid;
        ItemTitle = itemTitle;
        ItemContent =itemContent;
    }

}
