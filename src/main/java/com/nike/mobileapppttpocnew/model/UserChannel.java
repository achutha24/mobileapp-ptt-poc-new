package com.nike.mobileapppttpocnew.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class UserChannel {

  @Id
  private int usedId;

  private String channelId;

  private String pttToken;

}
