package br.ufrn.tourism.http;

import br.ufrn.tourism.http.data.request.CreateAttractionRequest;
import br.ufrn.tourism.http.data.GeneralResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;

@Tag(name = "Attraction")
public interface AttractionController {

  @Operation(summary = "Create attraction")
  @ApiResponses(value = {
      @ApiResponse(responseCode = "200", description = "Successfully create attraction"),
      @ApiResponse(responseCode = "400", description = "Missing or invalid parameter", content = @Content),
      @ApiResponse(responseCode = "404", description = "Not found account", content = @Content),
      @ApiResponse(responseCode = "500", description = "Internal server error", content = @Content)}
  )
  ResponseEntity<Void> create(@RequestBody CreateAttractionRequest request);
}
