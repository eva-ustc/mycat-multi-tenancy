package ustc.sse.mycat.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import ustc.sse.mycat.domain.User;
import ustc.sse.mycat.mapper.UserMapper;

import java.util.List;

/**
 * @author LRK
 * @project_name mycat-multitenent
 * @package_name ustc.sse.controller
 * @date 2018/11/23 18:15
 * @description God Bless, No Bug!
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserMapper userMapper=null;
    @RequestMapping("/save")
    public String save(User user){
        userMapper.insert(user);
        return "save successfully";
    }
    @RequestMapping("/list")
    @ResponseBody
    public List<User> selectAll(){
        return userMapper.selectAll();
    }

}
