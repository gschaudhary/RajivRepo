/**
 * NOTE: This class is auto generated by the swagger code generator program (2.3.1).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package com.jmk.user.api;

import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.jmk.user.model.User;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-11-27T08:54:51.282+05:30")

@Api(value = "user", description = "the user API")
@RequestMapping(value="/user")
public interface UserApi {

	@ApiOperation(value = "User Creation Service", nickname = "createUser", notes = "User Creation Service", response = User.class, tags = {
			"UserMgmt", })
	@ApiResponses(value = { @ApiResponse(code = 200, message = "OK", response = User.class),
			@ApiResponse(code = 400, message = "Bad Request"),
			@ApiResponse(code = 500, message = "Internal Server Error") })
	@RequestMapping(value = "/", produces = { "application/json", "application/xml" }, consumes = { "application/json",
			"application/xml" }, method = RequestMethod.POST)
	ResponseEntity<User> createUser(@ApiParam(value = "", required = true) @Valid @RequestBody User body,
			@ApiParam(value = "") @RequestHeader(value = "xChannel", required = false) String xChannel);

	@ApiOperation(value = "User Creation with input arrays Service", nickname = "createUsersWithArrayInput", notes = "User Finding Service", tags = {
			"UserMgmt", })
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Successfully found"),
			@ApiResponse(code = 500, message = "Internal Server Error") })
	@RequestMapping(value = "/createWithArray", produces = { "application/json" }, consumes = {
			"application/json" }, method = RequestMethod.POST)
	ResponseEntity<Void> createUsersWithArrayInput(
			@ApiParam(value = "", required = true) @Valid @RequestBody List<User> body,
			@ApiParam(value = "") @RequestHeader(value = "xChannel", required = false) String xChannel);

	@ApiOperation(value = "User Deletion Service", nickname = "deleteUser", notes = "User Deletion Service", tags = {
			"UserMgmt", })
	@ApiResponses(value = { @ApiResponse(code = 200, message = "User deleted succussfully"),
			@ApiResponse(code = 400, message = "Invalid User id supplied"),
			@ApiResponse(code = 404, message = "User Id not found"),
			@ApiResponse(code = 500, message = "Internal Server Error") })
	@RequestMapping(value = "/{username}", produces = { "application/json" }, consumes = {
			"application/json" }, method = RequestMethod.DELETE)
	ResponseEntity<Void> deleteUserByUsername(
			@ApiParam(value = "Username", required = true) @PathVariable("username") String username);

	@ApiOperation(value = "User Deletion Service based on the user id", nickname = "deleteUserById", notes = "User Deletion Service based on the user id", tags = {
			"UserMgmt", })
	@ApiResponses(value = { @ApiResponse(code = 200, message = "User deleted succussfully"),
			@ApiResponse(code = 400, message = "Invalid User id supplied"),
			@ApiResponse(code = 404, message = "User Id not found"),
			@ApiResponse(code = 500, message = "Internal Server Error") })
	@RequestMapping(value = "/{id}", produces = { "application/json" }, consumes = {
			"application/json" }, method = RequestMethod.DELETE)
	ResponseEntity<Void> deleteUserById(@ApiParam(value = "User Id", required = true) @PathVariable("id") Long id);

	@ApiOperation(value = "Find User Details based on the user id", nickname = "findUserDetailsById", notes = "Find User Details based on the user id", response = User.class, tags = {
			"UserMgmt", })
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Successfully found", response = User.class),
			@ApiResponse(code = 400, message = "Invalid User name and password supplied"),
			@ApiResponse(code = 404, message = "User not found or inactive"),
			@ApiResponse(code = 500, message = "Internal Server Error") })
	@RequestMapping(value = "/{id}", produces = { "application/json" }, consumes = {
			"application/json" }, method = RequestMethod.GET)
	ResponseEntity<User> findUserDetailsById(@ApiParam(value = "User Id", required = true) @PathVariable("id") Long id);

	@ApiOperation(value = "Find User Details based on the username", nickname = "findUserDetailsByUserName", notes = "Find User Details based on the username and password", response = User.class, tags = {
			"UserMgmt", })
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Successfully found", response = User.class),
			@ApiResponse(code = 400, message = "Invalid User named"),
			@ApiResponse(code = 404, message = "User not found or inactive"),
			@ApiResponse(code = 500, message = "Internal Server Error") })
	@RequestMapping(value = "/findByUsername", produces = { "application/json" }, consumes = {
			"application/json" }, method = RequestMethod.GET)
	ResponseEntity<User> findUserDetailsByUserName(
			@ApiParam(value = "xChannel") @RequestHeader(value = "xChannel", required = false) String xChannel,
			@ApiParam(value = "username") @Valid @RequestParam(value = "username", required = true) String username);

	@ApiOperation(value = "User Login Service", nickname = "loginUser", notes = "User Finding Service", response = User.class, tags = {
			"UserMgmt", })
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Successfully found", response = User.class),
			@ApiResponse(code = 400, message = "Invalid username/password supplied"),
			@ApiResponse(code = 404, message = "User not found"),
			@ApiResponse(code = 500, message = "Internal Server Error") })
	@RequestMapping(value = "/login", produces = { "application/json" }, consumes = {
			"application/json" }, method = RequestMethod.GET)
	ResponseEntity<User> loginUser(
			@NotNull @Size(min = 3, max = 36) @ApiParam(value = "username to be find", required = true) @Valid @RequestParam(value = "username", required = true) String username,
			@NotNull @Size(min = 3, max = 36) @ApiParam(value = "password of the user", required = true) @Valid @RequestParam(value = "password", required = true) String password);

	@ApiOperation(value = "Logs out current logged in user session", nickname = "logoutUser", notes = "User Finding Service", tags = {
			"UserMgmt", })
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Successfully found") })
	@RequestMapping(value = "/logout", produces = { "application/json" }, method = RequestMethod.GET)
	ResponseEntity<Void> logoutUser();

	@ApiOperation(value = "Find User Details based on the username and password", nickname = "updateUserById", notes = "Find User Details based on the username and password", response = User.class, tags = {
			"UserMgmt", })
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Successfully found", response = User.class),
			@ApiResponse(code = 400, message = "Invalid User name supplied"),
			@ApiResponse(code = 404, message = "User not found or inactive"),
			@ApiResponse(code = 500, message = "Internal Server Error") })
	@RequestMapping(value = "/{id}", produces = { "application/json" }, consumes = {
			"application/json" }, method = RequestMethod.PUT)
	ResponseEntity<User> updateUserById(@ApiParam(value = "User Id", required = true) @PathVariable("id") Integer id,
			@ApiParam(value = "", required = true) @Valid @RequestBody User body);

	@ApiOperation(value = "Find User Details based on the username and password", nickname = "updateUserByUserName", notes = "Find User Details based on the username and password", response = User.class, tags = {
			"UserMgmt", })
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Successfully found", response = User.class),
			@ApiResponse(code = 400, message = "Invalid User name supplied"),
			@ApiResponse(code = 404, message = "User not found or inactive"),
			@ApiResponse(code = 500, message = "Internal Server Error") })
	@RequestMapping(value = "/{username}", produces = { "application/json" }, consumes = {
			"application/json" }, method = RequestMethod.PUT)
	ResponseEntity<User> updateUserByUserName(
			@ApiParam(value = "Username", required = true) @PathVariable("username") String username,
			@ApiParam(value = "", required = true) @Valid @RequestBody User body);

}
