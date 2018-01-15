package com.hymake.nova.test;

import com.hymake.nova.page.CreatDangerSourcePage;
import com.hymake.nova.page.DangerSourcePage;
import com.hymake.nova.service.AlterService;
import com.hymake.nova.service.ClearService;
import com.hymake.nova.service.DangerSourceService;
import com.hymake.nova.service.OtherService;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Created by Administrator on 2017/10/23.
 */
public class AlterDangerSourceTest {
    @BeforeMethod
    public static void before(){
        LoginTest.login();
    }
    @Test
    public static void alterDigTest(){

        DangerSourceService.clickInDangerSource();
        AlterService.clickAlterButton("地下暗挖工程",DangerSourcePage.INALTER);
        AlterService.alterProject(CreatDangerSourcePage.DIGPERSON,CreatDangerSourcePage.DIGLENGTH,"审美观","250",CreatDangerSourcePage.DIGSAVE );
    }
    @Test
    public static void alterHoleTest(){

        DangerSourceService.clickInDangerSource();
        AlterService.clickAlterButton("基坑工程",DangerSourcePage.INALTER);
        AlterService.alterProject(CreatDangerSourcePage.HOLEPERSON,CreatDangerSourcePage.BASENUM,"建筑","25",CreatDangerSourcePage.HOLESAVE );
    }
    @Test
    public static void alterTmpTest(){

        DangerSourceService.clickInDangerSource();
        AlterService.clickAlterButton("模板工程及支撑体系",DangerSourcePage.INALTER);
        AlterService.alterProject(CreatDangerSourcePage.TMPDANGER,CreatDangerSourcePage.TMPREALBEGDATE,"地板位置","2017-11-20" ,CreatDangerSourcePage.TMPSAVE);
    }
    @Test
    public static void alterScfTest(){

        DangerSourceService.clickInDangerSource();
        AlterService.clickAlterButton("脚手架工程",DangerSourcePage.INALTER);
        AlterService.alterProject(CreatDangerSourcePage.SCFFASTEXAMUNIT,CreatDangerSourcePage.SCFHEIGHT,"段减","940" ,CreatDangerSourcePage.SCFSAVE);
    }
    @Test
    public static void alterBlstTest(){

        DangerSourceService.clickInDangerSource();
        AlterService.clickAlterButton("爆破工程",DangerSourcePage.INALTER);
        AlterService.alterProject(CreatDangerSourcePage.BLSTPROJECTUNIT,CreatDangerSourcePage.BLSTRANGE,"万平米",
                "还记得分手借口两个极端方式" ,CreatDangerSourcePage.BLSTSAVE);
    }
    @AfterMethod
    public static void after(){
        OtherService.closeWindow();
    }



}
