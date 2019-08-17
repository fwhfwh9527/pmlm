package cn.bdqn.service.impl;

import cn.bdqn.entity.Address;
import cn.bdqn.mapper.AddressMapper;
import cn.bdqn.service.IAddressService;
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
public class AddressServiceImpl extends ServiceImpl<AddressMapper, Address> implements IAddressService {

}
