package com.css.apps;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 *  自定义的第一个注解
 * @author yang
 *
 */
@Target(value={ElementType.METHOD})
public @interface MyAnnotation {
	String value()  default "1";

}
