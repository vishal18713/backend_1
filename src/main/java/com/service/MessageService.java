package com.service;

import com.model.Message;

import java.util.List;

public interface MessageService {
    Message createMessage(Message messageModel);

    Message getMessageByUserId(int userId);

    List<Message> getMessageByWorkerId(Integer workerId);

}
