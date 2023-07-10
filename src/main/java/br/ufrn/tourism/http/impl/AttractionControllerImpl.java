package br.ufrn.tourism.http.impl;

import br.ufrn.tourism.domain.Attraction;
import br.ufrn.tourism.http.AttractionController;
import br.ufrn.tourism.http.data.request.CreateAttractionRequest;
import br.ufrn.tourism.http.data.GeneralResponse;
import br.ufrn.tourism.http.data.response.CreateAttractionResponse;
import br.ufrn.tourism.services.AttractionService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/attraction")
public class AttractionControllerImpl implements AttractionController {

  private final AttractionService attractionService;

  public AttractionControllerImpl(AttractionService attractionService) {
    this.attractionService = attractionService;
  }

  @Override
  @PostMapping
  public ResponseEntity<Void> create(@RequestBody CreateAttractionRequest request) {
    this.attractionService.create(request);
    return ResponseEntity.status(HttpStatus.CREATED).build();
  }

}
