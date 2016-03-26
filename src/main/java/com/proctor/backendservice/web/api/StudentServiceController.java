package com.proctor.backendservice.web.api;

import com.proctor.backendservice.model.input.LoginInput;
import com.proctor.backendservice.model.output.LoginOutput;
import com.proctor.backendservice.service.ApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Optional;

/**
 * Created by ashekar on 3/26/2016.
 */
@Controller
public class StudentServiceController {

  @Autowired
  private ApplicationService applicationService;

  @RequestMapping(value = "/api/student/login/", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
  public ResponseEntity<LoginOutput> getUserDeatials(@RequestBody LoginInput loginInput) {

    Optional<LoginOutput> loginOutput = applicationService.getUserDetails(loginInput);
    if (loginOutput.isPresent()) {
      return new ResponseEntity<>(loginOutput.get(), HttpStatus.OK);
    } else {
      return new ResponseEntity<>(new LoginOutput(0L, "false"), HttpStatus.BAD_REQUEST); // should return 400 if there is no data

    }
  }
}
