package com.luojay.pagehelper.utils;
import com.luojay.pagehelper.vo.ResultVO;

/**
 * author：luojay
 * 这是一个工具类，生成两个方法success和error方法，其中重载一个success,data输出为NULL时调用
 * 目的：在序列化Json对象时方便调用
 */
public class ResultVOUtil {
    public static ResultVO success(Object object){
        ResultVO resultVO = new ResultVO();
        resultVO.setData(object);
        resultVO.setCode(0);
        resultVO.setMsg("success");
        return resultVO;
    }
    public static ResultVO success(){
        return success(null);
    }
    public static ResultVO error(Integer code,String message){
        ResultVO resultVO = new ResultVO();
        resultVO.setCode(code);
        resultVO.setMsg(message);
        return resultVO;
    }
}
