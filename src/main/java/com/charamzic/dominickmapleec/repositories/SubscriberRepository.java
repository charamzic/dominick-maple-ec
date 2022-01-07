package com.charamzic.dominickmapleec.repositories;

import com.charamzic.dominickmapleec.models.Subscriber;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubscriberRepository extends JpaRepository<Subscriber, Long> {
}