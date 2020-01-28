package com.bawei.zkDome.api;

import com.bawei.zkDome.entity.ShopEntity;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ShopService {

    @GET("small/order/verify/v1/findShoppingCart")
    Observable<ShopEntity> getShop(@Query("userId") String uid, @Query("sessionId") String sid);
}
