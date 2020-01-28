package com.bawei.zkDome.view.activity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.bawei.zkDome.R;
import com.bawei.zkDome.api.LoginService;
import com.bawei.zkDome.api.RegisterService;
import com.bawei.zkDome.base.BaseActivity;
import com.bawei.zkDome.entity.LoginEntity;
import com.bawei.zkDome.entity.RegisterEntity;
import com.bawei.zkDome.mvp.BasePresenter;
import com.bawei.zkDome.utils.RetrofitUtils;
import com.blankj.utilcode.util.EncryptUtils;


import butterknife.BindView;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;

public class MainActivity extends BaseActivity {


    @BindView(R.id.et_name)
    EditText etName;
    @BindView(R.id.et_pwd)
    EditText etPwd;
    @BindView(R.id.bt_login)
    Button btLogin;
    @BindView(R.id.bt_register)
    Button btRegister;

    @Override
    protected void initData() {
        btRegister.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("CheckResult")
            @Override
            public void onClick(View view) {

                if (etName.getText().toString().isEmpty()){
                    Toast.makeText(MainActivity.this, "账号不可以为空", Toast.LENGTH_SHORT).show();
                    return;
                }

                if (etPwd.getText().toString().isEmpty()){
                    Toast.makeText(MainActivity.this, "密码不可以为空", Toast.LENGTH_SHORT).show();
                    return;
                }

                String pwd= EncryptUtils.encryptMD5ToString(etPwd.getText().toString()).substring(0,8);
                System.out.println("xxx===="+pwd);
                RetrofitUtils.getInstance().createService(RegisterService.class)
                        .getRegister(etName.getText().toString(),pwd)
                        .subscribeOn(Schedulers.io())
                        .observeOn(AndroidSchedulers.mainThread())
                        .subscribe(new Consumer<RegisterEntity>() {
                            @Override
                            public void accept(RegisterEntity registerEntity) throws Exception {

                                Toast.makeText(MainActivity.this, ""+registerEntity.getMessage(), Toast.LENGTH_SHORT).show();
                            }
                        }, new Consumer<Throwable>() {
                            @Override
                            public void accept(Throwable throwable) throws Exception {
                                Toast.makeText(MainActivity.this, "注册失败", Toast.LENGTH_SHORT).show();
                            }
                        });

            }
        });


        btLogin.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("CheckResult")
            @Override
            public void onClick(View view) {

                String pwd= EncryptUtils.encryptMD5ToString(etPwd.getText().toString()).substring(0,8);

                System.out.println("xxx===="+pwd);
                RetrofitUtils.getInstance().createService(LoginService.class)
                        .getLogin(etName.getText().toString(),pwd)
                        .subscribeOn(Schedulers.io())
                        .observeOn(AndroidSchedulers.mainThread())
                        .subscribe(new Consumer<LoginEntity>() {
                            @Override
                            public void accept(LoginEntity loginEntity) throws Exception {
                                final Intent intent = new Intent(MainActivity.this, shoppingCartActivity.class);

                                startActivity(intent);
                            }
                        }, new Consumer<Throwable>() {
                            @Override
                            public void accept(Throwable throwable) throws Exception {
                                Toast.makeText(MainActivity.this, "登陆失败", Toast.LENGTH_SHORT).show();
                            }
                        });

            }
        });
    }

    @Override
    protected BasePresenter initPresenter() {
        return null;
    }

    @Override
    protected void initView() {

    }

    @Override
    protected int layoutId() {
        return R.layout.activity_main;
    }

}
