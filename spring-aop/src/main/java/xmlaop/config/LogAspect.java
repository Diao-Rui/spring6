package xmlaop.config;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * @Author: Diao Rui
 * @className: LogAspect
 * @Description: 切面类
 * @DateTime: 2023/8/8 10:11
 * @version: 1.0
 **/
@Component
public class LogAspect {
    private final Logger logger = LoggerFactory.getLogger(LogAspect.class);

    /*设置切入点和通知类型
    通知类型
      @before（前置通知）
      @AfterReturning（返回通知）
      @AfterThrowing（异常通知）
      @After（后置通知）
      @Around（环绕通知）
    参数 value="切入点表达式"
     */
    //前置通知
    public void beforeMethod(JoinPoint joinPoint) {
        //获取方法名
        String methodName = joinPoint.getSignature().getName();
        //获取参数列表
        Object[] args = joinPoint.getArgs();
        logger.info("前置通知--》，方法名：" + methodName + "，参数列表：" + Arrays.toString(args));
    }

    //后置通知
    public void afterMethod(JoinPoint joinPoint) {
        //获取方法名
        String methodName = joinPoint.getSignature().getName();
        logger.info("后置通知--》，方法名：" + methodName);

    }

    //返回通知
    public void afterReturningMethod(JoinPoint joinPoint, Object result) {
        String methodName = joinPoint.getSignature().getName();
        logger.info("返回通知--》，方法名：" + methodName + "，返回值为：" + result);

    }

    //异常通知
    public void afterThrowMethod(JoinPoint joinPoint, Throwable throwable) {
        String methodName = joinPoint.getSignature().getName();
        logger.info("异常通知--》，方法名：" + methodName + "，异常信息为：" + throwable);
    }

    //环绕通知
    public Object aroundMethod(ProceedingJoinPoint joinPoint) {
        String methodName = joinPoint.getSignature().getName();
        String args = Arrays.toString(joinPoint.getArgs());
        Object result = null;
        try {
            logger.info("环绕通知-->目标对象方法执行之前");
            //目标对象（连接点）方法的执行
            result = joinPoint.proceed();
            logger.info("环绕通知-->目标对象方法返回值之后");
        } catch (Throwable throwable) {
            throwable.printStackTrace();
            logger.info("环绕通知-->目标对象方法出现异常时");
        } finally {
            logger.info("环绕通知-->目标对象方法执行完毕");
        }
        return result;
    }
}
