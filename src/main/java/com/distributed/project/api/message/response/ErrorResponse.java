package com.distributed.project.api.message.response;

import com.distributed.project.api.message.Message;

public class ErrorResponse extends Message {

    @Override
    public String getMessageAsString(String message) {
        return super.getMessageAsString(message);
    }

    @Override
    public String toString() {
        String response = "An error occurred";
        return response;
    }
}
