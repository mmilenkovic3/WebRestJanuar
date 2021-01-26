package services;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.fasterxml.jackson.core.JsonProcessingException;

import model.User;
import repo.UserRepository;



@Path("/users")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class UserService {

	@Context
	HttpServletRequest request;
		
	@GET
	@Path("/getAllUsers")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getAllUsers() {
		ArrayList<User> users = UserRepository.GetAllUsers();
		return Response.status(200).entity(users).build();
	}
	
	@POST
	@Path("/saveGuest")
	public Response saveGuest(User user) throws IOException {

		if(UserRepository.UniqueUsername(user.getUsername()))
		{					
			User u = UserRepository.saveGuest(user);				
			return Response.status(200).entity(u).build();
		}		
		return Response.status(400).entity("User with that username already Exists! Please write another one.").build();
			
		
		
	}
	
	@POST
	@Path("/login")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response LogIn(User user)
	{
		/*System.out.println("U: " + data.get("username") + " P: "+data.get("password"));
		User u = UserRepository.FindUser(data.get("username"), data.get("password"));*/
		
		System.out.println("U: " + user.getUsername() + " P: "+ user.getPassword());
		User u = UserRepository.FindUser(user.getUsername(), user.getPassword());
		u = UserRepository.LogIn(u);
		if(u!=null){
			System.out.println("NEKO SE ULOGOVAO.");
				request.getSession().setAttribute("loggedUser", u);
				return Response.status(200).entity(u).build();
			}
		
		return Response.status(400).entity("User doesn't exists!").build();
	}
	
	@GET
	@Path("/getLoggedUser")
	public Response GetLoggedUser()
	{
		User user = (User) request.getSession().getAttribute("loggedUser");
		return Response.status(200).entity(user).build();
	}
	
	@GET
	@Path("/logout")
	public Response LogOut() {		
		request.getSession().removeAttribute("loggedUser");
		return Response.status(200).entity("Successeffully logged out!").build();
	}
	
	
	
	
}
