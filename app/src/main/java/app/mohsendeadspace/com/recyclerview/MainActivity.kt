package app.mohsendeadspace.com.recyclerview

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    var item_food= arrayOf("coffe","milk","apple","egg")
    var item_pics= arrayOf("https://freeiconshop.com/wp-content/uploads/edd/coffee-flat.png"
            ,"https://cdn2.iconfinder.com/data/icons/food-ink/512/milk2-512.png","https://freeiconshop.com/wp-content/uploads/edd/apple-flat-1.png",
            "https://cdn2.iconfinder.com/data/icons/thesquid-ink-40-free-flat-icon-pack/64/pan-512.png")


    var main_recyclerView:RecyclerView?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init()
        main_recyclerView!!.layoutManager=LinearLayoutManager(applicationContext,LinearLayoutManager.HORIZONTAL,true)
        main_recyclerView!!.adapter=Adapter(this,item_food,item_pics)


    }

    fun init(){
        main_recyclerView=findViewById(R.id.main_recyclerView)
    }

}
