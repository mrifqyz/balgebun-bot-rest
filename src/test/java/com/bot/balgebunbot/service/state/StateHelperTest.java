package com.bot.balgebunbot.service.state;

import com.bot.balgebunbot.service.state.customer.*;
import com.bot.balgebunbot.service.state.order.OrderAcceptedState;
import com.bot.balgebunbot.service.state.order.OrderCookingState;
import com.bot.balgebunbot.service.state.order.OrderDeliveredState;
import com.bot.balgebunbot.service.state.order.OrderFinishedState;
import com.bot.balgebunbot.service.state.seller.SellerAcceptingOrderState;
import com.bot.balgebunbot.service.state.seller.SellerRegisteredState;
import com.bot.balgebunbot.service.state.seller.SellerUnregisteredState;
import com.bot.balgebunbot.model.DummyUser;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.*;

class StateHelperTest {

    @Autowired
    private CustomerRegisteredState customerRegisteredState;

    @Autowired
    private CustomerUnregisteredState customerUnregisteredState;

    @Autowired
    private CustomerConfirmedOrderState customerConfirmedOrderState;

    @Autowired
    private CustomerPayedState customerPayedState;

    @Autowired
    private CustomerOrderingState customerOrderingState;

    @Autowired
    private SellerRegisteredState sellerRegisteredState;

    @Autowired
    private SellerUnregisteredState sellerUnregisteredState;

    @Autowired
    private SellerAcceptingOrderState sellerAcceptingOrderState;

    @Autowired
    private OrderFinishedState orderFinishedState;

    @Autowired
    private OrderDeliveredState orderDeliveredState;

    @Autowired
    private OrderCookingState orderCookingState;

    @Autowired
    private OrderAcceptedState orderAcceptedState;



    StateHelper stateHelper;
    DummyUser dummyUser;

    @BeforeEach
    void setUp() {
        stateHelper =  new StateHelper();
        dummyUser = new DummyUser("dummy");
    }

    @Test
    void toState() {
        assertEquals(customerRegisteredState, stateHelper.toState(CustomerRegisteredState.DB_COL_NAME));
        assertEquals(customerOrderingState, stateHelper.toState(CustomerOrderingState.DB_COL_NAME));
        assertEquals(customerPayedState, stateHelper.toState(CustomerPayedState.DB_COL_NAME));
        assertEquals(customerUnregisteredState, stateHelper.toState(CustomerUnregisteredState.DB_COL_NAME));
        assertEquals(customerConfirmedOrderState, stateHelper.toState(CustomerConfirmedOrderState.DB_COL_NAME));

        assertEquals(sellerAcceptingOrderState, stateHelper.toState(SellerAcceptingOrderState.DB_COL_NAME));
        assertEquals(sellerRegisteredState, stateHelper.toState(SellerRegisteredState.DB_COL_NAME));
        assertEquals(sellerUnregisteredState, stateHelper.toState(SellerUnregisteredState.DB_COL_NAME));

        assertEquals(orderAcceptedState, stateHelper.toState(OrderAcceptedState.DB_COL_NAME));
        assertEquals(orderCookingState, stateHelper.toState(OrderCookingState.DB_COL_NAME));
        assertEquals(orderDeliveredState, stateHelper.toState(OrderDeliveredState.DB_COL_NAME));
        assertEquals(orderFinishedState, stateHelper.toState(OrderFinishedState.DB_COL_NAME));

        assertNull(stateHelper.toState("test"));
    }

    @Test
    void getCustomerState() {
        assertEquals(customerRegisteredState, stateHelper.getCustomerState(dummyUser));
    }
}