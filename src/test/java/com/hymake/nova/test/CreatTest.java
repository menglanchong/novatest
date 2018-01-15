package com.hymake.nova.test;

import com.hymake.nova.service.LoginService;
import com.hymake.nova.service.TestService;
import org.testng.annotations.Test;

/**
 * Created by Administrator on 2017/12/6.
 */
public class CreatTest {
    @Test
    public static void  creatTest(){
        LoginService.create();
    }
    @Test
    public static void recursion(){
        TestService.Digui_Test1();
    }
}
