package br.ufrn.tourism.http.impl;

import br.ufrn.tourism.domain.Person;
import br.ufrn.tourism.http.UserController;
import br.ufrn.tourism.http.data.GeneralResponse;
import br.ufrn.tourism.http.data.request.CreateUserRequest;
import br.ufrn.tourism.http.data.response.GetOneUserResponse;
import br.ufrn.tourism.services.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserControllerImpl implements UserController {

  private final UserService userService;

  public UserControllerImpl(UserService userService) {
    this.userService = userService;
  }

  @Override
  @PostMapping
  public ResponseEntity<Void> create(CreateUserRequest request) {
    this.userService.create(request);
    return ResponseEntity.status(HttpStatus.CREATED).build();
  }

  @Override
  @GetMapping("/{userId}")
  public ResponseEntity<GeneralResponse> findOne(@PathVariable(name = "userId") Long userId) {
    Person person = this.userService.findOne(userId);
    return ResponseEntity.ok(new GetOneUserResponse("Attraction created successfully", person));
  }
}
