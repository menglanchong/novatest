package com.hymake.nova.test;

import com.hymake.nova.page.QueryMaterialPage;
import com.hymake.nova.service.CommonMethodService;
import com.hymake.nova.service.CreateMaterialService;
import com.hymake.nova.service.SearchService;
import org.testng.annotations.Test;

import java.text.ParseException;

/**
 * Created by Administrator on 2017/12/14.
 */
public class CreateMaterialTest {
    @Test
    public static void createMaterial(){
        LoginTest.login();
        CreateMaterialService.createMaterial();
        /*try {
            CommonMethodService.lookUpSelectTime(QueryMaterialPage.ENTRYSTARTTIME,QueryMaterialPage.ENTRYENDTIME,
                    QueryMaterialPage.SEARCH,"2017-12-14","2017-12-18",4);
        } catch (ParseException e) {
            e.printStackTrace();
        }*/
    }

}
