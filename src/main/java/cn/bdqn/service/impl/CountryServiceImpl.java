package cn.bdqn.service.impl;

import cn.bdqn.entity.Country;
import cn.bdqn.mapper.CountryMapper;
import cn.bdqn.service.ICountryService;
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
public class CountryServiceImpl extends ServiceImpl<CountryMapper, Country> implements ICountryService {

}
