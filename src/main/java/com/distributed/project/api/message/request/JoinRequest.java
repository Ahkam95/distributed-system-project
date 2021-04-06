package com.distributed.project.api.message.request;

import com.distributed.project.api.Credential;
import com.distributed.project.api.message.Message;

public class JoinRequest extends Message {

    private Credential credential;

    public JoinRequest(Credential credential) {
        this.credential = credential;
    }

    public Credential getCredential() {
        return credential;
    }

    public void setCredential(Credential credential) {
        this.credential = credential;
    }

    @Override
    public String getMessageAsString(String message) {
        message += " " + this.getCredential().getIp() + " " + this.getCredential().getPort();
        return super.getMessageAsString(message);
    }
}