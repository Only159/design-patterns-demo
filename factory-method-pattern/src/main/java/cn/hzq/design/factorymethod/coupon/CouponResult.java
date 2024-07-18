package cn.hzq.design.factorymethod.coupon;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @Author: 黄照权
 * @CreateTime: 2024-07-18
 * @Description:
 */
@Data
@AllArgsConstructor
public class CouponResult {
    private String code; // 编码
    private String info; // 描述
}
