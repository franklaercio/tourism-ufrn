package br.ufrn.tourism.http;

import br.ufrn.tourism.http.data.GeneralResponse;
import br.ufrn.tourism.http.data.request.CreateUserRequest;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

@Tag(name = "User")
public interface UserController {

  @Operation(summary = "Create user")
  @ApiResponses(value = {
      @ApiResponse(responseCode = "200", description = "Successfully create user"),
      @ApiResponse(responseCode = "400", description = "Missing or invalid parameter", content = @Content),
      @ApiResponse(responseCode = "404", description = "Not found account", content = @Content),
      @ApiResponse(responseCode = "500", description = "Internal server error", content = @Content)}
  )
  ResponseEntity<Void> create(@RequestBody CreateUserRequest request);

  @Operation(summary = "Get user")
  @ApiResponses(value = {
      @ApiResponse(responseCode = "200", description = "Successfully create user"),
      @ApiResponse(responseCode = "400", description = "Missing or invalid parameter", content = @Content),
      @ApiResponse(responseCode = "404", description = "Not found account", content = @Content),
      @ApiResponse(responseCode = "500", description = "Internal server error", content = @Content)}
  )
  ResponseEntity<GeneralResponse> findOne(@PathVariable(name = "userId") Long userId);

}
