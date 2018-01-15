package com.hymake.nova.test;

import com.hymake.nova.service.CheckService;
import com.hymake.nova.service.DangerSourceService;
import com.hymake.nova.service.OtherService;
import org.testng.annotations.*;

/**
 * Created by Administrator on 2017/11/9.
 */
public class CheckTest {
    @BeforeMethod
    public static void before(){
        LoginTest.login();
        DangerSourceService.dangerSourceToProject();

    }
    @Test
    public static void hole(){

        CheckService.holeCheck();

    }
    @Test
    public static void tmp(){

        CheckService.tmpCheck();

    }
    @Test
    public static void scf(){

        CheckService.scfCheck();

    }
    @Test
    public static void blst(){

        CheckService.blstCheck();

    }
    @Test
    public static void dig(){

        CheckService.digCheck();

    }
   /* @AfterMethod
    public static void after(){
        OtherService.closeWindow();
    }
*/

}
