package com.spring.boot.app;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.spring.boot.app.controller.CategoryController;
import com.spring.boot.app.controller.ProductController;
import com.spring.boot.app.model.Category;
import com.spring.boot.app.model.Product;

@SpringBootApplication
public class ProductsCategoriesApplication implements CommandLineRunner {

	@Autowired
	private ProductController productController;

	@Autowired
	private CategoryController categoryController;

	public static void main(String[] args) {
		SpringApplication.run(ProductsCategoriesApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		System.out.println("\n\n Data of Products Entity\n\n");
		addProducts(createProducts());

		System.out.println("\n\n Data of Categories Entity\n\n");
		addCategories(createCategories());
	}

	// method to add Product
	private void addProducts(List<Product> products) {
		for (Product product : products) {
			productController.save(product);
		}
	}

	// method to create List of Product
	private List<Product> createProducts() {
		List<Product> products = new ArrayList<Product>();

		Product p1 = new Product("Kit-Kat", 25, 50, false, null);

		Product p2 = new Product("Choco Jewels", 5, 200, false, null);

		Product p3 = new Product("Burbon", 25, 30, false, null);

		Product p4 = new Product("Butter Bake", 5, 70, false, null);

		Product p5 = new Product("Saree", 2400, 300, false, null);

		Product p6 = new Product("Sharara", 5000, 20, true, null);

		Product p7 = new Product("Sherwaani", 12000, 80, false, null);

		Product p8 = new Product("Boots for women", 1000, 86, false, null);

		Product p9 = new Product("Ankle shoes", 1200, 63, true, null);

		Product p10 = new Product("Oreo", 20, 50, false, null);

		Product p11 = new Product("Dairy Milk", 80, 20, false, null);

		Product p12 = new Product("Sandals", 2500, 115, false, null);

		products.add(p1);
		products.add(p2);
		products.add(p3);
		products.add(p4);
		products.add(p5);
		products.add(p6);
		products.add(p7);
		products.add(p8);
		products.add(p9);
		products.add(p10);
		products.add(p11);
		products.add(p12);

		return products;
	}

	// method to add Category
	private void addCategories(List<Category> categories) {
		for (Category category : categories) {
			categoryController.save(category);
		}
	}

	// method to create List of Category
	private List<Category> createCategories() {
		List<Category> categories = new ArrayList<Category>();

		Category c1 = new Category("Soft Drinks", "Give refreshment", null);

		Category c2 = new Category("Biscuits", "Sweet-salty and crispy cookies", null);

		Category c3 = new Category("Ethenic Wear", "Suitable for all occasions", null);

		Category c4 = new Category("Footwear", "rough-tough and durable", null);

		categories.add(c1);
		categories.add(c2);
		categories.add(c3);
		categories.add(c4);

		return categories;
	}
}
