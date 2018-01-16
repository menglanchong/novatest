package com.hymake.nova.service;

import com.hymake.nova.page.DangerSourcePage;
import com.hymake.nova.page.SafetyPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

/**
 * Created by Administrator on 2018/1/15.
 */
public class ceshi extends CommonMethod{
    public static String roleJudge(By a) {
        String role = driver.findElement(a).getText();//获取顶部的文字
        String ro =role.substring(0,4);
        return ro;
    }
    public static int count(By a){
        String total=driver.findElement(a).getText();//获取底部总条数文本
        total=total.replaceAll("共","").replaceAll("条","").trim();//获取中间条数， 文字替换成空格并去除空格+
        int t=Integer.parseInt(total);
        return t;
    }
    public static void  isData(){
        int t =DangerSourceService.count(SafetyPage.DATA);
        if(t!=0){
           List<WebElement> first= driver.findElements(By.className(""));
           first.get(0).click();
        }else {


        }
    }
}
