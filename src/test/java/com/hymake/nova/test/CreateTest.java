package com.hymake.nova.test;

import com.hymake.nova.page.SafetyPage;
import com.hymake.nova.service.ClearService;
import com.hymake.nova.service.CreateService;
import com.hymake.nova.service.DangerSourceService;
import com.hymake.nova.service.SafetyService;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Created by Administrator on 2017/10/23.
 */
public class CreateTest {
    @BeforeMethod
    public static void before(){
        LoginTest.login();
    }
    @Test
    public static void createTest(){

        DangerSourceService.clickDangerSource();
        DangerSourceService.clickProjectName();
        ClearService.createProject("fds","4545","43652","4556","2017-10-25");

    }
    @Test
    public static void createTest1(){

        DangerSourceService.clickDangerSource();
        DangerSourceService.clickProjectName();
        ClearService.createProject1("fds","4545","2017-10-25","4556");

    }
    @Test
    public static void createTest3(){

        DangerSourceService.clickDangerSource();
        DangerSourceService.clickProjectName();
        ClearService.createProject3("fds","4545","2017-10-25","4556","反对数据库");

    }
    @Test
    public static void createSafety(){
        SafetyService.commonMethod(SafetyPage.COMPANY,SafetyPage.ETPEVALUE);
        CreateService.creatFactory();
        CreateService.createSafetyMethod("\\json\\safety.json");
    }
}
