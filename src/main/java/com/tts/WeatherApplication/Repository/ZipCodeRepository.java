package com.tts.WeatherApplication.Repository;

import com.tts.WeatherApplication.Model.ZipCode;
//import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface ZipCodeRepository extends PagingAndSortingRepository<ZipCode, Long> {



}
