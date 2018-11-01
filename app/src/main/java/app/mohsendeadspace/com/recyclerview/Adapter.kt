package app.mohsendeadspace.com.recyclerview

import android.content.Context
import android.content.Intent
import android.support.v7.widget.CardView
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide

class Adapter(private val context:Context,private val item_food:Array<String>,private val item_pics:Array<String>):RecyclerView.Adapter<RecyclerView.ViewHolder>(){


    internal inner class viewholder(itemView: View):RecyclerView.ViewHolder(itemView){

         var img_food:ImageView
         var txt_food:TextView
         var card:CardView

          init{
            txt_food= itemView.findViewById(R.id.txt_food)
            img_food= itemView.findViewById(R.id.img_food)
            card=itemView.findViewById(R.id.card)

        }

        fun bindview(item_food:String,item_pics:String){
            txt_food.text=item_food

            Glide.with(context).load(item_pics).into(img_food)


            card.setOnClickListener {

                var i=Intent(context,Item_info::class.java)
                i.putExtra("item_food",item_food)
                i.putExtra("item_pics",item_pics)
                context!!.startActivity(i)

            }


        }


    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): RecyclerView.ViewHolder {
        val layoutInflater=LayoutInflater.from(context)
        val view=layoutInflater.inflate(R.layout.item_food,parent,false)
        return viewholder(view)
    }


    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        (holder as viewholder).bindview(item_food[position],item_pics[position])
    }

    override fun getItemCount(): Int {
        return item_food.size
    }
}