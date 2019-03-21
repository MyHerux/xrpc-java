package com.heroxu.xrpc.registry;

/**
 * 服务注册
 */
public interface ServiceRegistry {

    /**
     * 注册 <服务名称> 与 <服务地址>
     * @param serviceName 服务名称
     * @param serviceAddress 服务地址
     * @return 是否注册成功
     */
    boolean registerService(String serviceName,String serviceAddress);

}
