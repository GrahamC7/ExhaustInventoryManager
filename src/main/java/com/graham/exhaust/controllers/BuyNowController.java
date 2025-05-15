package com.graham.exhaust.controllers;

import com.graham.exhaust.domain.Product;
import com.graham.exhaust.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
public class BuyNowController {
    @Autowired
    private ProductRepository productRepository;

    @GetMapping("/buyProduct")
    public String buyProduct(@RequestParam("productID") Long theID, Model model) {
        Optional<Product> productToBuy = productRepository.findById(theID);

        if (productToBuy.isPresent()) {
            // product in stock check
            Product product = productToBuy.get();

            if (product.getInv() > 0) {
                // product currently in stock check
                product.setInv(product.getInv() - 1); // stock decrementing
                productRepository.save(product); // saving current product database

                return "/purchaseSuccess"; // purchase successful
            }
            else {
                return "/purchaseFailure"; // purchase failure
            }
        }
        else {
            return "/purchaseFailure"; // purchase failure due to product not found in inventory
        }
    }

}
