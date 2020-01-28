package com.bawei.zkDome.model;


import android.annotation.SuppressLint;

import com.bawei.zkDome.api.ShopService;
import com.bawei.zkDome.contract.HomeContract;
import com.bawei.zkDome.entity.ShopEntity;
import com.bawei.zkDome.utils.RetrofitUtils;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;

public class HomeModel implements HomeContract.IModel {

    @SuppressLint("CheckResult")
    @Override
    public void getShop(String uid, String sid, IModelCallBack iModelCallBack) {

        RetrofitUtils.getInstance().createService(ShopService.class)
                .getShop("27800","157861713981527800")
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer<ShopEntity>() {
                    @Override
                    public void accept(ShopEntity shopEntity) throws Exception {
                        iModelCallBack.success(shopEntity);
                    }
                }, new Consumer<Throwable>() {
                    @Override
                    public void accept(Throwable throwable) throws Exception {

                    }
                });

    }
}
