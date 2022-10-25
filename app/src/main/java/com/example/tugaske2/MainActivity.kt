package com.example.tugaske2


import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView



class MainActivity : AppCompatActivity() {

    lateinit var adapter: ItemAdapter
    lateinit var context: Context
    lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        context = this
        recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
        recyclerView.layoutManager = LinearLayoutManager(this)

        val models = ArrayList<DataModel>()

        models.add(DataModel(R.drawable.resqy_hedy_kurnaiwan,"Resqy Hedy Kurniawan", "2011117", ))
        models.add(DataModel(R.drawable.abdila,"Abdila", "2011026",))
        models.add(DataModel(R.drawable.ahmad_bayu_nugroho,"Ahmad Bayu Nugraha","1611046"))
        models.add(DataModel(R.drawable.ananda_nur_hisanah, "Ananda Nur Hisana", "2011028"))
        models.add(DataModel(R.drawable.dwi, "Dwi Apriliyani Ningtyas", "2011007"))
        models.add(DataModel(R.drawable.mega, "Mega", "2011076"))
        models.add(DataModel(R.drawable.praditama_aditya_pramono, "Praditama Aditya Pramono", "2011050"))
        models.add(DataModel(R.drawable.sayid_ridho_yahya, "Sayid Ridho Yahya", "2011020"))
        models.add(DataModel(R.drawable.selamat_zaman_arsyide, "Selamat Zaman Arsyide","2011040"))
        models.add(DataModel(R.drawable.rsz_wanda_idzharul_haq, "Wanda Idzharul Haq", "2011010"))
        models.add(DataModel(R.drawable.dickyjonathanlychandra, "Dicky Jonathan Lychandra", "2011067"))
        models.add(DataModel(R.drawable.indah_azhari, "Indah Azhari","2011054"))
        models.add(DataModel(R.drawable.oky,"Oky Mei Shinta","2011107"))
        models.add(DataModel(R.drawable.muhammad_rizal,"Muhammad Rizal","2011032"))
        models.add(DataModel(R.drawable.rsz_riyadh,"Riyadh Asjad Mulyadi", "2011058"))
        models.add(DataModel(R.drawable.alya, "Alya'a Habibah", "2011029"))
        models.add(DataModel(R.drawable.fathur, "Muhammad Fathur", "2011090"))
        models.add(DataModel(R.drawable.rahmadi,"Rahmadi", "2011017"))
        models.add(DataModel(R.drawable.bravosamuel, "BravoSamuel", "1811021"))
        models.add(DataModel(R.drawable.rsz_1rahmaddianto,"Muhammad rahmaddianto","2011031"))
        models.add(DataModel(R.drawable.dinda, "Dinda Aulia","2011011"))
        models.add(DataModel(R.drawable.rsz_agusrofi, "Agus Rofi'i","2011009"))

        adapter = ItemAdapter(context, models)
        recyclerView.adapter = adapter

        adapter.OnItemClick = {
            val intent = Intent(this, DetailedActivity::class.java)
            intent.putExtra("datax", it)
            startActivity(intent)
        }

    }
}