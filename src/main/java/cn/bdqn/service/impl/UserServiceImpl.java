package cn.bdqn.service.impl;

import cn.bdqn.entity.User;
import cn.bdqn.mapper.UserMapper;
import cn.bdqn.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author YangZhiJie
 * @since 2019-08-15
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

    @Resource
    private UserMapper userMapper;

    //登陆
    @Override
    public User getUser(User user) {
        List<User> userList = userMapper.selectList(null);
        User u = null;
        for (User us: userList) {
            if (user.getuAccount() == us.getuAccount()){
                if (user.getuPassword() == us.getuPassword()) u = us;
            }
        }
        return u;
    }

    //注册
    @Override
    public int addUser(User user) {
        return userMapper.insert(user);
    }
}
