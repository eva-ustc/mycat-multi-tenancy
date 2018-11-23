package ustc.sse.mycat.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import ustc.sse.mycat.domain.User;

import java.util.List;

/**
 * @author LRK
 * @project_name mycat-multitenent
 * @package_name ustc.sse.mycat.mapper
 * @date 2018/11/23 18:16
 * @description God Bless, No Bug!
 */
@Mapper
public interface UserMapper {
    @Insert("insert into user(id,name) value (#{id},#{name})")
    int insert(User user);
    @Select("select * from user")
    List<User> selectAll();

}
