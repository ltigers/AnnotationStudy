package com.ltiger.processor;

import javax.lang.model.type.TypeMirror;

/**
 * author : tiger
 * email  : liuxh@lovewith.me
 * time   : 16-12-29 下午3:03
 */

final class FieldViewBinding {
    private final String name;
    private final TypeMirror type;
    private final int resId;

    public FieldViewBinding(String name, TypeMirror type, int resId) {
        this.name = name;
        this.type = type;
        this.resId = resId;
    }

    public int getResId() {
        return resId;
    }

    public String getName() {
        return name;
    }

    public TypeMirror getType() {
        return type;
    }
}
