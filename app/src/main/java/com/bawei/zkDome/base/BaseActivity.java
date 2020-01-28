package com.bawei.zkDome.base;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.bawei.zkDome.mvp.BasePresenter;
import com.bawei.zkDome.mvp.BaseView;

import butterknife.ButterKnife;
import butterknife.Unbinder;

public abstract class BaseActivity<P extends BasePresenter> extends AppCompatActivity implements BaseView {


    public P presenter;
    public Unbinder unbinder;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(layoutId());

        unbinder= ButterKnife.bind(this);

        presenter=initPresenter();
        if (presenter!=null){
            presenter.attch(this);
        }

        initView();

        initData();
    }

    protected abstract void initData();

    protected abstract P initPresenter();

    protected abstract void initView();

    protected abstract int layoutId();


    @Override
    protected void onDestroy() {
        super.onDestroy();

        if (unbinder!=null){
            unbinder.unbind();
        }

        if (presenter!=null){
            presenter.deatch();
        }
    }
}
