package com.proctor.backendservice.service;

import com.proctor.backendservice.model.input.LoginInput;
import com.proctor.backendservice.model.output.LoginOutput;
import com.proctor.backendservice.repository.ApplicationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

/**
 * Created by ashekar on 3/26/2016.
 */
@Service
@Transactional
public class ApplicationServiceImpl implements ApplicationService {
  @Autowired
  private ApplicationRepository applicationRepository;

  @Override
  public Optional<LoginOutput> getUserDetails(LoginInput loginInput) {
    return applicationRepository.getUserByUseridAndPassword(loginInput.getUsername(), loginInput.getPassword());
  }


}
