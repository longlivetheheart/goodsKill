package org.seckill.service.mp.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.apache.dubbo.config.annotation.Service;
import org.seckill.api.service.RoleService;
import org.seckill.entity.Role;
import org.seckill.mp.dao.mapper.RoleMapper;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author heng
 * @since 2019-09-07
 */
@Service(
        version = "${demo.service.version}",
        application = "${dubbo.application.id}",
        protocol = "${dubbo.protocol.id}",
        registry = "${dubbo.registry.id}"
)
public class RoleServiceImpl extends ServiceImpl<RoleMapper, Role> implements RoleService {

}