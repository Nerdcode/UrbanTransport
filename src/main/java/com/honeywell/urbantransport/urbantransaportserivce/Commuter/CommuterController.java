package com.honeywell.urbantransport.urbantransaportserivce.Commuter;

import com.honeywell.urbantransport.urbantransaportserivce.Entities.Vehicle;
import com.honeywell.urbantransport.urbantransaportserivce.Entities.VehicleOwner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by admin on 8/14/2019.
 */

@RestController
@RequestMapping("/commuter")
public class CommuterController {

    @Autowired
    private CommuterService commuterService;

    @GetMapping("/search")
    public ResponseEntity<?> searchVehicleOwnwers(@RequestParam LocalDateTime localDateTime,
                                            @RequestParam String startLocation,
                                            @RequestParam String endLocation) {

        List<VehicleOwner> vehicleOwnerList = commuterService.getVehicleOwners(localDateTime, startLocation, endLocation);


        //return new ResponseEntity<>( vehicleOwnerList, HttpStatus.OK);

        List<VehicleOwner> vehicleOwnerListDummy = new ArrayList<>();
        VehicleOwner vehicleOwner = new VehicleOwner();

        vehicleOwner.setUsername("Durga");
        vehicleOwner.setStartLocation("waverock");
        vehicleOwner.setEndLocation("chandanagar");

        VehicleOwner vehicleOwner2 = new VehicleOwner();

        vehicleOwner.setUsername("prasad");
        vehicleOwner.setStartLocation("waverock");
        vehicleOwner.setEndLocation("chandanagar");

        vehicleOwnerListDummy.add(vehicleOwner);
        vehicleOwnerListDummy.add(vehicleOwner2);
        return new ResponseEntity<>( vehicleOwnerListDummy, HttpStatus.OK);
    }

    @PostMapping("/sendRideRequest")
    public ResponseEntity<?> sendRideRequest(@RequestParam String vehicleOwnerId,
                                             @RequestParam LocalDateTime localDateTime,
                                             @RequestParam String startLocation,
                                             @RequestParam String endLocation) {

        boolean requested = commuterService.requestVehicleOwner(vehicleOwnerId, localDateTime,startLocation, endLocation);

        boolean dummy = true;
        return new ResponseEntity<>( dummy, HttpStatus.OK);
       // return new ResponseEntity<>( requested, HttpStatus.OK);
    }


}
