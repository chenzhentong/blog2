package per.czt.myblog.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import per.czt.myblog.dao.UserDao;

@Repository("userService")
public class UserServiceImpl implements UserService {
	@Resource
	private UserDao userDao;

	@Override
	public int test() {
		// TODO Auto-generated method stub
		System.out.println(userDao);
	    return userDao.test();

	}

}
