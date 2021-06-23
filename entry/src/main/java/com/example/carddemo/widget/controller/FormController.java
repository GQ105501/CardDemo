package com.example.carddemo.widget.controller;

import ohos.aafwk.ability.AbilitySlice;
import ohos.aafwk.ability.ProviderFormInfo;
import ohos.aafwk.content.Intent;
import ohos.app.Context;

public abstract class FormController {

    protected final Context context;


    protected final String formName;


    protected final int dimension;

    public FormController(Context context, String formName, Integer dimension) {
        this.context = context;
        this.formName = formName;
        this.dimension = dimension;
    }

    /**
     * 创建卡片信息提供者
     */
    public abstract ProviderFormInfo bindFormData();

    /**
     * 更新卡片信息
     */
    public abstract void updateFormData(long formId, Object... vars);

    /**
     * 在接收服务小部件消息事件时调用
     */
    public abstract void onTriggerFormEvent(long formId, String message);

    /**
     * 获取路由的目标界面
     */
    public abstract Class<? extends AbilitySlice> getRoutePageSlice(Intent intent);
}

