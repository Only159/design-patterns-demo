package cn.hzq.design.abstractfacory;

import cn.hzq.design.abstractfacory.pattern01.CacheService;
import cn.hzq.design.abstractfacory.pattern01.impl.CacheServiceImpl;
import org.junit.Test;

/**
 * @Author: 黄照权
 * @CreateTime: 2024-07-18
 * @Description:
 */

public class ApiTestPattern01 {

    @Test
    public void test_cacheService() {
        CacheService cacheService = new CacheServiceImpl();
        cacheService.set("user_name_01", "hzq", 1);
        String val01 = cacheService.get("user_name_01", 1);
        cacheService.del("user_name_01",1);
        System.out.println(val01);
    }
}
