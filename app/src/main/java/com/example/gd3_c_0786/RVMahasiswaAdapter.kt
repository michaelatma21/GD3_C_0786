package com.example.gd3_c_0786

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.gd3_c_0786.entity.Mahasiswa

class RVMahasiswaAdapter (private val data: Array<Mahasiswa>) : RecyclerView.Adapter<RVMahasiswaAdapter.viewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): viewHolder{
        // menghubungkan layout item dengan recycler view
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.rv_item_mahasiswa, parent, false)
        return viewHolder(itemView)
    }

    override fun onBindViewHolder(holder: viewHolder, position: Int) {
        val currentItem = data [position]
        holder.tvNama.text = currentItem.name
        holder.tvDetails.text = "${currentItem.tahunMasuk} - ${currentItem.IPK}"
    }

    override fun getItemCount(): Int {
        // memberitahu jumlah item pada recycler view kita
        return data.size
    }

    // Kelas ini berguna untuk menghubungkan view view yang ada pada item di recycler view kita
    class viewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val tvNama : TextView = itemView.findViewById(R.id.tv_nama)
        val tvDetails : TextView = itemView.findViewById(R.id.tv_details)
    }

}