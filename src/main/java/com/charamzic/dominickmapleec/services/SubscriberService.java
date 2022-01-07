package com.charamzic.dominickmapleec.services;

import com.charamzic.dominickmapleec.models.Subscriber;

import java.util.List;

public interface SubscriberService {

    List<Subscriber> getAllSubscribers();

    void save(Subscriber subscriber);
}