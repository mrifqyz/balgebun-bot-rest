package com.bot.balgebunbot.service;

import com.bot.balgebunbot.model.*;

import java.util.List;
import java.util.Optional;

public interface BotService {
    public List<Customer> getAllCustomer();
    public List<Seller> getAllSeller();
    public List<Review> getAllReview();
    public List<Item> getAllItem();
    public List<Purchase> getAllPurchase();
    public Seller updateSeller(Seller seller);
    public Optional<Seller> getSeller(String id);
    public Seller addSeller(Seller seller);
    public void deleteSeller(String id);
    public Customer updateCustomer(Customer customer);
    public Optional<Customer> getCustomer(String id);
    public Customer addCustomer(Customer customer);
    public void deleteCustomer(String id);
    public Item addItem(Item item);
    public Optional<Item> getItem(String itemID);
    public Item updateItem(Item item);
    public void deleteItem(String itemID);
    public Review addReview(Review review);
    public Optional<Review> getReview(String reviewID);
    public Review updateReview(Review review);
    public void deleteReview(String reviewID);
    public Purchase updatePurchase(Purchase purchase);
    public Optional<Purchase> getPurchase(String id);
    public Purchase addPurchase(Purchase purchase);
    public void deletePurchase(String id);
    public List<Purchase> getPurchaseFromCustomer(String customerID);
    public List<Purchase> getPurchaseFromSeller(String sellerID);
}
