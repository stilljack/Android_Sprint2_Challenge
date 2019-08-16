package com.lambdaschool.sprint2_challenge

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.util.Log
import com.lambdaschool.sprint2_challenge.ShoppingItemRepository.Companion.createShoppingList
import com.lambdaschool.sprint2_challenge.ShoppingItemRepository.Companion.shoppingList
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    //going to try some high level notes here like i saw vivek do last night, seemed good
    //step 1 object class (GroceryItems) to define what an individual items qualities will be
    //2: create a class to build a mutuable list of GroceryItems out of the two arrays provided in shoppingitemconstants
    // ShoppingItemRepository (my understanding of the word respository also grew last night, Vivek is a good teacher.)
    //2.X: call createShoppingList() onCreate in mainAcitivty to populate the mutable list
    //3: ok data seems sane, xml for the card view next
    //4: listadapter after some reverting and ironing out dependancies
    //5: add frame restrcited submit order button to xml layout
    //6: added onclick to items to indicate an order (green is selected -- white is unselected )
    //7:



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        createShoppingList()

        Log.i("testthelist","$shoppingList")

        recycle_view.setHasFixedSize(true)
        val manager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)
        val adapter = ShoppingListAdapter(shoppingList)
        recycle_view.layoutManager = manager
        recycle_view.adapter = adapter
    }
}
