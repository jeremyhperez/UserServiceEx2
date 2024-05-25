package com.coderscampus.userserviceex;

public class UserService {
	public User createUser(String[] stringInput) {

		String username = stringInput[0];
		String password = stringInput[1];
		String name = stringInput[2];

		return new User(username, password, name);
	}

	public static void main(String[] args) {

		UserService userService = new UserService();
		String[] input = { "jeremyperez", "password123", "Jeremy Perez" };
		User user = userService.createUser(input);
		System.out.println(user);
	}

}
