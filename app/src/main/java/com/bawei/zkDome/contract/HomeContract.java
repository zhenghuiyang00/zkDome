package com.bawei.zkDome.contract;

import com.bawei.zkDome.mvp.BaseModel;
import com.bawei.zkDome.mvp.BaseView;

public interface HomeContract {


    interface IModel extends BaseModel {

        void getShop(String uid, String sid, IModelCallBack iModelCallBack);
        interface IModelCallBack{
            void success(Object data);
            void failure(Throwable throwable);
        }

    }

    interface IView extends BaseView {
        void success(Object data);
        void failure(Throwable throwable);
    }

    interface Ipresenter{

        void getShop(String uid, String sid);

    }
}
