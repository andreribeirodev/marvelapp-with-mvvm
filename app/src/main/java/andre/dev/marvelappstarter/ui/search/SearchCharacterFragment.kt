package andre.dev.marvelappstarter.ui.search

import andre.dev.marvelappstarter.databinding.FragmentSearchCharacterBinding
import andre.dev.marvelappstarter.ui.base.BaseFragment
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.fragment.app.viewModels

class SearchCharacterFragment :
    BaseFragment<FragmentSearchCharacterBinding, SearchCharacterViewModel>() {
    override val viewModel: SearchCharacterViewModel by viewModels()

    override fun getViewBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentSearchCharacterBinding =
        FragmentSearchCharacterBinding.inflate(inflater, container, false)
}
