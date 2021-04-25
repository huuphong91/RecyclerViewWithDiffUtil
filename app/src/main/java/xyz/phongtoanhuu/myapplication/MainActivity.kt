package xyz.phongtoanhuu.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import xyz.phongtoanhuu.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private lateinit var mainAdapter: MainAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initRecyclerView()
        viewList()
    }

    private fun viewList() {
        val list = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10).asList()
        mainAdapter.differ.submitList(list)

    }

    private fun initRecyclerView() {
        mainAdapter = MainAdapter()
        binding.rvList.apply {
            adapter = mainAdapter
            layoutManager = LinearLayoutManager(this@MainActivity)
        }
    }
}