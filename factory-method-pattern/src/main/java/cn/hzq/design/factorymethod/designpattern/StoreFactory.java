package cn.hzq.design.factorymethod.designpattern;

import cn.hzq.design.factorymethod.designpattern.store.ICommodity;
import cn.hzq.design.factorymethod.designpattern.store.impl.CardCommodityService;
import cn.hzq.design.factorymethod.designpattern.store.impl.CouponCommodityService;
import cn.hzq.design.factorymethod.designpattern.store.impl.GoodsCommodityService;

/**
 * @Author: 黄照权
 * @CreateTime: 2024-07-18
 * @Description:
 */

public class StoreFactory {
    public ICommodity getCommodityService(Integer commodityType) {
        if (null == commodityType) return null;
        if (1 == commodityType) return new CouponCommodityService();
        if (2 == commodityType) return new GoodsCommodityService();
        if (3 == commodityType) return new CardCommodityService();
        throw new RuntimeException("不存在的商品服务类型");
    }
}
