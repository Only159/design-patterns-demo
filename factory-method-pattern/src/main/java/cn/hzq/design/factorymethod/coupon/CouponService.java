package cn.hzq.design.factorymethod.coupon;

/**
 * @Author: 黄照权
 * @CreateTime: 2024-07-18
 * @Description: 模拟优惠券服务
 */

public class CouponService {
    public CouponResult sendCoupon(String uId, String couponNumber, String uuid) {
        System.out.println("模拟发放优惠券一张：" + uId + "," + couponNumber + "," + uuid);
        return new CouponResult("0000", "发放成功");
    }
}
