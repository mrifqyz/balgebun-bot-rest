package com.bot.balgebunbot.service;

import com.bot.balgebunbot.model.*;
import com.bot.balgebunbot.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BotServiceImpl implements BotService {
    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private SellerRepository sellerRepository;

    @Autowired
    private ItemRepository itemRepository;

    @Autowired
    private ReviewRepository reviewRepository;

    @Autowired
    private PurchaseRepository purchaseRepository;

    @Override
    public Optional<Customer> getCustomer(String id) {
        return customerRepository.findById(id);
    }

    @Override
    public Optional<Item> getItem(String itemID) {
        return itemRepository.findById(itemID);
    }

    @Override
    public Optional<Seller> getSeller(String id) {
        return sellerRepository.findById(id);
    }

    @Override
    public Optional<Review> getReview(String reviewID) {
        return reviewRepository.findById(reviewID);
    }

    @Override
    public Optional<Purchase> getPurchase(String purchaseID){
        return purchaseRepository.findById(purchaseID);
    }

    @Override
    public Item addItem(Item item) {
        itemRepository.save(item);
        return item;
    }

    @Override
    public Seller addSeller(Seller seller) {
        sellerRepository.save(seller);
        return seller;
    }

    @Override
    public Customer addCustomer(Customer customer) {
        customerRepository.save(customer);
        return customer;
    }

    @Override
    public Review addReview(Review review) {
        reviewRepository.save(review);
        return review;
    }

    @Override
    public void deleteCustomer(String id) {
        customerRepository.deleteById(id);
    }

    @Override
    public void deleteSeller(String id) {
        sellerRepository.deleteById(id);
    }

    @Override
    public void deleteItem(String itemID) {
        itemRepository.deleteById(itemID);
    }

    @Override
    public void deleteReview(String reviewID) {
        reviewRepository.deleteById(reviewID);
    }

    @Override
    public Item updateItem(Item item) {
        itemRepository.save(item);
        return item;
    }

    @Override
    public Customer updateCustomer(Customer customer) {
        customerRepository.save(customer);
        return customer;
    }

    @Override
    public Review updateReview(Review review) {
        reviewRepository.save(review);
        return review;
    }

    @Override
    public Seller updateSeller(Seller seller) {
        sellerRepository.save(seller);
        return seller;
    }

    @Override
    public List<Customer> getAllCustomer() {
        return customerRepository.findAll();
    }

    @Override
    public List<Item> getAllItem() {
        return itemRepository.findAll();
    }

    @Override
    public List<Seller> getAllSeller() {
        return sellerRepository.findAll();
    }

    @Override
    public List<Review> getAllReview() {
        return reviewRepository.findAll();
    }

    @Override
    public List<Purchase> getAllPurchase(){
        return purchaseRepository.findAll();
    }

    public Purchase updatePurchase(Purchase purchase){
        purchaseRepository.save(purchase);
        return purchase;
    }

    public Purchase addPurchase(Purchase purchase){
        purchaseRepository.save(purchase);
        return purchase;
    }
    public void deletePurchase(String id){
        purchaseRepository.deleteById(id);
    }

    public List<Purchase> getPurchaseFromCustomer(String customerID){
        return purchaseRepository.findAllPurchaseByCustomerID(customerID);
    }
    public List<Purchase> getPurchaseFromSeller(String sellerID){
        return purchaseRepository.findAllPurchaseBySellerID(sellerID);
    }
}
