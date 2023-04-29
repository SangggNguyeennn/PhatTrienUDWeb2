package till.edu.QuanLyMyPham.controller;

import org.springframework.stereotype.Controller;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import till.edu.QuanLyMyPham.entities.Product;
import till.edu.QuanLyMyPham.repository.ProductRepository;



@Controller
public class ProductController {
	@Autowired
	  private ProductRepository productRepository;
	  @RequestMapping(value={"/", "/product-list"})
	  public String listProduct(Model model) {
	    model.addAttribute("listProduct", productRepository.findAll());
	    return "product-list";
	  }
	  @RequestMapping("/product-save")
	  public String insertProduct(Model model) {
	    model.addAttribute("product", new Product());
	    return "product-save";
	  }
	  @RequestMapping("/product-view/{id}")
	  public String viewProduct(@PathVariable int id, Model model) {
	    Optional<Product> product = productRepository.findById(id);
	    if (product.isPresent()) {
	      model.addAttribute("product", product.get());
	    }
	    return "product-view";
	  }
	  
	  @RequestMapping("/product-update/{id}")
	  public String updateProduct(@PathVariable int id, Model model) {
	    Optional<Product> product = productRepository.findById(id);
	    if (product.isPresent()) {
	      model.addAttribute("product", product.get());
	    }
	    return "product-update";
	  }
	  @RequestMapping("/saveProduct")
	  public String doSaveProduct(@ModelAttribute("product") Product product, Model model) {
	    productRepository.save(product);
	    model.addAttribute("listProduct", productRepository.findAll());
	    return "product-list";
	  }
	  @RequestMapping("/updateProduct")
	  public String doUpdateProduct(@ModelAttribute("product")Product product, Model model) {
	    productRepository.save(product);
	    model.addAttribute("listProduct", productRepository.findAll());
	    return "product-list";
	  }
	  
	  @RequestMapping("/ProductDelete/{id}")
	  public String doDeleteProduct(@PathVariable int id, Model model) {
	    productRepository.deleteById(id);
	    model.addAttribute("listProduct", productRepository.findAll());
	    return "product-list";
	  }
	
}