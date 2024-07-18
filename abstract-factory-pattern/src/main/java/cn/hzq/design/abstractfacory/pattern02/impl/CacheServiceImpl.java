package cn.hzq.design.abstractfacory.pattern02.impl;

import cn.hzq.design.abstractfacory.matter.RedisUtils;
import cn.hzq.design.abstractfacory.pattern02.CacheService;

import java.util.concurrent.TimeUnit;

/**
 * @Author: 黄照权
 * @CreateTime: 2024-07-18
 * @Description:
 */

public class CacheServiceImpl implements CacheService {
    private RedisUtils redisUtils = new RedisUtils();

    public String get(String key) {
        return redisUtils.get(key);
    }

    public void set(String key, String value) {
        redisUtils.set(key, value);
    }

    public void set(String key, String value, long timeout, TimeUnit timeUnit) {
        redisUtils.set(key, value, timeout, timeUnit);
    }

    public void del(String key) {
        redisUtils.del(key);
    }
}
