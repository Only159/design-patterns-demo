package cn.hzq.design.abstractfacory.pattern02.factory.impl;

import cn.hzq.design.abstractfacory.matter.EGM;
import cn.hzq.design.abstractfacory.pattern02.factory.ICacheAdapter;

import java.util.concurrent.TimeUnit;

/**
 * @Author: 黄照权
 * @CreateTime: 2024-07-18
 * @Description:
 */

public class EGMCacheAdapter implements ICacheAdapter {
    private EGM egm = new EGM();

    @Override
    public String get(String key) {
        return egm.gain(key);
    }

    @Override
    public void set(String key, String value) {
        egm.set(key, value);
    }

    @Override
    public void set(String key, String value, long timeout, TimeUnit timeUnit) {
        egm.setEx(key, value, timeout, timeUnit);
    }

    @Override
    public void del(String key) {
        egm.delete(key);
    }
}
