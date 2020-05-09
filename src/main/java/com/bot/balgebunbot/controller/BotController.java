package com.bot.balgebunbot.controller;

import com.bot.balgebunbot.model.*;
import com.bot.balgebunbot.service.BotService;
import com.bot.balgebunbot.model.Purchase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/database")
public class BotController {

    @Autowired
    private final BotService botService;

    public BotController(BotService botService){
        this.botService = botService;
    }

    @PostMapping("/customer")
    public ResponseEntity createCustomer(@RequestBody Customer customer) {
        return ResponseEntity.ok(botService.addCustomer(customer));
    }

    @GetMapping("/customer")
    public ResponseEntity<List<Customer>> findAllCustomer() {
        return ResponseEntity.ok(botService.getAllCustomer());
    }

    @GetMapping("/customer/{username}")
    public ResponseEntity<Customer> findCustomerById(@PathVariable String username) {
        return ResponseEntity.of(botService.getCustomer(username));
    }

    @PutMapping("/customer/{username}")
    public ResponseEntity<Customer> updateCustomer(@PathVariable String  username, @RequestBody Customer customer) {
        botService.deleteCustomer(username);
        return ResponseEntity.ok(botService.addCustomer(customer));
    }

    @DeleteMapping("/customer/{username}")
    public ResponseEntity deleteCustomer(@PathVariable String  username) {
        botService.deleteCustomer(username);
        return ResponseEntity.ok("ok jek customer udah di dele kang.");
    }

    @PostMapping(path = "/seller", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity createSeller(@RequestBody Seller seller) {
        return ResponseEntity.ok(botService.addSeller(seller));
    }

    @GetMapping("/seller")
    public ResponseEntity<List<Seller>> findAllSeller() {
        return ResponseEntity.ok(botService.getAllSeller());
    }

    @GetMapping("/seller/{username}")
    public ResponseEntity<Seller> findSellerById(@PathVariable String  username) {
        return ResponseEntity.of(botService.getSeller(username));
    }

    @PutMapping("/seller/{username}")
    public ResponseEntity<Seller> updateSeller(@PathVariable String username, @RequestBody Seller seller) {
        botService.deleteSeller(username);
        return ResponseEntity.ok(botService.addSeller(seller));
    }

    @DeleteMapping("/seller/{username}")
    public ResponseEntity deleteSeller(@PathVariable String username) {
        botService.deleteSeller(username);
        return ResponseEntity.ok("ok jek seller udah di dele kang.");
    }

    @PostMapping("/item")
    public ResponseEntity createItem(@RequestBody Item item) {
        return ResponseEntity.ok(botService.addItem(item));
    }

    @GetMapping("/item")
    public ResponseEntity<List<Item>> findAllItem() {
        return ResponseEntity.ok(botService.getAllItem());
    }

    @GetMapping("/item/{itemID}")
    public ResponseEntity<Item> findItemById(@PathVariable String itemID) {
        return ResponseEntity.of(botService.getItem(itemID));
    }

    @PutMapping("/item/{itemID}")
    public ResponseEntity<Item> updateItem(@PathVariable String itemID, @RequestBody Item item) {
        botService.deleteItem(itemID);
        return ResponseEntity.ok(botService.addItem(item));
    }

    @DeleteMapping("/item/{itemID}")
    public ResponseEntity deleteItem(@PathVariable String itemID) {
        botService.deleteItem(itemID);
        return ResponseEntity.ok("ok jek item udah di dele kang.");
    }

    @PostMapping("/review")
    public ResponseEntity createReview(@RequestBody Review review) {
        return ResponseEntity.ok(botService.addReview(review));
    }

    @GetMapping("/review")
    public ResponseEntity<List<Review>> findAll() {
        return ResponseEntity.ok(botService.getAllReview());
    }

    @GetMapping("/review/{reviewID}")
    public ResponseEntity<Review> findReviewById(@PathVariable String reviewID) {
        return ResponseEntity.of(botService.getReview(reviewID));
    }

    @PutMapping("/review/{reviewID}")
    public ResponseEntity<Review> updateReview(@PathVariable String reviewID, @RequestBody Review review) {
        botService.deleteReview(reviewID);
        return ResponseEntity.ok(botService.addReview(review));
    }

    @DeleteMapping("/review/{reviewID}")
    public ResponseEntity delete(@PathVariable String reviewID) {
        botService.deleteReview(reviewID);
        return ResponseEntity.ok("ok jek review udah di dele kang.");
    }

    @PostMapping("/purchase")
    public ResponseEntity createPurchase(@RequestBody Purchase purchase){
        return ResponseEntity.ok(botService.addPurchase(purchase));
    }

    @GetMapping("/purchase")
    public ResponseEntity<List<Purchase>> findAllPurchase(){
        return ResponseEntity.ok(botService.getAllPurchase());
    }

    @PutMapping("/purchase/{purchaseID}")
    public ResponseEntity<Purchase> updatePurchase(@PathVariable String purchaseID, @RequestBody Purchase purchase){
        botService.deletePurchase(purchaseID);
        return ResponseEntity.ok(botService.addPurchase(purchase));
    }

    @DeleteMapping("/purchase/{purchaseID}")
    public ResponseEntity deletePurchase (@PathVariable String purchaseID){
        botService.deletePurchase(purchaseID);
        return ResponseEntity.ok("ok jek purchase udah di dele kang.");
    }

    @GetMapping("/purchase/customer/{customerID}")
    public ResponseEntity<List<Purchase>> findPurchaseFromCustomer(@PathVariable String customerID){
        return ResponseEntity.ok(botService.getPurchaseFromCustomer(customerID));
    }

}
