package com.atguigu.common.exception;
/*
   错误码和错误信息定义类
   1错误码定义规则为5位数字
   2前两位表示业务场景，最后三维表示错误码，例如：10001，10通用，001系统位置异常
   3维护错误码后需要维护错误描述，将他们定义为枚举形式
   错误码列表：
   10：通用
   11：商品
   12：订单
   13：购物车
   14：物流
 */
public enum BizCodeEnume {
    UNKNOW_EXCEPITON(10000,"系统未知异常"),
    VAILD_EXCEPITON(10001,"参数格式校验失败");
    private int code;
    private String msg;
    BizCodeEnume(int code,String msg){
        this.code =code;
        this.msg=msg;
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
