package com.bawei.zkDome.mvp;

import java.lang.ref.WeakReference;



public abstract class BasePresenter<M extends BaseModel,V extends BaseView> {

    public M model;
    public WeakReference<V> weakReference;

    public BasePresenter(){
        model=initModel();
    }

    public void attch(V v){
        weakReference=new WeakReference<>(v);
    }

    protected abstract M initModel();

    public void deatch(){
        if (weakReference!=null){
            weakReference.clear();
            weakReference=null;
        }
    }

    public V getView(){
        return weakReference.get();
    }
}
