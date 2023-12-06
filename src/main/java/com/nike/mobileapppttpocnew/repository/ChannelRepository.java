package com.nike.mobileapppttpocnew.repository;

import com.nike.mobileapppttpocnew.model.Channel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChannelRepository extends JpaRepository<Channel, Integer> {

  public Channel findByUuid(String uuid);

  public Channel findByChannelName(String channelName);

}
