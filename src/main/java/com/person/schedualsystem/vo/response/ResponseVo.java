package com.person.schedualsystem.vo.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;

/**
 * @author created by aimy
 * date: 2019/10/7 17:47
 */
@Getter
@ApiModel(value = "ReponseVo<T>",description = "自定义的返回对象")
public class ResponseVo<T> {
    @ApiModelProperty(name = "data",value = "数据")
    private T data;
    @ApiModelProperty(name = "msg",value = "错误消息")
    private String msg;
    @ApiModelProperty(name = "errCode",value = "错误码")
    private Integer code  = 200;

    public ResponseVo<T> success(T data){
        this.msg = "处理成功";
        this.data = data;
        return this;
    }

    public  ResponseVo<T> failure(String msg){
        this.msg = msg;
        this.code = 400;
        return this;
    }
}
