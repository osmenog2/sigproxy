package com.unifun.sigproxy.model.config;

import lombok.Data;

@Data
public class RemoteLinkConfig {
    private String linkName;
    private String remoteAddress;
    private int remotePort;
}