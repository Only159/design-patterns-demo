package cn.hzq.design.factorymethod.card;

/**
 * @Author: 黄照权
 * @CreateTime: 2024-07-18
 * @Description: 模拟爱奇艺会员卡服务
 */

public class IQiYiCardService {
    public void grantToken(String bindMobileNumber, String cardId) {
        System.out.println("模拟发放爱奇艺会员卡一张：" + bindMobileNumber + "，" + cardId);
    }
}
