package com.unifun.sigproxy.service;

import com.unifun.sigproxy.exception.InitializingException;
import com.unifun.sigproxy.exception.NoConfigurationException;
import com.unifun.sigproxy.model.LinkConfig;
import com.unifun.sigproxy.model.SctpLinkDto;
import com.unifun.sigproxy.model.SctpServerConfig;
import com.unifun.sigproxy.model.SctpServerDto;

import java.util.Set;

public interface SctpService {
    void initialize() throws NoConfigurationException, InitializingException;

    void updateSctpLink(LinkConfig linkConfig);

    void updateSctpServer(SctpServerConfig serverConfig);

    Set<SctpLinkDto> getLinkStatus();

    Set<SctpServerDto> getServerLinkStatuses();

    void stopLink(String linkName);

    void startLink(String linkName);

    void stopServer(String serverName);

    void startServer(String serverName);
}