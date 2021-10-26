package br.com.edijanio.myfood.adapter

import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import br.com.edijanio.myfood.R
import br.com.edijanio.myfood.fragment.MarketplaceFragment

class TabViewPagerAdapter(activity: FragmentActivity) : FragmentStateAdapter(activity) {
    val tabs = arrayOf(R.string.restaurants, R.string.marketplaces, R.string.drinks)
    val fragments = arrayOf(MarketplaceFragment(), MarketplaceFragment(), MarketplaceFragment())

    override fun getItemCount() = fragments.size

    override fun createFragment(position: Int) = fragments[position]

}
