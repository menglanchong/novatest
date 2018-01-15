package com.hymake.nova.service;

import com.hymake.nova.page.CreatMaterialReviewPage;
import com.hymake.nova.page.QueryMaterialPage;

/**
 * Created by Administrator on 2017/12/21.
 */
public class DeleteService extends CommonMethod{
    public static void deleteService(){
        SearchService.menuService();
        CommonMethod.sleep(2000);
        driver.findElement(QueryMaterialPage.FIRSTTR).click();
        driver.findElement(QueryMaterialPage.DELETE).click();
        CommonMethod.sleep(2000);
        driver.findElement(CreatMaterialReviewPage.QD).click();

    }
}
