package com.distributed.project.api;

import com.distributed.project.api.message.Message;
import com.distributed.project.api.message.request.SearchRequest;
import com.distributed.project.api.message.response.SearchResponse;

import java.util.List;

public interface NodeOps {
    void start();

    void register();

    void unRegister();

    void join(Credential neighbourCredential);

    void joinOk(Credential senderCredential);

    void leave(Credential neighbourCredential);

    void leaveOk(Credential senderCredential);

    void search(SearchRequest searchRequest, Credential sendCredential);

    void searchOk(SearchResponse searchResponse);

    List<String> createFileList();

    void processResponse(Message response);

    void error(Credential senderCredential);

    boolean isRegOk();

    List<String> checkForFiles(String fileName, List<String> fileList);

    void triggerSearchRequest(SearchRequest searchRequest);

    void printRoutingTable(List<Credential> routingTable);
}
