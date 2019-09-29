/*
 * Id$: zuv-cloud:z-gui-support:cc.zuv.gui.support.ApplicationTests:20190104164250
 *
 * ApplicationTests.java
 * Copyright (c) 2002-2020 Luther Inc.
 * http://zuv.cc
 * All rights reserved.
 */
package cc.zuv.gui.support;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * 测试类
 *
 * @author          Kama Luther
 * @version         0.1
 * @since           0.1
 * @create.date     2018-10-26 15:32
 * @modify.date     2018-10-26 15:32
 */
@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTests
{

    //-----------------------------------------------------------------------------------------

	@Test
	public void contextLoads()
    {
        log.debug("context loads");
	}

    //-----------------------------------------------------------------------------------------

}
