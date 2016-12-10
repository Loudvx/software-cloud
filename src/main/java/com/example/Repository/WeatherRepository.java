package com.example.Repository;

import java.util.List;
import java.util.UUID;
import com.example.Entity.WeatherEntity;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Lou-Evans on 09/12/2016.
 */
@javax.transaction.Transactional
public interface WeatherRepository extends CrudRepository<WeatherEntity, UUID> {

    List<WeatherEntity> findAll();

}