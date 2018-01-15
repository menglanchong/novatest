package com.hymake.nova.test;

import com.hymake.nova.page.QueryScreenWallPage;
import com.hymake.nova.service.ClearService;
import com.hymake.nova.service.ScreenWallService;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Created by Administrator on 2017/11/15.
 */
public class ClearScreenWallTest {
    @BeforeMethod
    public static void before(){
        LoginTest.login();
    }
    @Test
    public static void clearProjectText(){
        ScreenWallService.clickScreenWall();
        ClearService.clearTextService(QueryScreenWallPage.PROJECTNAME,QueryScreenWallPage.CLEAR,"第一一样");
    }
    @Test
    public static void clearCodeText(){
        ScreenWallService.clickScreenWall();
        ClearService.clearTextService(QueryScreenWallPage.PROJECTCODE,QueryScreenWallPage.CLEAR,"563214");
    }
    @Test
    public static void clearTypeText(){
        ScreenWallService.clickScreenWall();
        ClearService.clearSelectValue(QueryScreenWallPage.PROJECTTYPE,"房建工程",QueryScreenWallPage.CLEAR);
    }
    @Test
    public static void clearInProjectText(){
        ScreenWallService.clickScreenWall();
        ScreenWallService.clickInScreenWall();
        ClearService.clearTextService(QueryScreenWallPage.INPROJECTNAME,QueryScreenWallPage.INCLEAR,"第一一样");
    }
    @Test
    public static void clearInCodeText(){
        ScreenWallService.clickScreenWall();
        ScreenWallService.clickInScreenWall();
        ClearService.clearTextService(QueryScreenWallPage.INPROJECTCODE,QueryScreenWallPage.INCLEAR,"563214");
    }
    @Test
    public static void clearInTypeText(){
        ScreenWallService.clickScreenWall();
        ScreenWallService.clickInScreenWall();
        ClearService.clearSelectValue(QueryScreenWallPage.INPROJECTTYPE,"房建工程",QueryScreenWallPage.INCLEAR);
    }
    @Test
    public static void clearInBuildText(){
        ScreenWallService.clickScreenWall();
        ScreenWallService.clickInScreenWall();
        ClearService.clearTextService(QueryScreenWallPage.INCONDEP,QueryScreenWallPage.INCLEAR,"第一医院");

    }
    @Test
    public static void clearInChangeSelect(){
        ScreenWallService.clickScreenWall();
        ScreenWallService.clickInScreenWall();
        ClearService.clearSelectChangeValue(QueryScreenWallPage.INCHANGESTATUS,"草稿",QueryScreenWallPage.INCLEAR);

    }
    @Test
    public static void clearInProcessSSelect(){
        ScreenWallService.clickScreenWall();
        ScreenWallService.clickInScreenWall();

        ClearService.clearTimeService(QueryScreenWallPage.PROCESSSTARTTIME1,QueryScreenWallPage.PROCESSSTARTTIME2,
                QueryScreenWallPage.INCLEAR,QueryScreenWallPage.INPROJECTNAME,"2017-11-15",
                "2017-11-19");

    }
    @Test
    public static void clearInProcessESelect(){
        ScreenWallService.clickScreenWall();
        ScreenWallService.clickInScreenWall();
        ClearService.clearTimeService(QueryScreenWallPage.PROCESSENDTIME1,QueryScreenWallPage.PROCESSENDTIME2,
                QueryScreenWallPage.INCLEAR,QueryScreenWallPage.INPROJECTNAME,"2017-11-15",
                "2017-11-19");

    }
    @Test
    public static void clearDoneProjectText(){
        ScreenWallService.clickScreenWall();
        ScreenWallService.clickInScreenWall();
        ClearService.clearTextService(QueryScreenWallPage.DONEPROJECTNAME,QueryScreenWallPage.DONECLEAR,"第一一样");
    }
    @Test
    public static void clearDoneCodeText(){
        ScreenWallService.clickScreenWall();
        ScreenWallService.clickInScreenWall();
        ClearService.clearTextService(QueryScreenWallPage.DONEPROJECTCODE,QueryScreenWallPage.DONECLEAR,"563214");
    }
    @Test
    public static void clearDoneTypeText(){
        ScreenWallService.clickScreenWall();
        ScreenWallService.clickInScreenWall();
        ClearService.clearSelectValue(QueryScreenWallPage.DONEPROJECTTYPE,"房建工程",QueryScreenWallPage.DONECLEAR);
    }
    @Test
    public static void clearDoneBuildText(){
        ScreenWallService.clickScreenWall();
        ScreenWallService.clickInScreenWall();
        ClearService.clearTextService(QueryScreenWallPage.DONECONDEP,QueryScreenWallPage.DONECLEAR,"第一医院");

    }
    @Test
    public static void clearDoneChangeSelect(){
        ScreenWallService.clickScreenWall();
        ScreenWallService.clickInScreenWall();
        ClearService.clearSelectChangeValue(QueryScreenWallPage.DONECHANGESTATUS,"草稿",QueryScreenWallPage.DONECLEAR);

    }
    @Test
    public static void clearDoneProcessSSelect(){
        ScreenWallService.clickScreenWall();
        ScreenWallService.clickInScreenWall();

        ClearService.clearTimeService(QueryScreenWallPage.DONEPROCESSSTARTTIME1,QueryScreenWallPage.DONEPROCESSSTARTTIME2,
                QueryScreenWallPage.DONECLEAR,QueryScreenWallPage.DONEPROJECTNAME,"2017-11-15",
                "2017-11-19");

    }
    @Test
    public static void clearDoneProcessESelect(){
        ScreenWallService.clickScreenWall();
        ScreenWallService.clickInScreenWall();
        ClearService.clearTimeService(QueryScreenWallPage.DONEPROCESSENDTIME1,QueryScreenWallPage.DONEPROCESSENDTIME2,
                QueryScreenWallPage.DONECLEAR,QueryScreenWallPage.DONEPROJECTNAME,"2017-11-15",
                "2017-11-19");

    }
    @Test
    public static void clearAllProjectText(){
        ScreenWallService.clickScreenWall();
        ScreenWallService.clickInScreenWall();
        ClearService.clearTextService(QueryScreenWallPage.ALLPROJECTNAME,QueryScreenWallPage.ALLCLEAR,"第一一样");
    }
    @Test
    public static void clearAllCodeText(){
        ScreenWallService.clickScreenWall();
        ScreenWallService.clickInScreenWall();
        ClearService.clearTextService(QueryScreenWallPage.ALLPROJECTCODE,QueryScreenWallPage.ALLCLEAR,"563214");
    }
    @Test
    public static void clearAllTypeText(){
        ScreenWallService.clickScreenWall();
        ScreenWallService.clickInScreenWall();
        ClearService.clearSelectValue(QueryScreenWallPage.ALLPROJECTTYPE,"房建工程",QueryScreenWallPage.ALLCLEAR);
    }
    @Test
    public static void clearAllBuildText(){
        ScreenWallService.clickScreenWall();
        ScreenWallService.clickInScreenWall();
        ClearService.clearTextService(QueryScreenWallPage.ALLCONDEP,QueryScreenWallPage.ALLCLEAR,"第一医院");

    }
    @Test
    public static void clearAllChangeSelect(){
        ScreenWallService.clickScreenWall();
        ScreenWallService.clickInScreenWall();
        ClearService.clearSelectChangeValue(QueryScreenWallPage.ALLCHANGESTATUS,"草稿",QueryScreenWallPage.ALLCLEAR);

    }
    @Test
    public static void clearAllProcessSSelect(){
        ScreenWallService.clickScreenWall();
        ScreenWallService.clickInScreenWall();

        ClearService.clearTimeService(QueryScreenWallPage.ALLPROCESSSTARTTIME1,QueryScreenWallPage.ALLPROCESSSTARTTIME2,
                QueryScreenWallPage.ALLCLEAR,QueryScreenWallPage.ALLPROJECTNAME,"2017-11-15",
                "2017-11-19");

    }
    @Test
    public static void clearAllProcessESelect(){
        ScreenWallService.clickScreenWall();
        ScreenWallService.clickInScreenWall();
        ClearService.clearTimeService(QueryScreenWallPage.ALLPROCESSENDTIME1,QueryScreenWallPage.ALLPROCESSENDTIME2,
                QueryScreenWallPage.INCLEAR,QueryScreenWallPage.INPROJECTNAME,"2017-11-15",
                "2017-11-19");

    }


}
