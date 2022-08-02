package com.example.demo.Service;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;
//import java.util.stream.Collectors;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Models.User;
import com.example.demo.Repositories.UserRepository;

@Service
public class PasswordEncoder {
	
	public String passwordEncryption(String password) {
		String encryptedPassword = null;
		try {
			
			MessageDigest messageDigest = MessageDigest.getInstance("MD5");
			messageDigest.update(password.getBytes());
			byte[] bytes = messageDigest.digest();
			StringBuilder builder = new StringBuilder();
			for(int i = 0; i<bytes.length; i++) {
				builder.append(Integer.toString((bytes[i] & 0xff) +0x100 , 16).substring(1));
			}
			encryptedPassword = builder.toString();
				
				
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		return encryptedPassword;
	}
	
	@Autowired
	private UserRepository userRepository;
	
	@Transactional
	public void UpdatePasswordNonEncoded(String newPass) {
		List<User> users = userRepository.findByUserPassword(newPass);
		for(User user : users) {
			user.setUserPassword(passwordEncryption(user.getUserPassword()));
			user.setIsHashed(true);
			userRepository.save(user);
		}
		//newPass = passwordEncryption(newPass);
		//users.stream().map(en -> {en.setUserPassword(passwordEncryption(newPass)); return en;}).collect(Collectors.toList()).forEach(en -> userRepository.save(en));

	}
	
}
