package com.honeywell.urbantransport.urbantransaportserivce.Entities;

import com.honeywell.urbantransport.urbantransaportserivce.Utils.RideStatus;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

/**
 * Created by admin on 8/14/2019.
 */
@Getter
@Setter
@ToString
@EqualsAndHashCode

public class Ride {

    private Commuter rider;

    private VehicleOwner rideGiver;

    private LocalDateTime startTime;

    private String startLocation;

    private String endLocation;

    private RideStatus rideStatus;
}
