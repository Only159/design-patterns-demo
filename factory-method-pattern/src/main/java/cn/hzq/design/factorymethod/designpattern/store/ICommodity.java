package cn.hzq.design.factorymethod.designpattern.store;

import java.util.Map;

/**
 * @Author: 黄照权
 * @CreateTime: 2024-07-18
 * @Description:
 */
public interface ICommodity {
    void sendCommodity(String uId, String commodityId, String bizId, Map<String, String> extMap) throws Exception;
}

