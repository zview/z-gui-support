/*
 * Id$: zuv-cloud:z-gui-support:cc.zuv.gui.support.ServiceStartupApplication:20190104164250
 *
 * ServiceStartupApplication.java
 * Copyright (c) 2002-2020 Luther Inc.
 * http://zuv.cc
 * All rights reserved.
 */

package cc.zuv.gui.support;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * zuv-cloud File Description
 *
 * @author          Kama Luther
 * @version         0.1
 * @since           0.1
 * @create.date     2018-12-17 21:17
 * @modify.date     2018-12-17 21:17
 */
@Slf4j
@SpringBootApplication(scanBasePackages={"cc.zuv.gui.support"})
public class ServiceStartupApplication
{

    //-----------------------------------------------------------------------------------------

    public static void main(String[] args)
    {
        SpringApplication.run(ServiceStartupApplication.class, args);
    }

    //-----------------------------------------------------------------------------------------

}
