package com.honeywell.urbantransport.urbantransaportserivce.Entities;

import jdk.nashorn.internal.objects.annotations.Constructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;
import java.util.List;

/**
 * Created by admin on 8/14/2019.
 */

@Getter
@Setter
@ToString
@EqualsAndHashCode

public class VehicleOwner extends User {

    private Vehicle vehicle;

    private String licenseNo;

    private String startLocation;

    private String endLocation;

    private LocalDateTime startTime;

    private List<Ride> activeRides;

    private List<Ride> acceptedRides;

    private List<Ride> requestedRides;

    private List<Ride> pastRides;
}
