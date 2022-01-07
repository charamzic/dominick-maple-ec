package com.charamzic.dominickmapleec.services;

import com.charamzic.dominickmapleec.models.Subscriber;
import com.charamzic.dominickmapleec.repositories.SubscriberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class SubscriberServiceImpl implements SubscriberService {

    private final SubscriberRepository subscriberRepository;

    @Autowired
    public SubscriberServiceImpl(SubscriberRepository subscriberRepository) {
        this.subscriberRepository = subscriberRepository;
    }

    @Override
    public List<Subscriber> getAllSubscribers() {
        List<Subscriber> dbItems = this.subscriberRepository.findAll();

        if (dbItems != null) {
            return dbItems;
        }

        return Collections.emptyList();
    }

    @Override
    public void save(Subscriber subscriber) {
        subscriberRepository.save(subscriber);
    }
}