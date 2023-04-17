package com.example.myapplication.models;

import androidx.annotation.DrawableRes
import com.example.myapplication.R

data class Recipe (
val id : Long,
val title : String,
val ingredients:List<String>,
@DrawableRes
val imageResource:Int,
val method : List<String>
)

val pizza = Recipe (
    1,
    "Pizza",
    listOf("Pizza sauce\n" +
            "2 tbsp olive oil\n" +
            "1/2 cup finely chopped onion\n" +
            "2tbsp garlic\n" +
            "2 large tomato puree(skin peeled)\n" +
            "1/2 tsp black pepper\n" +
            "1tbsp dry Italian herbs( oregano, parsley, thyme)\n" +
            "1tsp chili flacks\n" +
            "1/2 tsp salt\n" +
            "1/2 tsp sugar","2 cups flour\n" +
            "1tsp yeast\n" +
            "1/2 tsp salt\n" +
            "1/2 tsp sugar\n" +
            "2tbsp olive oil\n" +
            "100-120ml water(1/2 -3/4 cup)depending on the type of flour and weather. make a stiff dough"),
     R.drawable.pizza, listOf("To make pizza sauce saute onion and garlic until translucent then add tomato puree and other herbs\n" +
            "cook the sauce until thickens\n" +
            "to make pizza dough mix all ingredients for dough in a bowl\n" +
            "knead until smooth\n" +
            "because it's a quick pizza we won't wait until it rises to double, instead roll the dough according to the size of your pizza pan then set it in the pan\n" +
            "cover the pan and rest for 15 -20 mins in a warm place\n" +
            "then spread the sauce on top of the pizza\n" +
            "add cheese, toppings of your choice then cheese again \n" +
            "bake for 20 mins 250°C(480°F) for a crispy base bake 10 mins on the lower rack and 10 mins on the middle if you have a table top oven and enjoy")
)
val yummyrecipes = listOf(pizza)