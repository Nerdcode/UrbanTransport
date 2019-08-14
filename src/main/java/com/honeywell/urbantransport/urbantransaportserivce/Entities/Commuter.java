package com.honeywell.urbantransport.urbantransaportserivce.Entities;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

/**
 * Created by admin on 8/14/2019.
 */

@Getter
@Setter
@ToString
@EqualsAndHashCode

public class Commuter extends User {

    private Ride ActiveRide;

    private List<Ride> requestedRides;

    private List<Ride> pastRides;
}
