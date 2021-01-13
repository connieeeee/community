package bit.com.a.service.impl;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bit.com.a.dao.ProductDao;
import bit.com.a.dto.ProductDto;
import bit.com.a.service.ProductService;
@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	ProductDao dao;
	
	@Override
	public List<ProductDto> getProductList(String id) {
		return dao.getProductList(id);
	}

	@Override
	public List<ProductDto> get_product_sort_list(String id) {
		return dao.get_product_sort_list(id);
	}

	@Override
	public List<ProductDto> get_product_unit_cate(String id) {
		return dao.get_product_unit_cate(id);
	}

	@Override
	public void add_product(ProductDto dto) {
		dao.add_product(dto);
	}

	@Override
	public ProductDto get_product_inform(int product_seq) {
		return dao.get_product_inform(product_seq);
	}

	@Override
	public void update_product_inform(ProductDto dto) {
		dao.update_product_inform(dto);
	}

	@Override
	public void delete_product(int product_seq) {
		dao.delete_product(product_seq);
	}

}
