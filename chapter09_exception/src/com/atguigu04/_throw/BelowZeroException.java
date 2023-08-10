package com.atguigu04._throw;

/**
 * ClassName: BelowZeroException
 * Package: com.atguigu04._throw
 * Description:
 *
 * @Author gyq
 * @Create 2023/6/17 9:57
 * @Version 1.0
 */
public class BelowZeroException extends Exception{
    static final long serialVersionUID = -3387124229948L;
    public BelowZeroException (){

    }

    public BelowZeroException (String message){
        super(message);
    }

    public BelowZeroException (String message,Throwable cause){
        super(message,cause);
    }

}
