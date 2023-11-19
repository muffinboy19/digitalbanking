package com.digitalbanking.app.modules.transactionstabcontainer.ui

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.digitalbanking.app.R
import com.digitalbanking.app.appcomponents.di.MyApp
import com.digitalbanking.app.modules.transactions.ui.TransactionsFragment
import kotlin.Int
import kotlin.String
import kotlin.collections.List

class TransactionsTabContainerActivityPagerAdapter(
    val fragmentManager: FragmentManager,
    val lifecycle: Lifecycle
) : FragmentStateAdapter(fragmentManager, lifecycle) {
    override fun getItemCount(): Int = viewPages.size

    override fun createFragment(position: Int): Fragment = viewPages[position]

    companion object AdapterConstant {
        val title: List<String> =
                listOf(MyApp.getInstance().resources.getString(R.string.msg_all_transaction),MyApp.getInstance().resources.getString(R.string.lbl_income),MyApp.getInstance().resources.getString(R.string.lbl_expense))

        val viewPages: List<Fragment> =
                listOf(TransactionsFragment(),TransactionsFragment(),TransactionsFragment())

    }
}
