package com.honeywell.urbantransport.urbantransaportserivce.Commuter;

import com.honeywell.urbantransport.urbantransaportserivce.Entities.VehicleOwner;
import com.honeywell.urbantransport.urbantransaportserivce.VehicleOwner.VehicleOwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

/**
 * Created by admin on 8/14/2019.
 */
@Service
public class CommuterService {

    private static final int DEFAULT_PRE_BOOKING_DAYS = 7;
    @Autowired
    private VehicleOwnerService vehicleOwnerService;

    public List<VehicleOwner> getVehicleOwners(LocalDateTime localDateTime, String startLocation, String endLocation) {

        return vehicleOwnerService.getVehicleOwners(localDateTime, startLocation, endLocation);

    }

    public boolean requestVehicleOwner(String vehicleOwnerId, LocalDateTime localDateTime, String startLocation, String endLocation) {

        if(localDateTime.isBefore(LocalDateTime.now().plusDays(DEFAULT_PRE_BOOKING_DAYS)));

        return vehicleOwnerService.requestVehicleOwner(vehicleOwnerId, localDateTime, startLocation, endLocation);
    }
}
