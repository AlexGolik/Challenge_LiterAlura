package com.alura.challenge_literalura.service;

public interface Consumer {

  <T> T getData(String params, Class<T> entidad);
}
