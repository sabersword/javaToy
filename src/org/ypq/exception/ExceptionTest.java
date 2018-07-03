package org.ypq.exception;

/**
 * 测试异常的包装,捕获
 */
public class ExceptionTest {

    public static void main(String[] args) {
        try {
            callCheckException();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void checkExceptionMethod() throws DefCheckException {
        try {
            double result = 1 / 0;
            System.out.println(result);
        } catch (ArithmeticException arithmeticException) {
            throw new DefCheckException(arithmeticException);
//            throw new DefCheckException("产生了自定义 检查异常", arithmeticException);
        }
    }

    public static void callCheckException() {
        try {
            checkExceptionMethod();
        } catch (Exception e) {
//            throw new DefRTException("产生了自定义 运行时异常", e);
            throw new DefRTException(e);
        }
    }

}
