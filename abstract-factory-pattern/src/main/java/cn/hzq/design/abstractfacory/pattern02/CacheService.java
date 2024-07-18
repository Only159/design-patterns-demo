package cn.hzq.design.abstractfacory.pattern02;

import java.util.concurrent.TimeUnit;

/**
 * @Author: 黄照权
 * @CreateTime: 2024-07-18
 * @Description: 设计模式实现
 */
public interface CacheService {
    String get(final String key);

    void set(String key, String value);

    void set(String key, String value, long timeout, TimeUnit timeUnit);

    void del(String key);

}
