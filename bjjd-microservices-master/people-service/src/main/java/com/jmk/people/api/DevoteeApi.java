/**
 * NOTE: This class is auto generated by the swagger code generator program (2.4.12).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package com.jmk.people.api;

import java.util.List;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.jmk.people.model.Devotee;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-02-27T07:02:52.969Z")

@Api(value = "devotee", description = "the devotee API")
@RequestMapping(value="/devotee")
public interface DevoteeApi {

    @ApiOperation(value = "Devotee Creation Service", nickname = "createDevotee", notes = "Devotee Creation Service", response = Devotee.class, tags={ "DevoteeMgmtServiceApi", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = Devotee.class),
        @ApiResponse(code = 400, message = "Bad Request"),
        @ApiResponse(code = 500, message = "Internal Server Error") })
    @RequestMapping(value = "/",
        produces = { "application/json", "application/xml" }, 
        consumes = { "application/json", "application/xml" },
        method = RequestMethod.POST)
    ResponseEntity<Devotee> createDevotee(@ApiParam(value = "" ,required=true )  @Valid @RequestBody Devotee body,@ApiParam(value = "" ) @RequestHeader(value="xChannel", required=false) String xChannel);

    @ApiOperation(value = "Devotee Creation with input arrays Service", nickname = "createDevoteesWithArrayInput", notes = "Devotee Finding Service", tags={ "DevoteeMgmtServiceApi", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successfully found"),
        @ApiResponse(code = 500, message = "Internal Server Error") })
    @RequestMapping(value = "/createDevotees",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    public ResponseEntity<List<Devotee>> createDevotees(@ApiParam(value = "" ,required=true )  @Valid @RequestBody List<Devotee> body,@ApiParam(value = "" ) @RequestHeader(value="xChannel", required=false) String xChannel) ;

    @ApiOperation(value = "Devotee Deletion Service based on the devotee id", nickname = "deleteDevoteeById", notes = "Devotee Deletion Service based on the devotee id", tags={ "DevoteeMgmtServiceApi", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Devotee deleted succussfully"),
        @ApiResponse(code = 400, message = "Invalid User id supplied"),
        @ApiResponse(code = 404, message = "Devotee Id not found"),
        @ApiResponse(code = 500, message = "Internal Server Error") })
    @RequestMapping(value = "/{id}",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.DELETE)
    ResponseEntity<Void> deleteDevoteeById(@ApiParam(value = "Devotee Id",required=true) @PathVariable("id") Long id) ;

    @ApiOperation(value = "Find all the devotees by status", nickname = "findDevoteeByMobileNumber", notes = "Find all the devotees by status", response = Devotee.class, tags={ "DevoteeMgmtServiceApi", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successfully found", response = Devotee.class),
        @ApiResponse(code = 400, message = "Invalid mobile number supplied"),
        @ApiResponse(code = 404, message = "Devotee not found or inactive"),
        @ApiResponse(code = 500, message = "Internal Server Error") })
    @RequestMapping(value = "/findByMobileNumber",
        produces = { "application/json", "application/xml" }, 
        consumes = { "application/json", "application/xml" },
        method = RequestMethod.GET)
    ResponseEntity<Devotee> findDevoteeByMobileNumber(@ApiParam(value = "" ) @RequestHeader(value="xChannel", required=false) String xChannel,@ApiParam(value = "") @Valid @RequestParam(value = "mobileNo", required = true) String mobileNo);

    @ApiOperation(value = "Find Devotee Details based on the devotee id", nickname = "findDevoteeDetailsById", notes = "Find Devotee Details based on the devotee id", response = Devotee.class, tags={ "DevoteeMgmtServiceApi", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successfully found", response = Devotee.class),
        @ApiResponse(code = 400, message = "Invalid Devotee name and password supplied"),
        @ApiResponse(code = 404, message = "Devotee not found or inactive"),
        @ApiResponse(code = 500, message = "Internal Server Error") })
    @RequestMapping(value = "/{id}",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.GET)
    ResponseEntity<Devotee> findDevoteeDetailsById(@ApiParam(value = "Devotee Id",required=true) @PathVariable("id") Long id) ;

    @ApiOperation(value = "Find all the devotees by status", nickname = "findDevoteesByStatus", notes = "Find all the devotees by status", response = Devotee.class, responseContainer = "List", tags={ "DevoteeMgmtServiceApi", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = Devotee.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "Invalid status value"),
        @ApiResponse(code = 500, message = "Internal Server Error") })
    @RequestMapping(value = "/findByStatus",
        produces = { "application/json", "application/xml" }, 
        consumes = { "application/json", "application/xml" },
        method = RequestMethod.GET)
    ResponseEntity<List<Devotee>> findDevoteesByStatus(@ApiParam(value = "" ) @RequestHeader(value="xChannel", required=false) String xChannel,@ApiParam(value = "The status to restrict the results to.  If not provided, all records are returned", allowableValues = "A, I") @Valid @RequestParam(value = "status", required = false) String status) ;

    @ApiOperation(value = "Update Devotee Details based on the devotee id", nickname = "updateDevoteeById", notes = "Update Devotee Details based on the devotee id", response = Devotee.class, tags={ "DevoteeMgmtServiceApi", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successfully found", response = Devotee.class),
        @ApiResponse(code = 400, message = "Invalid Devotee name supplied"),
        @ApiResponse(code = 404, message = "Devotee not found or inactive"),
        @ApiResponse(code = 500, message = "Internal Server Error") })
    @RequestMapping(value = "/{id}",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    ResponseEntity<Devotee> updateDevoteeById(@ApiParam(value = "Devotee Id",required=true) @PathVariable("id") Long id,@ApiParam(value = "" ,required=true )  @Valid @RequestBody Devotee body) ;
}
