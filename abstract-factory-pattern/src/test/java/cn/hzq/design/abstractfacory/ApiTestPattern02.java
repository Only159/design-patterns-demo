package cn.hzq.design.abstractfacory;

import cn.hzq.design.abstractfacory.pattern02.CacheService;
import cn.hzq.design.abstractfacory.pattern02.factory.JDKProxy;
import cn.hzq.design.abstractfacory.pattern02.factory.impl.EGMCacheAdapter;
import cn.hzq.design.abstractfacory.pattern02.factory.impl.IIRCacheAdapter;
import cn.hzq.design.abstractfacory.pattern02.impl.CacheServiceImpl;
import org.junit.Test;

/**
 * @Author: 黄照权
 * @CreateTime: 2024-07-18
 * @Description:
 */

public class ApiTestPattern02 {

    @Test
    public void test_cacheService() throws Exception {
        CacheService proxy_EGM = JDKProxy.getProxy(CacheServiceImpl.class, new EGMCacheAdapter());
        proxy_EGM.set("user_name_01", "小傅哥");
        String val01 = proxy_EGM.get("user_name_01");
        System.out.println("测试结果：" + val01);

        CacheService proxy_IIR = JDKProxy.getProxy(CacheServiceImpl.class, new IIRCacheAdapter());
        proxy_IIR.set("user_name_01", "小傅哥");
        String val02 = proxy_IIR.get("user_name_01");
        System.out.println("测试结果：" + val02);
    }
}
