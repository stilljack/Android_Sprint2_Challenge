package com.lambdaschool.sprint2_challenge

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.lambdaschool.sprint2_challenge.ShoppingItemRepository.Companion.createShoppingList
import com.lambdaschool.sprint2_challenge.ShoppingItemRepository.Companion.shoppingList

class MainActivity : AppCompatActivity() {

    //going to try some high level notes here like i saw vivek do last night, seemed good
    //step 1 object class (GroceryItems) to define what an individual items qualities will be
    //2: create a class to build a mutuable list of GroceryItems out of the two arrays provided in shoppingitemconstants
    // ShoppingItemRepository (my understanding of the word respository also grew last night, Vivek is a good teacher.)
    //2.X: call createShoppingList() onCreate in mainAcitivty to populate the mutable list
    //3: ok data seems sane, xml for the card view next



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        createShoppingList()

        Log.i("testthelist","$shoppingList")
    }
}
