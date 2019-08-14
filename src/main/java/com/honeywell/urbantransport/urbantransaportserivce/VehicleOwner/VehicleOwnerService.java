package com.honeywell.urbantransport.urbantransaportserivce.VehicleOwner;

import com.honeywell.urbantransport.urbantransaportserivce.Entities.VehicleOwner;
import com.honeywell.urbantransport.urbantransaportserivce.Utils.PrefilledData;
import com.sun.xml.internal.org.jvnet.fastinfoset.stax.LowLevelFastInfosetStreamWriter;
import org.jcp.xml.dsig.internal.dom.Utils;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by admin on 8/14/2019.
 */

@Service
public class VehicleOwnerService {


    public List<VehicleOwner> getVehicleOwners(LocalDateTime localDateTime, String startLocation, String endLocation) {

        //TODO
        //call the vehicleOwnerRepository
        //send these parameters to query

        //filterVehicles(localDateTime, startLocation, endLocation);
        //List<VehicleOwner> filterVehicles = new ArrayList<>();

        return null;
    }

    public boolean requestVehicleOwner(String vehicleOwnerId, LocalDateTime localDateTime, String startLocation, String endLocation) {

        //TODO
        //call the vehicleOwnerRepository
        //submit thiss request

        return true;
    }


}
