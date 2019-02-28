package com.tx;


import com.tx.serivce.ITxConfigService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/applicationContent-beans.xml"})
public class TxConfigServiceTest {

    @Resource
    private ITxConfigService txConfigService;

    @Test
    public void insertTest() {
        txConfigService.insertBatch();
    }
}
