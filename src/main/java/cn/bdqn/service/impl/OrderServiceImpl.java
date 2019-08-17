package cn.bdqn.service.impl;

import cn.bdqn.entity.Order;
import cn.bdqn.mapper.OrderMapper;
import cn.bdqn.service.IOrderService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author YangZhiJie
 * @since 2019-08-15
 */
@Service
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order> implements IOrderService {

}
