package per.czt.myblog.web.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import per.czt.myblog.service.UserService;



@Controller
@RequestMapping("/user")
public class UserController {
	@Resource
	private UserService userService;
	/*
    @RequestMapping("/listAll/{id}/{username}")
    
	public @ResponseBody List<User> listAllUser(Model model,@PathVariable("id")Integer id,@PathVariable("username")String username)
	{
        Map<String,Object> map=new HashMap<String,Object>();
        map.put("id", id);
        map.put("username",username);
  
		List<User> userList=userService.searchUser(map);
		model.addAttribute("userList", userList);
		for(User u:userList)
		{
			System.out.println("id:"+u.getId());
			System.out.println("username:"+u.getUsername());
			System.out.println("password:"+u.getPassword());
			System.out.println("email:"+u.getEmail());
		}
		
		return userList;
	}
    
    @RequestMapping("/listAll2/{id}/{username}")
    
   	public  String listAllUser2(Model model,@PathVariable("id")Integer id,@PathVariable("username")String username)
   	{
           Map<String,Object> map=new HashMap<String,Object>();
           map.put("id", id);
           map.put("username",username);
     
   		List<User> userList=userService.searchUser(map);
   		model.addAttribute("userList", userList);
   		for(User u:userList)
   		{
   			System.out.println("id:"+u.getId());
   			System.out.println("username:"+u.getUsername());
   			System.out.println("password:"+u.getPassword());
   			System.out.println("email:"+u.getEmail());
   		}
   		
   		return "user/userList";
   	}
    @RequestMapping("baseInfo")
	public String goBaseInfo()
	{
		return "user/baseInfo";
		
	}
    @RequestMapping("realNameAuth")
   	public String goRealNameAuth()
   	{
   		return "user/realNameAuth";
   		
   	}
    @RequestMapping("studentAuth")
   	public String goStudentAuth()
   	{
   		return "user/studentAuth";
   		
   	}
    
    @RequestMapping("myfile")
	public String goMyfile()
	{
		return "user/myFile";
		
	}
    @RequestMapping("assignTopics")
   	public String goAssignTopics()
   	{
   		return "user/assignTopics";
   		
   	}
      */ 
	@RequestMapping("testProcess")
	
	public String testProcess(Model model) {
		int a=userService.test();
		model.addAttribute("a", a);
		
		return "index";
	}
	
	
    
    
    
    
}
