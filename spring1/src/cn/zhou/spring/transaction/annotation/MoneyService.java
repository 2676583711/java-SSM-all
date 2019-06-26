package cn.zhou.spring.transaction.annotation;

import org.springframework.transaction.annotation.Transactional;

@Transactional
public class MoneyService {

	private MoneyDao dao;

	public void setDao(MoneyDao dao) {
		this.dao = dao;
	}

	public void moneyManager() {

		dao.less();

//		int i = 5;
//		int s;
//		s = i / 0;

		dao.more();

	}

}
