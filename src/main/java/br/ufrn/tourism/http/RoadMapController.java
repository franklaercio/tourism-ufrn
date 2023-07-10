package br.ufrn.tourism.http;

import br.ufrn.tourism.http.data.GeneralResponse;
import br.ufrn.tourism.http.data.request.CreateRoadMapRequest;
import br.ufrn.tourism.http.data.request.FollowRoadMapRequest;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;

@Tag(name = "Road Map")
public interface RoadMapController {

  @Operation(summary = "Create road map")
  @ApiResponses(value = {
      @ApiResponse(responseCode = "200", description = "Successfully create road map"),
      @ApiResponse(responseCode = "400", description = "Missing or invalid parameter", content = @Content),
      @ApiResponse(responseCode = "404", description = "Not found account", content = @Content),
      @ApiResponse(responseCode = "500", description = "Internal server error", content = @Content)})
  ResponseEntity<Void> create(@RequestBody CreateRoadMapRequest request);

  @Operation(summary = "Get All road map")
  @ApiResponses(value = {
      @ApiResponse(responseCode = "200", description = "Successfully get all road map"),
      @ApiResponse(responseCode = "400", description = "Missing or invalid parameter", content = @Content),
      @ApiResponse(responseCode = "404", description = "Not found account", content = @Content),
      @ApiResponse(responseCode = "500", description = "Internal server error", content = @Content)})
  ResponseEntity<GeneralResponse> getAll();

  @Operation(summary = "Follow road map")
  @ApiResponses(value = {
      @ApiResponse(responseCode = "200", description = "Successfully to follow road map"),
      @ApiResponse(responseCode = "400", description = "Missing or invalid parameter", content = @Content),
      @ApiResponse(responseCode = "404", description = "Not found account", content = @Content),
      @ApiResponse(responseCode = "500", description = "Internal server error", content = @Content)})
  ResponseEntity<GeneralResponse> follow(@RequestBody FollowRoadMapRequest request);
}
