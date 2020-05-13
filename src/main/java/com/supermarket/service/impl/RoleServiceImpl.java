package com.supermarket.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.supermarket.dao.RoleDao;
import com.supermarket.entity.Role;
import com.supermarket.service.RoleService;

@Service("roleService")
public class RoleServiceImpl implements RoleService {

	@Resource
	private RoleDao roleDao;

	public Role findByRoleName(Integer id) {
		return roleDao.findByRoleName(id);
	}

	public List<Role> findAll(Map<String, Object> map) {
		return roleDao.findAll(map);
	}

	public Long count(Map<String, Object> map) {
		return roleDao.count(map);
	}

	public Role findRepeat(String roleName) {
		return roleDao.findRepeat(roleName);
	}

	public Integer add(Role role) {
		return roleDao.add(role);
	}

	public Integer delete(Integer id) {
		return roleDao.delete(id);
	}

	public Integer update(Role role) {
		return roleDao.update(role);
	}

}
