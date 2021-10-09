package com.noturaun.myth.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class ResponseData<T> {
    private boolean status;
    private List<String> messages = new ArrayList<>();
    private T payload;
}
