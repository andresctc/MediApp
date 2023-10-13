package com.mitocode.util;

import java.sql.Timestamp;
import java.time.LocalDateTime;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;


@Converter(autoApply = true)
public class MyLocalDateTimeConverter implements AttributeConverter<java.time.LocalDateTime, java.sql.Timestamp>{

	@Override
	public Timestamp convertToDatabaseColumn(LocalDateTime attribute) {
		return attribute == null ? null : java.sql.Timestamp.valueOf(attribute);
	}
	
	@Override
	public java.time.LocalDateTime convertToEntityAttribute(java.sql.Timestamp dbData) {
		return dbData == null ? null : dbData.toLocalDateTime();
	}
	
}