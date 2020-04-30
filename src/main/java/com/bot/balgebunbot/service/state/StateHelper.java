package com.bot.balgebunbot.service.state;


import com.bot.balgebunbot.service.state.customer.*;
import com.bot.balgebunbot.service.state.order.OrderAcceptedState;
import com.bot.balgebunbot.service.state.order.OrderCookingState;
import com.bot.balgebunbot.service.state.order.OrderDeliveredState;
import com.bot.balgebunbot.service.state.order.OrderFinishedState;
import com.bot.balgebunbot.service.state.seller.*;
import com.bot.balgebunbot.model.DummyUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class StateHelper {

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

    public State toState(String stateString){

        switch(stateString){

            case CustomerRegisteredState.DB_COL_NAME:
                return customerRegisteredState;

            case CustomerUnregisteredState.DB_COL_NAME:
                return customerUnregisteredState;

            case CustomerOrderingState.DB_COL_NAME:
                return customerOrderingState;

            case CustomerConfirmedOrderState.DB_COL_NAME:
                return customerConfirmedOrderState;

            case CustomerPayedState.DB_COL_NAME:
                return customerPayedState;


            case SellerRegisteredState.DB_COL_NAME:
                return sellerRegisteredState;

            case SellerUnregisteredState.DB_COL_NAME:
                return sellerUnregisteredState;

            case SellerAcceptingOrderState.DB_COL_NAME:
                return sellerAcceptingOrderState;


            case OrderAcceptedState.DB_COL_NAME:
                return orderAcceptedState;

            case OrderDeliveredState.DB_COL_NAME:
                return orderDeliveredState;

            case OrderCookingState.DB_COL_NAME:
                return orderCookingState;

            case OrderFinishedState.DB_COL_NAME:
                return orderFinishedState;

            default:
                return null;
        }
    }

    public State getCustomerState(DummyUser dummyUser){
        return toState(dummyUser.getState());
    }
}
