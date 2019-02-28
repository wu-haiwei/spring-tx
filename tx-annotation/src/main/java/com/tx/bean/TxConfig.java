package com.tx.bean;

public class TxConfig {

    private Long id;

    private String key;

    private String value;

    public Long getId() {
        return id;
    }

    public TxConfig setId(Long id) {
        this.id = id;
        return this;
    }

    public String getKey() {
        return key;
    }

    public TxConfig setKey(String key) {
        this.key = key;
        return this;
    }

    public String getValue() {
        return value;
    }

    public TxConfig setValue(String value) {
        this.value = value;
        return this;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("TxConfig{");
        sb.append("id=").append(id);
        sb.append(", key='").append(key).append('\'');
        sb.append(", value='").append(value).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
