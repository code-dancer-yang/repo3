package com.css.apps;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 *  �Զ���ĵ�һ��ע��
 * @author yang
 *
 */
@Target(value={ElementType.METHOD})
public @interface MyAnnotation {
	String value()  default "1";

}
