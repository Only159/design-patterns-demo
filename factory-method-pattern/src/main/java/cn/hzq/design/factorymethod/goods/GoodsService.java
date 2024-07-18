package cn.hzq.design.factorymethod.goods;

import com.alibaba.fastjson.JSON;

/**
 * @Author: 黄照权
 * @CreateTime: 2024-07-18
 * @Description: 模拟实物商品服务
 */

public class GoodsService {
    public Boolean deliverGoods(DeliverReq req) {
        System.out.println("模拟发货实物商品一个：" + JSON.toJSONString(req));
        return true;
    }
}
