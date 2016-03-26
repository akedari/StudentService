package com.proctor.backendservice.repository;

import com.proctor.backendservice.model.output.LoginOutput;

import java.util.Optional;

/**
 * Created by ashekar on 3/26/2016.
 */
public interface ApplicationRepository {

  Optional<LoginOutput> getUserByUseridAndPassword(String userId , String password);
}
