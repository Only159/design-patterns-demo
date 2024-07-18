package cn.hzq.design.factorymethod.conventional;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @Author: 黄照权
 * @CreateTime: 2024-07-18
 * @Description: 奖品出参
 */
@Data

@AllArgsConstructor
public class AwardRes {
    private String code; // 编码
    private String info; // 描述
}
