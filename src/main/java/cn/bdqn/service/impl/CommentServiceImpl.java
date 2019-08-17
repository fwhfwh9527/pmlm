package cn.bdqn.service.impl;

import cn.bdqn.entity.Comment;
import cn.bdqn.mapper.CommentMapper;
import cn.bdqn.service.ICommentService;
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
public class CommentServiceImpl extends ServiceImpl<CommentMapper, Comment> implements ICommentService {

}
