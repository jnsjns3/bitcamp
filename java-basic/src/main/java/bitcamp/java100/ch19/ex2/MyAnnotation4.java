package bitcamp.java100.ch19.ex2;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

// 컴파일한후 .Class 파일에 저장된다.
// 보관정책을 지정하지 않으면 기본이 @Retention(RetentionPolicy.CLASS) 이다.

@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation4 {}



