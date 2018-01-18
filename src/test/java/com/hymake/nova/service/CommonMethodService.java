package com.hymake.nova.service;

import com.hymake.nova.page.CreatMaterialReviewPage;
import com.hymake.nova.page.DangerSourcePage;
import com.hymake.nova.page.QueryMaterialPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Created by Administrator on 2017/12/20.
 */
public class CommonMethodService extends CommonMethod{
    public static int count(By a){
        String total=driver.findElement(a).getText();//获取底部总条数文本
        total=total.replaceAll("共","").replaceAll("条","").trim();//获取中间条数， 文字替换成空格并去除空格+
        int t=Integer.parseInt(total);
        return t;
    }
    public static void lookUpText(By element, By search,String text, int index) {
        driver.findElement(element).sendKeys(text);
        CommonMethod.sleep(2000);
        CommonMethod.findElement(search).click();
        //定位table位置
        WebElement table = driver.findElement(DangerSourcePage.PAGETABLE);//el-table__body
        //得到表格中所有tr标签的集合
        List<WebElement> rows = table.findElements(By.tagName("tr"));
        // int count=rows.size();//获取tr个数即页面统计个数
        //先将表格行对象从rows对象中取出，使用findElements函数将表格行对象中的所有单元格对象存储到名为cols的List对象中，
        // 然后再次使用for循环把每行的单元格文本遍历输出
        for(WebElement row:rows) {
            // 然后得到当前所有tr里td标签的集合
            List<WebElement> cols = row.findElements(By.tagName("td"));
            String colsText = cols.get(index).getText();
            Assert.assertTrue(colsText.contains(text));
            System.out.println("测试："+colsText);
        }
    }
    public static void lookUpSelectTime(By time1, By time2, By cx, String ks1, String ks2,int index) throws ParseException {
        driver.findElement(time1).sendKeys(ks1);
        driver.findElement(time2).sendKeys(ks2);
        CommonMethod.sleep(2000);
        //driver.findElement(xm).click();
        driver.findElement(cx).click();
        WebElement table = driver.findElement(DangerSourcePage.PAGETABLE);
        //得到表格中所有tr标签的集合
        List<WebElement> rows = table.findElements(By.tagName("tr"));
        // 然后再次使用for循环把每行的单元格文本遍历输出
        for(WebElement row:rows) {
            // 然后得到当前所有tr里td标签的集合
            List<WebElement> cols = row.findElements(By.tagName("td"));
            String xtext = cols.get(index).getText();
            SimpleDateFormat simpl=new SimpleDateFormat("yyyy-MM-dd");
            Date x=simpl.parse(xtext);//string 类型转化为date类型
            Date k1=simpl.parse(ks1);
            Date k2=simpl.parse(ks2);
            Assert.assertTrue(k1.getTime()<=x.getTime()&&x.getTime()<=k2.getTime());//getTime()返回毫秒数

        }

    }
    public static void lookSelectType(By select,String value,By search,int index){
        CommonMethod.selectValueMethod(select,value);
        CommonMethod.findElement(search).click();
        new WebDriverWait(driver, 20, 300).until(ExpectedConditions.attributeToBe(CreatMaterialReviewPage.dis
                , "style", "display: none;"));
        WebElement table = driver.findElement(DangerSourcePage.PAGETABLE);//el-table__body
        //得到表格中所有tr标签的集合
        List<WebElement> rows = table.findElements(By.tagName("tr"));
        for(WebElement row:rows) {
            // 然后得到当前所有tr里td标签的集合
            List<WebElement> cols = row.findElements(By.tagName("td"));
            String colsText = cols.get(index).getText();
            System.out.println("测试："+colsText);
            Assert.assertTrue(colsText.equals(value));

        }
    }
    public static void listData(By elment,int index){
        List<WebElement> first= driver.findElements(elment);
        first.get(index).click();
    }


}
