package com.example.carddemo.widget.cardwidget;

import com.example.carddemo.ResourceTable;
import com.example.carddemo.widget.controller.FormController;

import ohos.aafwk.ability.AbilitySlice;
import ohos.aafwk.ability.ProviderFormInfo;
import ohos.aafwk.content.Intent;
import ohos.app.Context;
import ohos.hiviewdfx.HiLog;
import ohos.hiviewdfx.HiLogLabel;

import java.util.HashMap;
import java.util.Map;


public class CardWidgetImpl extends FormController {
    public static final int DIMENSION_1X2 = 1;
    public static final int DIMENSION_2X4 = 3;
    private static final HiLogLabel TAG = new HiLogLabel(HiLog.DEBUG, 0x0, CardWidgetImpl.class.getName());
    private static final int DEFAULT_DIMENSION_2X2 = 2;
    private static final Map<Integer, Integer> RESOURCE_ID_MAP = new HashMap<>();

    static {
        RESOURCE_ID_MAP.put(DIMENSION_1X2, ResourceTable.Layout_form_grid_pattern_cardwidget_1_2);
        RESOURCE_ID_MAP.put(DEFAULT_DIMENSION_2X2, ResourceTable.Layout_form_grid_pattern_cardwidget_2_2);
        RESOURCE_ID_MAP.put(DIMENSION_2X4, ResourceTable.Layout_form_grid_pattern_cardwidget_2_4);
    }

    public CardWidgetImpl(Context context, String formName, Integer dimension) {
        super(context, formName, dimension);
    }

    //创建好卡片服务后，在界面展示卡片
    @Override
    public ProviderFormInfo bindFormData() {
        HiLog.info(TAG, "bind form data when create form");
        return new ProviderFormInfo(RESOURCE_ID_MAP.get(dimension), context);
    }

    //更新卡片信息
    @Override
    public void updateFormData(long formId, Object... vars) {
        HiLog.info(TAG, "update form data timing, default 30 minutes");
    }

    //卡片中内容手势触发方法
    @Override
    public void onTriggerFormEvent(long formId, String message) {
        HiLog.info(TAG, "handle card click event.");
    }

    @Override
    public Class<? extends AbilitySlice> getRoutePageSlice(Intent intent) {
        HiLog.info(TAG, "get the default page to route when you click card.");
        return null;
    }
}