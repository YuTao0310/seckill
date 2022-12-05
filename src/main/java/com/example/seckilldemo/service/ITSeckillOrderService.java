package com.example.seckilldemo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.seckilldemo.entity.TSeckillOrder;
import com.example.seckilldemo.entity.TUser;

/**
 * 秒杀订单表 服务类
 *
 * @author YuTao
 * @since 2022-03-03
 */
public interface ITSeckillOrderService extends IService<TSeckillOrder> {

    /**
     * 获取秒杀结果
     *
     * @param tUser
     * @param goodsId
     * @return orderId 成功 ；-1 秒杀失败 ；0 排队中
     * @author YuTao
     * @operation add
     * @date 7:07 下午 2022/10/8
     **/
    Long getResult(TUser tUser, Long goodsId);
}
