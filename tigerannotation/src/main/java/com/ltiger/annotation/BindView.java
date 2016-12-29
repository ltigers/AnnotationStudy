package com.ltiger.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * author : tiger
 * email  : liuxh@lovewith.me
 * time   : 16-12-29 下午1:56
 */
@Retention(RetentionPolicy.CLASS)
@Target({ElementType.FIELD, ElementType.TYPE})
public @interface BindView {
    int value();
}
