package com.unifun.sigproxy.model.dto;

import lombok.Data;

@Data
public class M3uaAsDTO {
    private String name;
    private String ipspType;
    private long[] routingContexts;
    private String state;
}
