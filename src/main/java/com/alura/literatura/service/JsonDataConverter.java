package com.alura.literatura.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonDataConverter implements IJsonDataConverter{
    private final ObjectMapper objectMapper = new ObjectMapper();

    @Override
    public <T> T convertFromJson(String json, Class<T> clazz) {
        try {
            return objectMapper.readValue(json,clazz);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}
