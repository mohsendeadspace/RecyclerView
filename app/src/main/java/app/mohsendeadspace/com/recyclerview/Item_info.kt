package app.mohsendeadspace.com.recyclerview

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.item_food_info.*

class Item_info:AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.item_food_info)


        var bundle:Bundle=intent.extras
        var item_food=bundle.getString("item_food")
        var item_pics=bundle.getString("item_pics")
        txt_food.text=item_food
        Glide.with(this).load(item_pics).into(img_food)

    }
}