package io.github.philippeboisney.retrokotlin.di

import android.arch.lifecycle.ViewModel
import android.arch.lifecycle.ViewModelProvider
import com.halit.gazete.viewmodel.NewsDetailsViewModel
import com.halit.gazete.viewmodel.NewsHomeViewModel
import com.halit.gazete.viewmodel.ViewModelFactory
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class ViewModelModule {

    @Binds
    internal abstract fun bindViewModelFactory(factory: ViewModelFactory): ViewModelProvider.Factory

    @Binds
    @IntoMap
    @ViewModelKey(NewsHomeViewModel::class)
    internal abstract fun postMainViewModel(viewModel: NewsHomeViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(NewsDetailsViewModel::class)
    internal abstract fun postNewsFavViewModel(viewModel: NewsDetailsViewModel): ViewModel
}