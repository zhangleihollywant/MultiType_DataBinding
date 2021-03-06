package com.zoulux.multitype_databinding.sample.mvvm.vm;

import android.content.Context;
import android.databinding.Bindable;
import android.util.Log;

import com.zoulux.multitype_databinding.CommonObservable;
import com.zoulux.multitype_databinding.sample.BR;
import com.zoulux.multitype_databinding.sample.mvvm.m.Picture;


/**
 * <b>Project:</b> MultiType<br>
 * <b>Create Date:</b> 2017/2/7<br>
 * <b>Author:</b> zou<br>
 * <b>Description:</b> <br>
 */
public class PictureViewModule2 extends CommonObservable<Picture> {
    private static final String TAG = "PictureViewModule";
    private Picture picture;

    public PictureViewModule2(Context context) {
        super(context);
    }

    @Bindable
    public String getId() {
        return picture != null ? picture.id.concat("-->2") : "";
    }

    @Bindable
    public String getName() {
        return picture != null ? picture.name.concat("-->2") : "";
    }

    @Bindable
    public String getSize() {
        return picture != null ? picture.size.concat("-->2") : "";
    }


    public void onClickItem() {
        Log.d(TAG, "onClickItem2: " + picture);
    }

    @Override
    public void setData(Picture data) {
        this.picture = data;
        notifyPropertyChanged(BR.id);
        notifyPropertyChanged(BR.name);
        notifyPropertyChanged(BR.size);
    }

}
