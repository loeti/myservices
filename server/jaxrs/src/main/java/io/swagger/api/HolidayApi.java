package io.swagger.api;

import io.swagger.model.*;

import com.wordnik.swagger.annotations.*;
import com.sun.jersey.multipart.FormDataParam;

import io.swagger.model.Holiday;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import com.sun.jersey.core.header.FormDataContentDisposition;
import com.sun.jersey.multipart.FormDataParam;

import javax.ws.rs.core.Response;
import javax.ws.rs.*;

@Path("/holiday")
@Api(value = "/holiday", description = "the holiday API")
public class HolidayApi {
  
  @GET
  
  
  
  // Holiday
  @ApiOperation(value = "Public holidays for the city of Zurich", notes = "The holiday endpoint returns information about the public holiday for the city of Zurich including the public holidays of the Canton of Zurich and the public  holidays of Switzerland. The response includes the dates for the specified year and the display names in German in ascending order of the dates. ", response = Holiday.class, responseContainer = "List")
  @ApiResponses(value = { 
    @ApiResponse(code = 0, message = "Unexpected error") })

  public Response holidayGet(@ApiParam(value = "The year.",required=true) @QueryParam("year") String year)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }

  
}
