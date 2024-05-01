package com.spring.orm.dao;

import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import com.spring.orm.DetailsBean;

public class DetailsDaoImp implements DetailsDao{
	
	private HibernateTemplate hibernateTemplate;
	public DetailsDaoImp() {
		super();
	}
	public DetailsDaoImp( HibernateTemplate hibernateTemplate) {
		super();
		this.hibernateTemplate=hibernateTemplate;
	}
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate=hibernateTemplate;
	}
	public HibernateTemplate getHibernateTemplate() {
		return this.hibernateTemplate;
	}
	

	@Override
	@Transactional
	public int saveDetails(DetailsBean detailsBean) {
		int savedetails = (int) hibernateTemplate.save(detailsBean);
		return savedetails;
	}

	@Override
	@Transactional
	public DetailsBean viewDetails(int id) {
		DetailsBean dtb =hibernateTemplate.get(DetailsBean.class,id);
		return dtb;
	}

	@Override
	@Transactional
	public void updateDetails(DetailsBean detailsBean) {
		hibernateTemplate.update(detailsBean);;
		
	}

	@Override
	@Transactional
	public void deleteDetails(int id) {
		DetailsBean det = hibernateTemplate.get(DetailsBean.class,id);
		if(det!=null)
		{
			hibernateTemplate.delete(det);
		}
		
	}

	@Override
	@Transactional
	public List<DetailsBean> detailsAll() {
		List<DetailsBean> dts = hibernateTemplate.loadAll(DetailsBean.class);
		return dts;
	}

}
