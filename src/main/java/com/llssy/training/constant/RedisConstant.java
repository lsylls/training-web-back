package com.llssy.training.constant;

/**
 * Redis常量
 */
public interface RedisConstant {

    /**
     * 用户签到使用功能的key前缀
     */
    String USER_SIGN_IN_REDIS_KEY_PREFIX = "user:signins";

    /**
     * 获取用户签到记录的rediskey
     * @param year 年份
     * @param userId 用户id
     * @return 拼接好的RedisKey
     */
    static String getUserSignInRedisKey(int year, long userId){
        return String.format("%s:%s:%S", USER_SIGN_IN_REDIS_KEY_PREFIX, year, userId);
    }

}
