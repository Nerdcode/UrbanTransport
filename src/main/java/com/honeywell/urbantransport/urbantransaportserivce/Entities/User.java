package com.honeywell.urbantransport.urbantransaportserivce.Entities;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Created by admin on 8/14/2019.
 */

@Getter
@Setter
@ToString
@EqualsAndHashCode

public class User {

    private String id;

    private String username;

    private String email;

    private String phone;

    private float rating;

    private int ratingCount;

}
