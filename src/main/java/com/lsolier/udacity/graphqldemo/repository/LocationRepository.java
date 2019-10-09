package com.lsolier.udacity.graphqldemo.repository;

import com.lsolier.udacity.graphqldemo.entity.Location;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocationRepository extends CrudRepository<Location, Long> {

}
