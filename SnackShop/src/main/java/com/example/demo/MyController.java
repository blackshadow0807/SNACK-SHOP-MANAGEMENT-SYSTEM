package com.example.demo;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class MyController
{
	@Autowired
	SnackRepo snackRepo;
	@Autowired
	UserRepo userrepo;
	
	@RequestMapping("login{username}")
	public int login(@PathVariable String username, @RequestBody String password)
	{
		int count=userrepo.countByUsername(username);
		if(count==0)
			return 2; // wrong username
		else if(count>1)
			return 3; //multiple accounts with same username
		else 
		{
			User user=userrepo.findByUsername(username);
			if(user.password.equals(password))
				return 1;
			else
				return 4;
					
		}
	}
	
	@RequestMapping("add")
	public Snack add(@RequestBody Snack snack)
	{
		try 
		{
			Snack snackdb=snackRepo.save(snack);
			return snackdb;
		} catch (Exception e)
		{
			e.printStackTrace();
			return null;
		}
	}
	
	@RequestMapping("get")
	public List<Snack> get()
	{
		try {
			return snackRepo.findAll();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	@RequestMapping("delete{id}")
	public int delete(@PathVariable int id)
	{
		try
		{
			snackRepo.deleteById(id);
			return 1;
		}
		catch (Exception e)
		{
			e.printStackTrace();
			return 0;
		}
	}

}
