/*
 * Copyright [2020-2030] [https://www.stylefeng.cn]
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * Guns采用APACHE LICENSE 2.0开源协议，您在使用过程中，需要注意以下几点：
 *
 * 1.请不要删除和修改根目录下的LICENSE文件。
 * 2.请不要删除和修改Guns源码头部的版权声明。
 * 3.请保留源码和相关描述文件的项目出处，作者声明等。
 * 4.分发源码时候，请注明软件出处 https://gitee.com/stylefeng/guns
 * 5.在修改包名，模块名称，项目代码等时，请注明软件出处 https://gitee.com/stylefeng/guns
 * 6.若您的项目无法满足以上几点，可申请商业授权
 */
package cn.stylefeng.roses.kernel.system.modular.user.service;

import cn.stylefeng.roses.kernel.system.modular.user.entity.SysUserDataScope;
import cn.stylefeng.roses.kernel.system.api.pojo.user.request.SysUserRequest;
import cn.stylefeng.roses.kernel.system.api.pojo.user.request.UserDataScopeRequest;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * 系统用户数据范围service接口
 *
 * @author luojie
 * @date 2020/11/6 10:28
 */
public interface SysUserDataScopeService extends IService<SysUserDataScope> {

    /**
     * 新增
     *
     * @param userDataScopeRequest 参数对象
     * @author chenjinlong
     * @date 2021/1/26 12:52
     */
    void add(UserDataScopeRequest userDataScopeRequest);

    /**
     * 删除
     *
     * @param userDataScopeRequest 参数对象
     * @author chenjinlong
     * @date 2021/1/26 12:52
     */
    void del(UserDataScopeRequest userDataScopeRequest);

    /**
     * 根据 用户id 删除
     *
     * @param userId 用户id
     * @author chenjinlong
     * @date 2021/1/26 12:52
     */
    void delByUserId(Long userId);

    /**
     * 修改
     *
     * @param userDataScopeRequest 参数对象
     * @author chenjinlong
     * @date 2021/1/26 12:52
     */
    void edit(UserDataScopeRequest userDataScopeRequest);

    /**
     * 查询-详情-根据主键id
     *
     * @param userDataScopeRequest 参数对象
     * @author chenjinlong
     * @date 2021/1/26 12:52
     */
    SysUserDataScope detail(UserDataScopeRequest userDataScopeRequest);

    /**
     * 获取用户的数据范围id集合
     *
     * @param uerId 用户id
     * @return 数据范围id集合
     * @author luojie
     * @date 2020/11/6 15:01
     */
    List<Long> findOrgIdsByUserId(Long uerId);

    /**
     * 查询-列表-按实体对象
     *
     * @param userDataScopeRequest 参数对象
     * @author chenjinlong
     * @date 2021/1/26 12:52
     */
    List<SysUserDataScope> findList(UserDataScopeRequest userDataScopeRequest);

    /**
     * 分配数据范围
     *
     * @author chenjinlong
     * @date 2021/2/3 15:49
     */
    void assignData(SysUserRequest sysUserRequest);

}
