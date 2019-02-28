package com.tx.serivce;

import com.tx.bean.TxConfig;

import java.util.List;

public interface ITxConfigService {

    void insert(TxConfig config);

    void insertBatch();

    List<TxConfig> list();
}
