package com.hymake.nova.test;

import com.hymake.nova.page.CreatDangerSourcePage;
import com.hymake.nova.page.DangerSourcePage;
import com.hymake.nova.page.IsDangerSourcePage;
import com.hymake.nova.service.*;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.text.ParseException;

/**
 * Created by Administrator on 2017/10/23.
 */
public class QueryDangerSourceTest {
    @BeforeMethod
    public static void before(){
        LoginTest.login();
    }


    @Test
    public static void inDangerSource(){

        DangerSourceService.clickInDangerSource();

        QueryService.lookUpText(DangerSourcePage.PROJECTLEADER, DangerSourcePage.INQUERYBOX,"fds",5);
    }


    @Test
    public static void timeTest(){

        DangerSourceService.clickAllDangerSource();
        try {
            QueryService.lookUpSelectTime(IsDangerSourcePage.DIGPLANTIME, IsDangerSourcePage.DIGREALTIME, DangerSourcePage.HAVEPROJECT,
                    DangerSourcePage.HAVEQUERYBOX,"2017-11-06","2017-11-08",7);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
    @Test
    public static void queryProjectListTest(){

        DangerSourceService.clickDangerSource();
        QueryService.lookUpText(DangerSourcePage.QUERYBOX, DangerSourcePage.PROJECTQUERY,"龙岩市",0);
    }

    @Test
    public static void alreadyProjectTest(){

        DangerSourceService.clickHaveDangerSource();
        QueryService.lookUpText(DangerSourcePage.HAVEPROJECT, DangerSourcePage.HAVEQUERYBOX,"第一医院",0);
    }
    @Test
    public static void lookChangeTest(){

        DangerSourceService.clickHaveDangerSource();
        QueryService.lookUpSelectText(DangerSourcePage.HAVECHANGE,"审核中", DangerSourcePage.HAVEQUERYBOX,9);
    }
    @Test
    public static void lookPersonTest(){

        DangerSourceService.clickHaveDangerSource();
        QueryService.lookUpText(DangerSourcePage.HAVEPROJECTLEADER, DangerSourcePage.HAVEQUERYBOX,"2",6);
    }
    @Test
    public static void lookDangerTest(){

        DangerSourceService.clickHaveDangerSource();
        QueryService.lookUpSelectText(DangerSourcePage.HAVEDANGER,"危险性较大", DangerSourcePage.HAVEQUERYBOX,3);
    }
    @Test
    public static void lookDangerSourceTest(){

        DangerSourceService.clickHaveDangerSource();
        QueryService.lookUpSelectText(DangerSourcePage.HAVEDANGERSOURCE,"爆破工程", DangerSourcePage.HAVEQUERYBOX,2);
    }
    @Test
    public static void timeAllTest(){

        DangerSourceService.clickAllDangerSource();
        try {
            QueryService.lookUpSelectTime(DangerSourcePage.ALLSTARTTIME, DangerSourcePage.ALLSTARTIME2, DangerSourcePage.ALLPROJECTNAME,
                    DangerSourcePage.ALLQUERYBOX,"2017-11-06","2017-11-08",7);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
    @Test
    public static void lookAllProjectTest(){

        DangerSourceService.clickAllDangerSource();
        QueryService.lookUpText(DangerSourcePage.ALLPROJECTNAME, DangerSourcePage.ALLQUERYBOX,"龙岩市",0);
    }
    @Test
    public static void lookAllChangeTest(){

        DangerSourceService.clickAllDangerSource();
        QueryService.lookUpSelectText(DangerSourcePage.ALLCHANGE,"审核中", DangerSourcePage.ALLQUERYBOX,9);
    }
    @Test
    public static void lookAllPersonTest(){

        DangerSourceService.clickAllDangerSource();
        QueryService.lookUpText(DangerSourcePage.ALLPROJECTLEADER, DangerSourcePage.ALLQUERYBOX,"美丽",6);
    }
    @Test
    public static void lookAllDangerTest(){

        DangerSourceService.clickAllDangerSource();
        QueryService.lookUpSelectText(DangerSourcePage.ALLDANGER, "危险性较大",DangerSourcePage.ALLQUERYBOX,3);
    }
    @Test
    public static void lookAllDangerSourceTest(){

        DangerSourceService.clickAllDangerSource();
        QueryService.lookUpSelectText(DangerSourcePage.ALLDANGERSOURCE,"爆破工程", DangerSourcePage.ALLQUERYBOX,2);
    }
}
