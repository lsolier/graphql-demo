package com.lsolier.udacity.graphqldemo.service.impl;

import com.lsolier.udacity.graphqldemo.entity.Location;
import com.lsolier.udacity.graphqldemo.repository.LocationRepository;
import com.lsolier.udacity.graphqldemo.service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocationServiceImpl implements LocationService {

  LocationRepository locationRepository;

  @Autowired
  public LocationServiceImpl(LocationRepository locationRepository) {
    this.locationRepository = locationRepository;
  }

  @Override
  public List<Location> retrieveLocations() {
    return (List<Location>) locationRepository.findAll();
  }
}
