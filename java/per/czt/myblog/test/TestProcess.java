package per.czt.myblog.test;

import javax.annotation.Resource;

import per.czt.myblog.service.UserService;
import per.czt.myblog.service.UserServiceImpl;

public class TestProcess {
	@Resource
	private static UserService userService;

	public static void main(String[] args) {
		
		int a=userService.test();
		System.out.println(a);
	
		
		// TODO Auto-generated method stub
		

	}

}
