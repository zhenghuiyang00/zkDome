package com.bawei.zkDome.api;

import com.bawei.zkDome.entity.RegisterEntity;

import io.reactivex.Observable;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface RegisterService {


    @POST("small/user/v1/register")
    @FormUrlEncoded
    Observable<RegisterEntity> getRegister(@Field("phone") String phone, @Field("pwd") String pwd);

}
