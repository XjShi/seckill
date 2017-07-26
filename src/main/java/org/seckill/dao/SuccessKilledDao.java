package org.seckill.dao;

import org.apache.ibatis.annotations.Param;
import org.seckill.entity.SuccessKilled;

/**
 * Created by xjshi on 15/07/2017.
 */
public interface SuccessKilledDao {
    /**
     * 插入购买明细，可过滤重复
     *
     * @param seckillId
     * @param userPhone
     * @return 插入的行数
     */
    int insertSuccessKilled(@Param("seckillId") long seckillId, @Param("userPhone") long userPhone);

    /**
     * 根据id查询SuccessKilled并携带秒杀产品对象实体
     *
     * @param seckillId
     * @returnssKilled queryByIdWithSecKill(long
     */
    SuccessKilled queryByIdWithSecKill(@Param("seckillId") long seckillId, @Param("userPhone") long userPhone);
}
