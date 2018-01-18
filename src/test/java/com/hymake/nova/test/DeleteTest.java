package com.hymake.nova.test;

import com.hymake.nova.service.DeleteService;
import com.hymake.nova.service.LoginService;
import com.hymake.nova.service.TestService;
import com.hymake.nova.service.ceshi;
import org.testng.annotations.Test;

/**
 * Created by Administrator on 2017/12/6.
 */
public class DeleteTest {
    @Test
    public static void  creatTest(){
        LoginService.create();
    }
    @Test
    public static void recursion(){
        TestService.Digui_Test1();
    }
    @Test
    public static void delete(){
        LoginTest.login();
        DeleteService.deleteSafety();
    }
    @Test
    public static void price(){
        ceshi.avgMonkey();
    }
}
