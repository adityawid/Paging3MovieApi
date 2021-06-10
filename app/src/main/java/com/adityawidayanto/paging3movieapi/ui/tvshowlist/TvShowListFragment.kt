package com.adityawidayanto.paging3movieapi.ui.tvshowlist

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.adityawidayanto.paging3movieapi.R

class TvShowListFragment : Fragment() {

    companion object {
        fun newInstance() = TvShowListFragment()
    }

    private lateinit var viewModel: TvShowListViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.tv_show_list_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(TvShowListViewModel::class.java)
        // TODO: Use the ViewModel
    }

}