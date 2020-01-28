package com.bawei.zkDome.view.activity;

import com.bawei.zkDome.R;
import com.bawei.zkDome.base.BaseActivity;
import com.bawei.zkDome.contract.HomeContract;
import com.bawei.zkDome.presenter.HomePresenter;

public class shoppingCartActivity extends BaseActivity<HomePresenter> implements HomeContract.IView {


    @Override
    protected void initData() {

    }

    @Override
    protected HomePresenter initPresenter() {
        return new HomePresenter();
    }

    @Override
    protected void initView() {

    }

    @Override
    protected int layoutId() {
        return R.layout.activity_shouye;
    }

    @Override
    public void success(Object data) {

    }

    @Override
    public void failure(Throwable throwable) {

    }
}
