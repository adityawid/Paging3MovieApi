package com.adityawidayanto.paging3movieapi.ui.home

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.adityawidayanto.paging3movieapi.ui.movielist.MovieListFragment
import com.adityawidayanto.paging3movieapi.ui.tvshowlist.TvShowListFragment

class HomeVPAdapter(fragment: Fragment) : FragmentStateAdapter(fragment) {
    override fun getItemCount(): Int = 2 // jumlah tab / fragment

    override fun createFragment(position: Int): Fragment {
        return if (position == 0){
            MovieListFragment()
        }else {
            TvShowListFragment()
        }
    }
}