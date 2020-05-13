package com.supermarket.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.supermarket.dao.SupplierDao;
import com.supermarket.entity.Supplier;
import com.supermarket.service.SupplierService;

@Service("supplierService")
public class SupplierServiceImpl implements SupplierService {

	@Resource
	private SupplierDao supplierDao;

	public List<Supplier> findAll(Map<String, Object> map) {
		return supplierDao.findAll(map);
	}

	public Long count(Map<String, Object> map) {
		return supplierDao.count(map);
	}

	public Integer add(Supplier supplier) {
		return supplierDao.add(supplier);
	}

	public Supplier findRepeat(String name) {
		return supplierDao.findRepeat(name);
	}

	public Integer delete(Integer id) {
		return supplierDao.delete(id);
	}

	public Integer update(Supplier supplier) {
		return supplierDao.update(supplier);
	}

}
