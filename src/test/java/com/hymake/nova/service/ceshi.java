package com.hymake.nova.service;

import com.hymake.nova.page.CommonPage;
import com.hymake.nova.page.DangerSourcePage;
import com.hymake.nova.page.SafetyPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.math.BigDecimal;
import java.text.DecimalFormat;
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
            CommonMethodService.listData(CommonPage.TR,0);
            CommonMethodService.listData(CommonPage.BUTTON,2);
            //CommonMethodService.listData(CommonPage.PROMPT,1);
            CommonMethod.sleep(2000);
            String textBox=driver.findElement(CommonPage.BOX).getText();
            if(textBox.equals("您确定要删除吗？")){
                CommonMethodService.listData(CommonPage.PROMPT,1);
                CommonMethod.sleep(2000);
                int last =DangerSourceService.count(SafetyPage.DATA);
                Assert.assertEquals(last,t-1);

            }else{
                CommonMethodService.listData(CommonPage.PROMPT,1);
                int total =DangerSourceService.count(SafetyPage.DATA);
                Assert.assertEquals(total,t);
            }

        }else {

            System.out.println("没有数据可删除");
        }
    }
    public static double avgMonkey(){
        String[] array = {"14","16","11", "8"};
        double prices=3.00;
        double total=46.00;
        double avg=prices/total;
        for(int i=0;i<array.length;i++){
            double one=Double.parseDouble(array[i])-Double.parseDouble(array[i])*avg;
            System.out.println("依次为："+one);

        }
        return  total;
    }
    public static void create(){
        CommonMethodService.listData(CommonPage.BUTTON,0);

    }
    public static void  data(int tr,int button,int prompt){
        int t =DangerSourceService.count(SafetyPage.DATA);
        if(t!=0){
            CommonMethodService.listData(CommonPage.TR,tr);
            CommonMethodService.listData(CommonPage.BUTTON,button);
            //CommonMethodService.listData(CommonPage.PROMPT,1);
            CommonMethod.sleep(2000);
            String textBox=driver.findElement(CommonPage.BOX).getText();
            if(textBox.equals("您确定要删除吗？")){
                CommonMethodService.listData(CommonPage.PROMPT,prompt);
                CommonMethod.sleep(2000);
                int last =DangerSourceService.count(SafetyPage.DATA);
                Assert.assertEquals(last,t-1);

            }else{
                CommonMethodService.listData(CommonPage.PROMPT,prompt);
                int total =DangerSourceService.count(SafetyPage.DATA);
                Assert.assertEquals(total,t);
            }

        }else {

            System.out.println("没有数据可删除");
        }
    }
}
