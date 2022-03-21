package com.example.demo.Service;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import com.example.demo.Model.Product;
import com.example.demo.Repository.ProductRepository;
@Validated
@Service
public class ProductService{
	@Autowired
    private ProductRepository productRepository;
	
	public List<Product> getAllEmployees(Integer pageNo, Integer pageSize, String sortBy) {
		{
	        Pageable paging = PageRequest.of(pageNo, pageSize, Sort.by(sortBy));
	 
	        Page<Product> pagedResult = productRepository.findAll(paging);
	         
	        if(pagedResult.hasContent()) {
	            return pagedResult.getContent();
	        } else {
	            return new ArrayList<Product>();
	        }
	    }
		
	}
	
	 public Product saveProduct(Product product){
	        return productRepository.save(product);
	    }
	    public List<Product> saveProducts(List<Product> products){
	        return (List<Product>) productRepository.saveAll(products);
	    }
	    public List<Product> getProducts(){
	        return  (List<Product>) productRepository.findAll();
	    }
	    
	    public String deleteProduct(int schemeSerialNo){
	    	productRepository.deleteById(schemeSerialNo);
	        return "Deleted!";
	    }
		public Product getProductByschemeSerialNo(int schemeSerialNo) {
			return productRepository.findById(schemeSerialNo);
		}
	         
	 public Product updateProduct(Product product){
	        Product existingProduct= productRepository.findById((int) product.getschemeSerialNo());
	        existingProduct.setagentGroupCode((String)product.getagentGroupCode());
	        existingProduct.setcompanyCode ((String)product.getcompanyCode());
	        existingProduct.setlOBCode((String)product.getlOBCode()); 
	        existingProduct.setproductCode((String)product.getproductCode());
	        existingProduct.setschemeCode((String)product.getschemeCode());
	        existingProduct.setschemeColor((String)product.getschemeColor());
	        existingProduct.setfilterYN((String)product.getfilterYN());
	        existingProduct.setyear((int)product.getyear());
	        existingProduct.setshowRateYN((String)product.getshowRateYN());
	        existingProduct.setapprCheck((String)product.getapprCheck());
	        existingProduct.setdedEnableYN((String)product.getdedEnableYN());
	        existingProduct.setdescriptionEnableYN((String)product.getdescriptionEnableYN());
	        existingProduct.setfeesEnableYN((String)product.getfeesEnableYN());
	        existingProduct.setloadEnableYN((String)product.getloadEnableYN());
	        existingProduct.setdrvEnableYN((String)product.getdrvEnableYN());
	        existingProduct.settakeFulYN((String)product.gettakeFulYN());
	        existingProduct.setrenoldRateYN((String)product.getrenoldRateYN());
	        existingProduct.setdrvLICYn((String)product.getdrvLICYn());
	        existingProduct.setbestBuyYN((String)product.getbestBuyYN());
	        existingProduct.setschemeoldColor((String)product.getschemeoldColor());
	        existingProduct.seteffectiveFromDate((Date)product.geteffectiveFromDate());
	        existingProduct.seteffectiveToDate((Date)product.geteffectiveToDate());



			return productRepository.save(existingProduct);
	        
	 }
	
	 
	}
	


	
	
		 
	


