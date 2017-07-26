package org.seckill.exception;

/**
 * Created by xjshi on 15/07/2017.
 * 秒杀相关业务异常
 */
public class SeckillException extends RuntimeException {
    public SeckillException(String message) {
        super(message);
    }

    public SeckillException(String message, Throwable cause) {
        super(message, cause);
    }
}
