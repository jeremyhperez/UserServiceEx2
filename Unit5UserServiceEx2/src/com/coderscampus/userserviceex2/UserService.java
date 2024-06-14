package com.coderscampus.userserviceex2;

public class UserService {
	public User createUser(String username, String password, String name) {
		User user = new User();
		user.setUsername(username);
		user.setPassword(password);
		user.setName(name);
		return user;
	}

	public String[] parseText (String input) {
		return input.split(",");
	}

	public static void main(String[] args) {

		UserService userService = new UserService();
		User user = userService.createUser("jeremyhperez", "password123", "Jeremy");
		System.out.println(user);

		String input = "exampleUsername,examplePassword,exampleName";
		String[] inputArray = userService.parseText(input);
		for (String array : inputArray) {
			System.out.println(array);
		}
	}

}
