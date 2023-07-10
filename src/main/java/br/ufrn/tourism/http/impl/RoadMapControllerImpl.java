package br.ufrn.tourism.http.impl;

import br.ufrn.tourism.database.entities.RoadMapEntity;
import br.ufrn.tourism.domain.RoadMap;
import br.ufrn.tourism.http.RoadMapController;
import br.ufrn.tourism.http.data.GeneralResponse;
import br.ufrn.tourism.http.data.request.CreateRoadMapRequest;
import br.ufrn.tourism.http.data.request.FollowRoadMapRequest;
import br.ufrn.tourism.http.data.response.CreateRoadMapResponse;
import br.ufrn.tourism.http.data.response.FollowRoadMapResponse;
import br.ufrn.tourism.http.data.response.GetAllRoadMapResponse;
import br.ufrn.tourism.services.RoadMapService;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/road-map")
public class RoadMapControllerImpl implements RoadMapController {

  private final RoadMapService roadMapService;

  public RoadMapControllerImpl(RoadMapService roadMapService) {
    this.roadMapService = roadMapService;
  }

  @Override
  @PostMapping
  public ResponseEntity<Void> create(@RequestBody CreateRoadMapRequest request) {
    this.roadMapService.create(request);
    return ResponseEntity.status(HttpStatus.CREATED).build();
  }

  @Override
  public ResponseEntity<GeneralResponse> getAll() {
    Iterable<RoadMapEntity> roadMaps = this.roadMapService.getAll();
    return ResponseEntity.ok(new GetAllRoadMapResponse("Road map follow with success", roadMaps));
  }

  @Override
  @PostMapping("/follow")
  public ResponseEntity<GeneralResponse> follow(@RequestBody FollowRoadMapRequest request) {
    RoadMap roadMap = this.roadMapService.follow(request);
    return ResponseEntity.ok(new FollowRoadMapResponse("Road map follow with success", roadMap));
  }


}
