import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;
import com.zyp.model.User;
import com.zyp.service.IUserService;
import com.zyp.service.UserServiceImpl;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})  
public class test {
	@Resource
	private IUserService userService;
	@Test
	public void test1()
	{
		UserServiceImpl userImpl = new UserServiceImpl();
		try{
		User user = userService.getUserById(1);
//		User user2 = new User();
//		user2.setAge(11);
//		user2.setId(2);
//		user2.setUserName("zyp");
//		user2.setPassword("123456");
//		userService.InsertUser(user2);
		System.out.println(JSON.toJSONString(user));
		}
		catch(Exception e)
		{
			System.out.println(e.toString());
		}
	}
}
