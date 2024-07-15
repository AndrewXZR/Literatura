package com.alura.literatura.service;

public interface IJsonDataConverter {
    <T> T convertFromJson(String json, Class<T> clazz);
}
