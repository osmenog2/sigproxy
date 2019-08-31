package com.unifun.sigproxy.model.config;

import lombok.Data;

@Data
public class AspConfig {
    private String aspName;
    private String sctpAssocName;
    private boolean heartbeat = false;
    private String asName;
}