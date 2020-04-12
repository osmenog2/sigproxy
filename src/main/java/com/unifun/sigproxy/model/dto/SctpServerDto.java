package com.unifun.sigproxy.model.dto;

import lombok.Data;
import org.mobicents.protocols.api.Server;

import java.util.Set;

@Data
public class SctpServerDto {
    private String serverName;
    private String localAddress;
    private int localPort;

    private String[] extraAddresses;

    private Set<SctpServerLinkDto> serverLinks;

}
