package com.heroxu.xrpc.registry;

/**
 * 服务发现
 */
public interface ServerDiscovery {

    /**
     * 根据 <服务名称> 查询 <服务地址>
     * @param serviceName 服务名称
     * @return 服务地址
     */
    String discoverService(String serviceName);
}
