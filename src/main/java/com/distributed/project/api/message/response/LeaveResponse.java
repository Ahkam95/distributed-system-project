package com.distributed.project.api.message.response;

import com.distributed.project.api.message.Message;


public class LeaveResponse extends Message {

    private int value;

    public LeaveResponse(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String getMessageAsString(String message) {
        message += " " + this.getValue();
        return super.getMessageAsString(message);
    }
}
