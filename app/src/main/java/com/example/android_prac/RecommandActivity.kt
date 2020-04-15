package com.example.android_prac

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class RecommandActivity : AppCompatActivity() {
    private lateinit var dogRecyclerViewAdapter : DogRecyclerViewAdapter
    private lateinit var rvDogRepo : RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recommand)

        setRecyclerView()
    }

    private fun setRecyclerView(){
        var dataList : ArrayList<DogData> = ArrayList()

        //다른것과 같이 메모리를 가져옴
        rvDogRepo = findViewById(R.id.rv_recommand)

        //this로 현재 context를 전달
        dogRecyclerViewAdapter = DogRecyclerViewAdapter(this, dataList)

        //recyclerview에 adapter 설정
        rvDogRepo.adapter= dogRecyclerViewAdapter

        //viewHolder들이 어떻게 배치될지 설정
        rvDogRepo.layoutManager = GridLayoutManager(this,2) as RecyclerView.LayoutManager?


        dataList.add(DogData("말티즈", 3, "치석이 있으며 건강", "서울시 용산구"))
        dataList.add(DogData("말티즈", 3, "치석이 있으며 건강", "서울시 용산구"))
        dataList.add(DogData("말티즈", 3, "치석이 있으며 건강", "서울시 용산구"))
        dataList.add(DogData("말티즈", 3, "치석이 있으며 건강", "서울시 용산구"))
        dataList.add(DogData("말티즈", 3, "치석이 있으며 건강", "서울시 용산구"))
        dataList.add(DogData("말티즈", 3, "치석이 있으며 건강", "서울시 용산구"))
        dataList.add(DogData("말티즈", 3, "치석이 있으며 건강", "서울시 용산구"))
        dataList.add(DogData("말티즈", 3, "치석이 있으며 건강", "서울시 용산구"))

        //데이터를 변경했다고 알려줘서 리스트를 갱신할 수 있도록
        dogRecyclerViewAdapter.notifyDataSetChanged()
    }
}
