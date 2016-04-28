package com.example.android.justjava;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;


/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends ActionBarActivity {
    private int quantity = 0;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the order button is clicked.
     */
    public void submitOrder(View view) {
        int price = quantity * 5;
        String priceMessage = "Price: $" + (price)+"\nThank you!";
        displayMessage(priceMessage);
        //displayPrice(this.quantity * 5);
    }

    public void increment(View view) {
        this.quantity++;
        display(this.quantity);
        //displayPrice(this.quantity * 5);
    }

    public void decrement(View view) {
        --this.quantity;

        if (this.quantity < 0) {
            this.quantity = 0;
            display(this.quantity);
            //displayPrice(this.quantity * 5);
        } else {
            display(this.quantity);
            //displayPrice(this.quantity * 5);
        }
    }

    /**
     * This method displays the given quantity value on the screen.
     */
    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }

    /**
     * This method displays the given price on the screen.
     */
    private void displayPrice(int number) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    }

    private void displayMessage(String message) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(message);
    }

}