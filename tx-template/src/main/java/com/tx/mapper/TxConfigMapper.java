package com.tx.mapper;

import com.tx.bean.TxConfig;

import java.util.List;

public interface TxConfigMapper {

    void insert(TxConfig config);

    List<TxConfig> list();
}
