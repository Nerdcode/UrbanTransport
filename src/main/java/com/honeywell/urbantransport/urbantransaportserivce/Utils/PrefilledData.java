package com.honeywell.urbantransport.urbantransaportserivce.Utils;

import com.honeywell.urbantransport.urbantransaportserivce.Entities.VehicleOwner;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by admin on 8/14/2019.
 */
public class PrefilledData {

    public static class VehicleOweners {

        public static List<VehicleOwner> getVehicleOwners() {

            List<VehicleOwner> list = new ArrayList<>();

            VehicleOwner vehicleOwner = new VehicleOwner();

            vehicleOwner.setUsername("Durga");
            vehicleOwner.setStartLocation("waverock");
            vehicleOwner.setEndLocation("chandanagar");
            //vehicleOwner.setStartTime();


            return list;
        }
    }
}
