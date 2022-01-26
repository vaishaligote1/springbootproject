package com.cjc.main.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.main.model.Student;
import com.cjc.main.repository.HomeRepository;
import com.cjc.main.service.HomeService;

@Service
public class HomeServiceImpl implements HomeService{
	
	@Autowired
	HomeRepository hr;

	@Override
	public Student saveData(Student s) {
		// TODO Auto-generated method stub
		return hr.save(s);
	}

	@Override
	public Student logincheck(String un, String ps) {
		// TODO Auto-generated method stub
		return hr.findByUnameAndPassword(un, ps);
	}

	@Override
	public Iterable<Student> displayAll() {
		// TODO Auto-generated method stub
		return hr.findAll();
	}

	@Override
	public void DeleteData(Student s) {
		hr.delete(s);
		
	}

	@Override
	public Student editData(int uid) {
		// TODO Auto-generated method stub
		return hr.findByUid(uid);
	}

}
