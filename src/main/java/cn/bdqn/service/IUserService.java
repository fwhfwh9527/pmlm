package cn.bdqn.service;

import cn.bdqn.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author YangZhiJie
 * @since 2019-08-15
 */
public interface IUserService extends IService<User> {
    /**
     * <p>
     *  登陆方法
     * </p>
     *
     * @param user 需要校验的user对象
     * @return 查询到的User，未查询到返回null
     */
    User getUser(User user);

    /**
     * <p>
     *  注册方法
     * </p>
     *
     * @param user 需要校验的user对象
     * @return 注册成功返回1，失败返回0
     */
    int addUser(User user);
}
