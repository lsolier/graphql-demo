package com.lsolier.udacity.graphqldemo.web;

import com.lsolier.udacity.graphqldemo.entity.Location;
import com.lsolier.udacity.graphqldemo.service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LocationController {

  private LocationService locationService;

  @Autowired
  public LocationController(LocationService locationService) {
    this.locationService = locationService;
  }

  @GetMapping("/location")
  public ResponseEntity<List<Location>> getAllLocations() {
    List<Location> locationList = locationService.retrieveLocations();
    return new ResponseEntity<List<Location>>(locationList, HttpStatus.OK);
  }
}
