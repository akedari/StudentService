package com.proctor.backendservice.service;

import com.proctor.backendservice.model.input.LoginInput;
import com.proctor.backendservice.model.output.LoginOutput;

import java.util.Optional;

/**
 * Created by ashekar on 3/26/2016.
 */

public interface ApplicationService {

   Optional<LoginOutput> getUserDetails(LoginInput loginInput);

}
