package cn.hzq.design.abstractfacory;

import cn.hzq.design.abstractfacory.pattern00.CacheService;
import cn.hzq.design.abstractfacory.pattern00.impl.CacheServiceImpl;
import org.junit.Test;

/**
 * @Author: 黄照权
 * @CreateTime: 2024-07-18
 * @Description:
 */

public class ApiTestPattern00 {
    @Test
    public void test_cacheService(){
        CacheService cacheService = new CacheServiceImpl();
        cacheService.set("user_name_01", "hzq");
        String val01 = cacheService.get("user_name_01");
        cacheService.del("user_name_01");
        System.out.println(val01);
    }

}
