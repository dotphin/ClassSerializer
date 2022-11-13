package com.dotphin.classserializer;

import java.lang.reflect.Field;

public interface ClassProcessor {
    public boolean shouldDeserializeField(Class<?> clazz, Field field);

    public boolean shouldDeserializeValue(Class<?> clazz, Field field, Object value);

    public boolean shouldSerializeField(Class<?> clazz, Field field);

    public boolean shouldSerializeValue(Class<?> clazz, Field field, Object value);

    public String getFieldName(Class<?> clazz, Field field);
}
