package com.anas.spring.error;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class Error {
    private String message;
    private String uri;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy hh:mm:ss")
    private Date timestamp;

    private Error() {
        timestamp = new Date();
    }

    public Error(String message, String uri) {
        this();
        this.message = message;
        this.uri = uri;
    }


    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }
}
