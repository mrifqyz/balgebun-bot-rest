package com.bot.balgebunbot.service;

import com.bot.balgebunbot.service.BotServiceImpl;
import com.bot.balgebunbot.model.Customer;
import com.bot.balgebunbot.model.Item;
import com.bot.balgebunbot.model.Review;
import com.bot.balgebunbot.model.Seller;
import com.bot.balgebunbot.repository.CustomerRepository;
import com.bot.balgebunbot.repository.ItemRepository;
import com.bot.balgebunbot.repository.ReviewRepository;
import com.bot.balgebunbot.repository.SellerRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import java.util.List;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class BotServiceImplTest {
    @Mock
    private CustomerRepository customerRepository;

    @Mock
    private ItemRepository itemRepository;

    @Mock
    private SellerRepository sellerRepository;

    @Mock
    private ReviewRepository reviewRepository;

    @InjectMocks
    private BotServiceImpl botService;

    Customer customer;
    Seller seller;
    Item item;
    Review review;

    @BeforeEach
    public void setUp(){
        customer = new Customer("mrifqyz17", "cinoy", "087777535288");
        seller = new Seller("subur", "arya wiguna", "14045170700",
                "SAW", "14045170700");
        item = new Item(1, "NGP", "Nasi Goreng Pedas", 12000, seller);
        review = new Review("R01", "Jelek", item);
    }

    @Test
    public void testCustomerRepositoryAddCustomer(){
        botService.addCustomer(customer);
        lenient().when(botService.addCustomer(customer)).thenReturn(customer);
    }

    @Test
    public void testSellerRepositoryAddSeller(){
        botService.addSeller(seller);
        lenient().when(botService.addSeller(seller)).thenReturn(seller);
    }

    @Test
    public void testItemRepositoryAddItem(){
        botService.addItem(item);
        lenient().when(botService.addItem(item)).thenReturn(item);
    }

    @Test
    public void testReviewRepositoryAddReview(){
        botService.addReview(review);
        lenient().when(botService.addReview(review)).thenReturn(review);
    }

    @Test
    public void testCustomerRepositoryGetCustomer(){
        botService.addCustomer(customer);
        lenient().when(botService.getCustomer("mrifqyz17")).thenReturn(java.util.Optional.ofNullable(customer));
    }

    @Test
    public void testSellerRepositoryGetSeller(){
        botService.addSeller(seller);
        lenient().when(botService.getSeller("subur")).thenReturn(java.util.Optional.ofNullable(seller));
    }

    @Test
    public void testItemRepositoryGetItem(){
        botService.addItem(item);
        lenient().when(botService.getItem("NGP")).thenReturn(java.util.Optional.ofNullable(item));
    }

    @Test
    public void testReviewRepositoryGetReview(){
        botService.addReview(review);
        lenient().when(botService.getReview("R01")).thenReturn(java.util.Optional.ofNullable(review));
    }

    @Test
    public void testCustomerRepositoryGetAllCustomer(){
        botService.addCustomer(customer);
        List<Customer> customerList = botService.getAllCustomer();
        lenient().when(botService.getAllCustomer()).thenReturn(customerList);
    }

    @Test
    public void testSellerRepositoryGetAllSeller(){
        botService.addSeller(seller);
        List<Seller> sellerList = botService.getAllSeller();
        lenient().when(botService.getAllSeller()).thenReturn(sellerList);
    }

    @Test
    public void testItemRepositoryGetAllItem(){
        botService.addItem(item);
        List<Item> itemList = botService.getAllItem();
        lenient().when(botService.getAllItem()).thenReturn(itemList);
    }

    @Test
    public void testReviewRepositoryGetAllReview(){
        botService.addReview(review);
        List<Review> reviewList = botService.getAllReview();
        lenient().when(botService.getAllReview()).thenReturn(reviewList);
    }

    @Test
    public void testCustomerRepositoryDeleteCustomer(){
        botService.addCustomer(customer);
        botService.deleteCustomer("mrifqyz17");
        lenient().when(botService.getCustomer("mrifqyz17")).thenReturn(null);
    }

    @Test
    public void testSellerRepositoryDeleteSeller(){
        botService.addSeller(seller);
        botService.deleteSeller("subur");
        lenient().when(botService.getSeller("subur")).thenReturn(null);
    }

    @Test
    public void testItemRepositoryDeleteItem(){
        botService.addItem(item);
        botService.deleteItem("NGP");
        lenient().when(botService.getItem("NGP")).thenReturn(null);
    }

    @Test
    public void testReviewRepositoryDeleteReview(){
        botService.addReview(review);
        botService.deleteReview("R01");
        lenient().when(botService.getReview("R01")).thenReturn(null);
    }

    @Test
    public void testCustomerRepositoryUpdateCustomer(){
        botService.addCustomer(customer);
        customer = new Customer("mrifqyz17", "aa enoy", "087777535288");
        lenient().when(botService.updateCustomer(customer)).thenReturn(customer);
    }

    @Test
    public void testSellerRepositoryUpdateSeller(){
        botService.addSeller(seller);
        seller = new Seller("subur", "minum jamu", "14045170700",
                "SAW", "14045170700");
        lenient().when(botService.updateSeller(seller)).thenReturn(seller);
    }

    @Test
    public void testItemRepositoryUpdateItem(){
        botService.addItem(item);
        item = new Item(1, "NGP", "Nasi Goreng Pete", 15000, seller);
        lenient().when(botService.updateItem(item)).thenReturn(item);
    }

    @Test
    public void testReviewRepositoryUpdateReview(){
        botService.addReview(review);
        review = new Review("R01", "Bagus", item);
        lenient().when(botService.updateReview(review)).thenReturn(review);
    }
}
