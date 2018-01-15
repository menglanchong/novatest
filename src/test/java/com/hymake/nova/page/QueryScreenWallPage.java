package com.hymake.nova.page;

import org.openqa.selenium.By;

/**
 * Created by Administrator on 2017/11/15.
 */
public class QueryScreenWallPage {
    public static By PROJECTNAME= By.xpath(".//*[@id='cw_curtainWall_list']/div[1]/ul/li[1]/center/div/input");//项目列表项目名称
    public static By PROJECTCODE= By.xpath(".//*[@id='cw_curtainWall_list']/div[1]/ul/li[2]/center/div/input");//项目列表项目代码
    public static By PROJECTTYPE= By.xpath(".//*[@id='cw_curtainWall_list']/div[1]/ul/li[3]/center/div/select");//项目列表项目类别
    public static By QUERY=By.xpath(".//*[@id='cw_curtainWall_list']/div[1]/div/button[1]");//项目列表查询
    public static By CLEAR=By.xpath(".//*[@id='cw_curtainWall_list']/div[1]/div/button[3]");//项目列表清空
    public static By INPROJECTNAME= By.xpath(".//*[@id='cw_curtainWall_wait']/div[1]/ul/li[1]/center/div/input");//在办事项项目名称
    public static By INPROJECTCODE= By.xpath(".//*[@id='cw_curtainWall_wait']/div[1]/ul/li[2]/center/div/input");//在办事项项目代码
    public static By INPROJECTTYPE= By.xpath(".//*[@id='cw_curtainWall_wait']/div[1]/ul/li[3]/center/div/select");//在办事项项目代码
    public static By INCONDEP=By.xpath(".//*[@id='cw_curtainWall_wait']/div[1]/ul/li[4]/center/div/input");//在办建设单位名称
    public static By INCHANGESTATUS=By.xpath(".//*[@id='cw_curtainWall_wait']/div[1]/ul/li[5]/center/div/select");//在办变更状态
    public static By PROCESSSTARTTIME1=By.xpath(".//*[@id='cw_curtainWall_wait']/div[1]/ul/li[6]/center/div/div[1]/input");//在办流程开始时间
    public static By PROCESSSTARTTIME2=By.xpath(".//*[@id='cw_curtainWall_wait']/div[1]/ul/li[6]/center/div/div[2]/input");//在办流程开始时间
    public static By PROCESSENDTIME1=By.xpath(".//*[@id='cw_curtainWall_wait']/div[1]/ul/li[7]/center/div/div[1]/input");//在办流程结束时间
    public static By PROCESSENDTIME2=By.xpath(".//*[@id='cw_curtainWall_wait']/div[1]/ul/li[7]/center/div/div[2]/input");//在办流程结束时间
    public static By INQUERY=By.xpath(".//*[@id='cw_curtainWall_wait']/div[1]/div/button[1]");//在办查询
    public static By INCLEAR=By.xpath(".//*[@id='cw_curtainWall_wait']/div[1]/div/button[2]");//在办清空
    public static By DONEPROJECTNAME= By.xpath(".//*[@id='cw_curtainWall_done']/div[1]/ul/li[1]/center/div/input");//已办事项项目名称
    public static By DONEPROJECTCODE= By.xpath(".//*[@id='cw_curtainWall_done']/div[1]/ul/li[2]/center/div/input");//已办事项项目代码
    public static By DONEPROJECTTYPE= By.xpath(".//*[@id='cw_curtainWall_done']/div[1]/ul/li[3]/center/div/select");//已办事项项目代码
    public static By DONECONDEP=By.xpath(".//*[@id='cw_curtainWall_done']/div[1]/ul/li[4]/center/div/input");//已办建设单位名称
    public static By DONECHANGESTATUS=By.xpath(".//*[@id='cw_curtainWall_done']/div[1]/ul/li[5]/center/div/select");//已办变更状态
    public static By DONEPROCESSSTARTTIME1=By.xpath(".//*[@id='cw_curtainWall_done']/div[1]/ul/li[6]/center/div/div[1]/input");//已办流程开始时间
    public static By DONEPROCESSSTARTTIME2=By.xpath(".//*[@id='cw_curtainWall_done']/div[1]/ul/li[6]/center/div/div[2]/input");//已办流程开始时间
    public static By DONEPROCESSENDTIME1=By.xpath(".//*[@id='cw_curtainWall_done']/div[1]/ul/li[7]/center/div/div[1]/input");//已办流程结束时间
    public static By DONEPROCESSENDTIME2=By.xpath(".//*[@id='cw_curtainWall_done']/div[1]/ul/li[7]/center/div/div[2]/input");//已办流程结束时间
    public static By DONEQUERY=By.xpath(".//*[@id='cw_curtainWall_done']/div[1]/div/button[1]");//已办查询
    public static By DONECLEAR=By.xpath(".//*[@id='cw_curtainWall_done']/div[1]/div/button[2]");//已办清空
    public static By ALLPROJECTNAME= By.xpath(".//*[@id='cw_curtainWall_all']/div[1]/ul/li[1]/center/div/input");//所有事项项目名称
    public static By ALLPROJECTCODE= By.xpath(".//*[@id='cw_curtainWall_all']/div[1]/ul/li[2]/center/div/input");//所有事项项目代码
    public static By ALLPROJECTTYPE= By.xpath(".//*[@id='cw_curtainWall_all']/div[1]/ul/li[3]/center/div/select");//所有事项项目代码
    public static By ALLCONDEP=By.xpath(".//*[@id='cw_curtainWall_all']/div[1]/ul/li[4]/center/div/input");//所有建设单位名称
    public static By ALLCHANGESTATUS=By.xpath(".//*[@id='cw_curtainWall_all']/div[1]/ul/li[5]/center/div/select");//所有变更状态
    public static By ALLPROCESSSTARTTIME1=By.xpath(".//*[@id='cw_curtainWall_all']/div[1]/ul/li[6]/center/div/div[1]/input");//所有流程开始时间
    public static By ALLPROCESSSTARTTIME2=By.xpath(".//*[@id='cw_curtainWall_all']/div[1]/ul/li[6]/center/div/div[2]/input");//所有流程开始时间
    public static By ALLPROCESSENDTIME1=By.xpath(".//*[@id='cw_curtainWall_all']/div[1]/ul/li[7]/center/div/div[1]/input");//所有流程结束时间
    public static By ALLPROCESSENDTIME2=By.xpath(".//*[@id='cw_curtainWall_all']/div[1]/ul/li[7]/center/div/div[2]/input");//所有流程结束时间
    public static By ALLQUERY=By.xpath(".//*[@id='cw_curtainWall_all']/div[1]/div/button[1]");//所有查询
    public static By ALLCLEAR=By.xpath(".//*[@id='cw_curtainWall_all']/div[1]/div/button[2]");//所有清空
    public static By PROJECTLIST=By.xpath(".//*[@id='cw_curtainWall']/div[1]/ul/li[1]");//项目列表定位
    public static By INITEMLIST=By.xpath(".//*[@id='cw_curtainWall']/div[1]/ul/li[2]");//在办事项定位
    public static By DONEITEMLIST=By.xpath(".//*[@id='cw_curtainWall']/div[1]/ul/li[3]");//已办事项定位
    public static By ALLITEMLIST=By.xpath(".//*[@id='cw_curtainWall']/div[1]/ul/li[4]");//所有事项定位

}
