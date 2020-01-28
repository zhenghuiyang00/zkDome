package com.bawei.zkDome.presenter;

import com.bawei.zkDome.contract.HomeContract;
import com.bawei.zkDome.model.HomeModel;
import com.bawei.zkDome.mvp.BasePresenter;

public class HomePresenter extends BasePresenter<HomeModel, HomeContract.IView> implements HomeContract.Ipresenter {
    @Override
    public void getShop(String uid, String sid) {
        model.getShop(uid, sid, new HomeContract.IModel.IModelCallBack() {
            @Override
            public void success(Object data) {
                getView().success(data);
            }

            @Override
            public void failure(Throwable throwable) {
                getView().failure(throwable);
            }
        });
    }

    @Override
    protected HomeModel initModel() {
        return new HomeModel();
    }
}
