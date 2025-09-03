package com.fake.data.controller;

import com.fasterxml.jackson.annotation.JsonInclude;
import java.io.Serializable;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class RestResponse<T> implements Serializable {

    private static final long serialVersionUID = 1L;

    protected Integer status;
    protected String message;
    protected Object errors;
    protected Object data;

    public RestResponse() { }

    public RestResponse(Object data) {
        this.data = data;
    }

    public RestResponse(Integer status, Object data) {
        this.status = status;
        this.data = data;
    }

    public RestResponse(Integer status, String message) {
        this.status = status;
        this.message = message;
    }

    public RestResponse(Integer status, String message, Object errors) {
        this.status = status;
        this.message = message;
        this.errors = errors;
    }

    public Integer getStatus() { return status; }
    public String getMessage() { return message; }
    public Object getErrors() { return errors; }
    public Object getData() { return data; }
}
