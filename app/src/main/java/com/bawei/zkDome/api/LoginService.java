package com.bawei.zkDome.api;

import com.bawei.zkDome.entity.LoginEntity;

import io.reactivex.Observable;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface LoginService {


    @POST("small/user/v1/login")
    @FormUrlEncoded
    Observable<LoginEntity> getLogin(@Field("phone") String phone, @Field("pwd") String pwd);
}
