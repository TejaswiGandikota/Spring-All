package com.spring.orm.dao;

import java.util.List;

import com.spring.orm.DetailsBean;

public interface DetailsDao {
         public int saveDetails(DetailsBean detailsBean);
         public DetailsBean viewDetails(int id);
         public void updateDetails(DetailsBean detailsBean);
         public void deleteDetails(int id);
         public List<DetailsBean> detailsAll();
         
}
