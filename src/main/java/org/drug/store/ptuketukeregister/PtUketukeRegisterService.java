package org.drug.store.ptuketukeregister;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.sql.Timestamp;
import org.drug.store.common.DrugCommonUtil;
import org.drug.store.mapper.PtUketukeMapper;
import org.drug.store.mapper.PtUserMapper;
import org.drug.store.ptuserlist.PtUser;

@Service
@Transactional
public class PtUketukeRegisterService {
	
	@Autowired
	private PtUketukeMapper ptUketukeMapper;

	@Autowired
	PtUserMapper ptUserMapper;

	public List<PtUser> getUserList() {
		List<PtUser> userList = ptUserMapper.selectAll();
		return userList;
	}
	
	public void insertUketuke(PtUketukeRegisterForm uketuke) {
		PtUketukeRegister ptUketuke = new PtUketukeRegister();

		String year = uketuke.getBirthdayDtYear();
		String month = uketuke.getBirthdayDtMonth();
		String day = uketuke.getBirthdayDtDay();
		month = String.format("%02d", Integer.parseInt(month));
		day = String.format("%02d", Integer.parseInt(day));
		Timestamp tsBirthdayDt = DrugCommonUtil.dateStringToTimestamp(year+month+day);

		ptUketuke.setPtName(uketuke.getPtName());
		ptUketuke.setBirthdayDt(tsBirthdayDt);
		ptUketuke.setGenderFlg(uketuke.getGenderFlg());

		ptUketukeMapper.insert_pt_tran(ptUketuke);
	}

}
