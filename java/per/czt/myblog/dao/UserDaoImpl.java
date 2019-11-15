package per.czt.myblog.dao;

import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;



@Repository("userDao")
public class UserDaoImpl extends SqlSessionDaoSupport implements UserDao {
	
	

	@Override
	public int test() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	

}
