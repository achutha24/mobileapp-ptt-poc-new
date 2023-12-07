package com.nike.mobileapppttpocnew.repository;

import com.nike.mobileapppttpocnew.model.UserChannel;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserChannelRepository extends JpaRepository<UserChannel, Integer> {

  @Query("select userId FROM UserChannel where channelId=?1")
  public List<Integer> findBychannelId(String channelId);

  public List<UserChannel> findAllByChannelId(String channelId);

}
