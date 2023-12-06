package com.nike.mobileapppttpocnew.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class NotificationPayload {

  private String channelName;

  private String userName;

  private String channelUuid;

  private String audioUrl;

  private String message;

}
