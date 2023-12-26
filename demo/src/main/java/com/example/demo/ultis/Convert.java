package com.example.demo.ultis;

import org.apache.commons.beanutils.ConversionException;
import org.apache.commons.beanutils.Converter;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Convert implements Converter {

    @Override
    public <T> T convert(Class<T> type, Object value) {
        if (value == null) {
            return null;
        }
        if (!(value instanceof String)) {
            throw new ConversionException("Value is not a String");
        }
        try {
            LocalDate date = LocalDate.parse((String) value, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
            return type.cast(date);
        } catch (Exception e) {
            throw new ConversionException(e);
        }
    }
}
