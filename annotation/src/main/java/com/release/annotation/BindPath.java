package com.release.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author Mr.release
 * @create 2020/9/21
 * @Describe
 */

//元注解
@Target(ElementType.TYPE)   //声明注解的作用域  放在什么上面
@Retention(RetentionPolicy.CLASS)   //声明注解的生命周期  就是它的存在周期  源码期 < 编译期 < 运行期
public @interface BindPath {
    //路由表中的key
    String value();
}