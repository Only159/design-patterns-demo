package cn.hzq.design.abstractfacory.pattern01;

import java.util.concurrent.TimeUnit;

/**
 * @Author: 黄照权
 * @CreateTime: 2024-07-18
 * @Description: 一坨代码实现接口
 */
public interface CacheService {
    String get(final String key,int redisType);

    void set(String key, String value,int redisType);

    void set(String key, String value, long timeout, TimeUnit timeUnit,int redisType);

    void del(String key,int redisType);
}
