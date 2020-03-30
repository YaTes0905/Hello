package com.yc.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.yc.domain.Good;
import com.yc.domain.Shop;

@Repository
public interface SGMapper {
	/**
	 * 
	 * @param keyword 
	 * @Title: getList 
	 * @Description: �б�
	 * @return
	 * @return: List<Shop>
	 */
	List<Shop> getList(String keyword);
	/**
	 * 
	 * @Title: getGoods 
	 * @Description: ��ȡ��Ʒ����
	 * @return
	 * @return: List<Good>
	 */
	List<Good> getGoods();
	/**
	 * 
	 * @Title: addShop 
	 * @Description: ������̺��м��
	 * @param shop
	 * @return: void
	 */
	void addShop(Shop shop);
	void addCenter(@Param("sid")int sid, @Param("idss")int[] idss);
	Shop Shopdetails(int sid);
	void delCenter(int i);
	void delShop(int i);
	
}
