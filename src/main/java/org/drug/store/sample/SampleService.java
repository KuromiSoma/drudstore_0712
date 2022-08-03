package org.drug.store.sample;

import java.util.List;
import java.util.Map;

import org.apache.catalina.User;
import org.drug.store.UserMapper;
import org.drug.store.ptuserlist.PtUser;
import org.drug.store.ptuserlist.PtUserForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;

@Service
@Transactional
public class SampleService {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public List<User> getUserList() {
		List<User> userList = (List<User>) jdbcTemplate.queryForObject("select * from java_user.user", new UserMapper());

		return userList;
	}

	public boolean insertUser(Model model, @ModelAttribute  PtUserForm userForm) {
		jdbcTemplate.update("INSERT INTO java_user.user(name,nm_add,nk_tel) VALUES(?,?,?)",userForm.getPtName(),userForm.getNm_add(),userForm.getNk_tel());
		return true;
	}
}