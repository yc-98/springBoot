package com.luv2code.demo.rest;

public class StudentErrorResponse {
    private int status;
    private String message;
    private long timeSTamp;
    public StudentErrorResponse(){

    }

    public StudentErrorResponse(int status, String message, long timeSTamp) {
        this.status = status;
        this.message = message;
        this.timeSTamp = timeSTamp;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public long getTimeSTamp() {
        return timeSTamp;
    }

    public void setTimeSTamp(long timeSTamp) {
        this.timeSTamp = timeSTamp;
    }
}
