package com.tx.serivce.impl;

import com.tx.bean.TxConfig;
import com.tx.mapper.TxConfigMapper;
import com.tx.serivce.ITxConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.support.TransactionTemplate;

import java.util.List;

@Service
public class TxConfigServiceImpl implements ITxConfigService {

    @Autowired
    private TxConfigMapper configMapper;

    @Autowired
    private TransactionTemplate transactionTemplate;

    @Override
    public void insert(TxConfig config) {
        configMapper.insert(config);
    }

    @Override
    public List<TxConfig> list() {
        return configMapper.list();
    }

    @Override
    public void insertBatch() {

        transactionTemplate.execute(status -> {
            try {
                TxConfig config = new TxConfig();
                config.setKey("1").setValue("AA");
                configMapper.insert(config);

                config.setKey("2").setValue("BB");
                configMapper.insert(config);

                config.setKey("3").setValue("CC");
                configMapper.insert(config);

                int a = 12 / 0;

                config.setKey("4").setValue("DD");
                configMapper.insert(config);

                config.setKey("5").setValue("EE");
                configMapper.insert(config);

                config.setKey("6").setValue("FF");
                configMapper.insert(config);
            } catch (Exception e) {
                e.printStackTrace();
                status.setRollbackOnly();
            }
            return null;
        });
    }
}
