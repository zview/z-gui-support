/*
 * Id$: zuv-cloud:z-gui-support:cc.zuv.gui.support.Executor:20190104164250
 *
 * Executor.java
 * Copyright (c) 2002-2020 Luther Inc.
 * http://zuv.cc
 * All rights reserved.
 */

package cc.zuv.gui.support;

import lombok.extern.slf4j.Slf4j;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * starter File Description
 *
 * @author          Kama Luther
 * @version         0.1
 * @since           0.1
 * @create.date     2018-08-21 19:04
 * @modify.date     2018-08-21 19:04
 */
@Slf4j
public class Executor
{


    //-----------------------------------------------------------------------------------------

    @BeforeMethod
    public void initial()
    {
        log.info("[initial]");

    }

    @AfterMethod
    public void destroy()
    {
        log.info("[destroy]");

    }

    //-----------------------------------------------------------------------------------------

    @Test
    public void test()
    {
        log.info("[test]");

    }

    //-----------------------------------------------------------------------------------------


}
