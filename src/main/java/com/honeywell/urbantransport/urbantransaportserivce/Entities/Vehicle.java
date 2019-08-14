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

public class Vehicle {

    private VehicleOwner vehicleOwner;

    private String vehicleNo;

    private String registratioinNo;

    private String carCompany;

    private String model;

}
